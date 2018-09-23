package com.cjava.webservice;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.tempuri.IHospitalInterfaceProxy;
import com.cjava.dbconnnect.DbConnect;
import com.cjava.dom4j.Dom4jTool;

/**
 * @author CJAVA
 * 康都接口数据处理
 */
public class KangDu {
	public List<Element> sampleInfos;
	public List<Element> sampleResult;
	public List<Element> nodeResult; 
	public List<Element> CommonResultTable;
	public Element HosBarcode = null;//杏林妙手体检编号
	public Element SubItemCode = null;//项目编号
	public Element ItemName = null;//项目名称
	public Element TestResult =null;//康都检验结果
	public Element UnitName =null;//单位
	public Element ReferenceValue = null;//参考范围;
	public Element SHR = null;//检验医生
	public Element TestTime = null;//检验日期
	public Element HLFlag = null;//高低标识
	public Element CZY = null;//操作人
	public String insertsql = null;//SQL
	public SimpleDateFormat dateParse=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
	public SimpleDateFormat dateFormat=new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
	public SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
	public static Connection conn=DbConnect.connectSQLSERVER("10.90.1.49:1433", "tj_xlms", "xlmsuser", "topsky");
	public static Statement sta =null;
    /**
     * @return 康都WEBSERVSER对象
     */
    public static IHospitalInterfaceProxy getInstance()
    { 
      try {
		sta=conn.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  	
	  return new IHospitalInterfaceProxy();
	  
	}   
  
	/**
	 * @param date 检验报告时间段的开始时间 
	 * @param date2 检验报告时间段的结束时间
	 * @return 
	 */
	public void getSampleInfos(java.util.Date date,java.util.Date date2) {
		
		String xml = null;
		try {
			xml = this.getInstance().loadLIMSSampleInfosGetResult(sdf.format(date), sdf.format(date2), "J19149", "123456", "J19149");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Element root = null;
		try {
			root = DocumentHelper.parseText(xml).getRootElement();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sampleInfos=Dom4jTool.ListElement(root, "SampleInfo");
	}

	/**
	 * @return
	 * @throws ParseException 
	 * @throws SQLException 
	 */
	public void getResult() throws SQLException, ParseException {
		 for(int i= 0;i<sampleInfos.size();i++) {
			 Element e = sampleInfos.get(i);
			 Element Barcode = e.element("Barcode");
			 Element SampleNo = e.element("SampleNo");
			 HosBarcode = e.element("HosBarcode");
			 String xml = null;  
	            //第二接口获取处理开始
	            try {
					xml=this.getInstance().ILoadLIMSSampleSpecialResultAudited(Barcode.getStringValue(), SampleNo.getStringValue(), "J19149", "123456", "J19149");
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            //System.out.println(xml);
	            Element root = null;
				try {
					root = DocumentHelper.parseText(xml).getRootElement();
				} catch (DocumentException e1) {
					 System.out.println("XML转换失败");
				}//获取xml数跟
				if(root!=null){
	            //sampleResult=Dom4jTool.ListElement(root, "SampleResult");//获取SampleResult所有元素NodeResult  康都说不用这节点
	            //nodeResult=Dom4jTool.ListElement(root, "NodeResult");//获取SampleResult所有元素NodeResult 康都说不用这节点
	            CommonResultTable=Dom4jTool.ListElement(root, "CommonResultTable");//获取SampleResult所有元素NodeResult 
				}
				complteInsert(HosBarcode.getStringValue());
		 	}
	}
       public void insertData(String HosBarcode) throws SQLException {        
           for(int z= 0;z<CommonResultTable.size();z++) {
      	   	 Element e3 = CommonResultTable.get(z);
      	   	TestResult= e3.element("TestResult");//康都检验结果
	             if(TestResult!=null&&TestResult.getStringValue().length()>=1) {
	             SubItemCode = e3.element("SubItemCode");//康都项目代码
	             if(SubItemCode.getStringValue().equals("5300")) {SubItemCode.setText("5336");}
	             ItemName = e3.element("ItemName");//康都项目名称
	             TestResult = e3.element("TestResult");//康都检验结果
	             UnitName = e3.element("UnitName");//单位
	             ReferenceValue = e3.element("ReferenceValue");//参考范围;
	             if(ReferenceValue==null) {
	            	 e3.addElement("ReferenceValue");
	            	 ReferenceValue = e3.element("ReferenceValue");
	             }else {
	             ReferenceValue.setText(ReferenceValue.getStringValue().replaceAll("&lt;", "<"));
	             ReferenceValue.setText(ReferenceValue.getStringValue().replaceAll("&gt;", ">"));
	             }
	             SHR = e3.element("审核人姓名");//审核医生
	             TestTime = e3.element("CreateDate");//检验日期
	             HLFlag = e3.element("HLFlag");//高低标识
	             CZY = e3.element("检查人姓名");//检验医生
	             
	             if(HLFlag==null) {
	            	 insertsql= "INSERT INTO futian_user.tj_jyjgb (djlsh,xmbh,xmmc,JG,DW,CKFW,SHR,SHRQ,prompt,CZY) "
								+ "VALUES('"+HosBarcode+"','"+
								SubItemCode.getStringValue()+"','"+
								ItemName.getStringValue()+"'"+ ",'"+
								TestResult.getStringValue()+"','"+
								UnitName.getStringValue()+"','"+
								ReferenceValue.getStringValue()+"','"+
								SHR.getStringValue()+"',"+ "'"+
								Date.valueOf(TestTime.getStringValue().substring(0, 10))+"','  ',"+ "'"+
								CZY.getStringValue()+"')";
	            	 }else {
	            		 
	             
	             try {
					insertsql= "INSERT INTO futian_user.tj_jyjgb (djlsh,xmbh,xmmc,JG,DW,CKFW,SHR,SHRQ,prompt,CZY) "
								+ "VALUES('"+HosBarcode+"','"+SubItemCode.getStringValue()+"','"+ItemName.getStringValue()+"'"
								+ ",'"+TestResult.getStringValue()+"','"+UnitName.getStringValue()+"','"+ReferenceValue.getStringValue()+"','"+SHR.getStringValue()+"',"
										+ "'"+dateFormat.format(dateParse.parse(TestTime.getStringValue()))+"','"+HLFlag.getStringValue()+"',"
												+ "'"+CZY.getStringValue()+"')";
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            	 }
	             sta.execute("delete futian_user.tj_jyjgb where djlsh='"+HosBarcode+"' and xmbh='"+SubItemCode.getStringValue()+"'");
	             sta.execute(insertsql);
	             System.out.println("CommonResultTable:"+insertsql);
	            }else {
	            	//System.out.println(e2.asXML());
	            }
	            }
           sta.close();
           conn.close();
       }
       public void complteInsert(String HosBarcode) throws SQLException, ParseException {   
    		   for(int z= 0;z<CommonResultTable.size();z++) {
    			   Element e3 = CommonResultTable.get(z);
		      	   	TestResult= e3.element("TestResult");//康都检验结果
			             if(TestResult!=null&&TestResult.getStringValue().length()>=1) {
			             SubItemCode = e3.element("SubItemCode");//康都项目代码
			             if(SubItemCode.getStringValue().equals("5300")) {SubItemCode.setText("5336");}
			             ItemName = e3.element("ItemName");//康都项目名称
			             TestResult = e3.element("TestResult");//康都检验结果
			             UnitName = e3.element("UnitName");//单位
			             ReferenceValue = e3.element("ReferenceValue");//参考范围;
			             if(ReferenceValue==null) {
			            	 e3.addElement("ReferenceValue");
			            	 ReferenceValue = e3.element("ReferenceValue");
			             }else {
			             ReferenceValue.setText(ReferenceValue.getStringValue().replaceAll("&lt;", "<"));
			             ReferenceValue.setText(ReferenceValue.getStringValue().replaceAll("&gt;", ">"));
			             }
			             SHR = e3.element("审核人姓名");//审核医生
			             TestTime = e3.element("CreateDate");//检验日期
			             if(HLFlag==null) {
			            	 e3.addElement("HLFlag");
			            	 HLFlag = e3.element("HLFlag");
			             }
			             
			             CZY = e3.element("检查人姓名");//检验医生
			             //第一步查询这个人登记的组合项目SELECT TJXMBH FROM futian_user.TJ_TJJLB where TJBH='118902' AND TJCS='1' AND LXBH='06'
			             String sql1="SELECT TJXMBH FROM TJ_TJJLB where TJBH=(SELECT TJBH FROM TJ_TJDJB where DJLSH='"+HosBarcode+"') AND TJCS='1' AND LXBH='06'";//查询出要传的组合项目
			             ResultSet zhxmbhs=sta.executeQuery(sql1);
			             String zhxmbh=null;
			             if(zhxmbhs.next()) {zhxmbh=zhxmbhs.getString("TJXMBH");}
			             if(zhxmbh!=null){
			            //第二步查询出组合项中有哪些明细项编号 SELECT TJXM  FROM TJ_TJJLMXB WHERE TJZHXM='0697'
			             String sql2="SELECT TJXMBH FROM TJ_TJJLB where TJBH=(SELECT TJXM  FROM TJ_TJJLMXB WHERE TJZHXM='0697'";//查询出要传的组合项目
			             ResultSet tjxmbh=sta.executeQuery(sql2);
			             while(tjxmbh.next()) {
			            	    System.out.println(tjxmbh);
			             }
			             
			             
			             
			             }
			           //第三步匹配数据，插入表
			             System.out.println("查询出要传的组合项目:"+sql1);
			             ResultSet res2=sta.executeQuery(sql1);
			    		   while(res2.next()) {
			    			   String  TJBH=res2.getString("TJXMBH");
			    			   Statement sta1 =conn.createStatement();  
			        			   String updataSql="UPDATE TJ_TJJLMXB SET JG = '"+TestResult.getStringValue()+"', JCRQ = '"+dateFormat.format(dateParse.parse(TestTime.getStringValue()))+"', JCYS = '"+CZY.getStringValue()+"', TS = '"+HLFlag.getStringValue()+"', DW = '"+UnitName.getStringValue()+"', CKZ = '"+ReferenceValue.getStringValue()+"' WHERE "
			        			   		+ "XH = "+res2.getString("XH")+" "
			        			   				+ "AND TJXM = '' ";
			        			   System.out.println(updataSql);
                                   
			    			   //sta.execute(updataSql);
			    			   
			    		   }
					
					}
    	   }	   
       }
}
