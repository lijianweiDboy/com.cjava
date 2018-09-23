package com.cjava.test;



import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

import com.cjava.webservice.KangDu;
public class mytest {
   public static void main(String[] args) throws SQLException, ParseException { 
	KangDu kd=new KangDu();
	kd.getSampleInfos(new Date(new Date().getTime() - 20*24*3600*1000L),new Date());
	kd.getResult();
}
}
