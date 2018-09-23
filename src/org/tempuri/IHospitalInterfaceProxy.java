package org.tempuri;

public class IHospitalInterfaceProxy implements org.tempuri.IHospitalInterface {
  private String _endpoint = null;
  private org.tempuri.IHospitalInterface iHospitalInterface = null;
  
  public IHospitalInterfaceProxy() {
    _initIHospitalInterfaceProxy();
  }
  
  public IHospitalInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIHospitalInterfaceProxy();
  }
  
  private void _initIHospitalInterfaceProxy() {
    try {
      iHospitalInterface = (new org.tempuri.IHospitalInterfaceBizLocator()).getBasicHttpBinding_IHospitalInterface();
      if (iHospitalInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iHospitalInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iHospitalInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iHospitalInterface != null)
      ((javax.xml.rpc.Stub)iHospitalInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IHospitalInterface getIHospitalInterface() {
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface;
  }
  
  public java.lang.String loadLIMSSampleInfos(java.lang.String startDate, java.lang.String endDate, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.loadLIMSSampleInfos(startDate, endDate, loginCode, loginPWD, delegateHosCode);
  }
  
  public java.lang.String loadLIMSSampleInfosByWhere(java.lang.String startDate, java.lang.String endDate, java.lang.String barCode, java.lang.String pathologyNo, java.lang.String patientName, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.loadLIMSSampleInfosByWhere(startDate, endDate, barCode, pathologyNo, patientName, loginCode, loginPWD, delegateHosCode);
  }
  
  public java.lang.String loadDataSetSchema(java.lang.String barCode, java.lang.String sampleNo, java.lang.String labGroup, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.loadDataSetSchema(barCode, sampleNo, labGroup, loginCode, loginPWD, delegateHosCode);
  }
  
  public java.lang.String loadDataSetSchemaForHPV21(java.lang.String barCode, java.lang.String sampleNo, java.lang.String labGroup, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.loadDataSetSchemaForHPV21(barCode, sampleNo, labGroup, loginCode, loginPWD, delegateHosCode);
  }
  
  public void updateHasLoadStatus(java.lang.String barCode, java.lang.String sampleNo, java.lang.String labGroup, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    iHospitalInterface.updateHasLoadStatus(barCode, sampleNo, labGroup, loginCode, loginPWD, delegateHosCode);
  }
  
  public java.lang.String updateHospitalCommonResult(java.lang.String barCode, java.lang.String sampleNo, java.lang.String labGroup, java.lang.String subItemStr, java.lang.String resultXML, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.updateHospitalCommonResult(barCode, sampleNo, labGroup, subItemStr, resultXML, loginCode, loginPWD, delegateHosCode);
  }
  
  public java.lang.String updateHospitalPDFResult(java.lang.String barCode, java.lang.String sampleNo, java.lang.String labGroup, java.lang.String subItemStr, byte[] PDFArr, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.updateHospitalPDFResult(barCode, sampleNo, labGroup, subItemStr, PDFArr, loginCode, loginPWD, delegateHosCode);
  }
  
  public java.lang.String ISetSampleInfoDelay(java.lang.String barCode, java.lang.String testSampleID, java.lang.String opReason, java.lang.String delayRptDate, java.lang.String isCreateCurrentReport, java.lang.String isCreateDelayReport, java.lang.String creator, java.lang.String createDate, java.lang.String creatorName, java.lang.String delegateHosCode, java.lang.String loginCode, java.lang.String loginPWD) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.ISetSampleInfoDelay(barCode, testSampleID, opReason, delayRptDate, isCreateCurrentReport, isCreateDelayReport, creator, createDate, creatorName, delegateHosCode, loginCode, loginPWD);
  }
  
  public java.lang.String ISetSampleInfoReturn(java.lang.String barCode, java.lang.String testSampleID, java.lang.String applyItemNames, java.lang.String opReason, java.lang.String creator, java.lang.String createDate, java.lang.String creatorName, java.lang.String delegateHosCode, java.lang.String loginCode, java.lang.String loginPWD) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.ISetSampleInfoReturn(barCode, testSampleID, applyItemNames, opReason, creator, createDate, creatorName, delegateHosCode, loginCode, loginPWD);
  }
  
  public java.lang.String ISetSampleInfoAddItem(java.lang.String barCode, java.lang.String testSampleID, java.lang.String applyItemNames, java.lang.String opReason, java.lang.String creator, java.lang.String createDate, java.lang.String creatorName, java.lang.String delegateHosCode, java.lang.String loginCode, java.lang.String loginPWD) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.ISetSampleInfoAddItem(barCode, testSampleID, applyItemNames, opReason, creator, createDate, creatorName, delegateHosCode, loginCode, loginPWD);
  }
  
  public java.lang.String ISetSampleInfoReturnItem(java.lang.String barCode, java.lang.String testSampleID, java.lang.String applyItemCodes, java.lang.String opReason, java.lang.String creator, java.lang.String createDate, java.lang.String creatorName, java.lang.String delegateHosCode, java.lang.String loginCode, java.lang.String loginPWD) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.ISetSampleInfoReturnItem(barCode, testSampleID, applyItemCodes, opReason, creator, createDate, creatorName, delegateHosCode, loginCode, loginPWD);
  }
  
  public java.lang.String ILoadLIMSSampleInfoAudited(java.lang.String startDate, java.lang.String endDate, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String hosCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.ILoadLIMSSampleInfoAudited(startDate, endDate, loginCode, loginPWD, hosCode);
  }
  
  public java.lang.String ILoadLIMSSampleResultAudited(java.lang.String barCode, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String hosCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.ILoadLIMSSampleResultAudited(barCode, loginCode, loginPWD, hosCode);
  }
  
  public java.lang.String ILoadLIMSSampleSpecialResultAudited(java.lang.String barCode, java.lang.String sampleNo, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String hosCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.ILoadLIMSSampleSpecialResultAudited(barCode, sampleNo, loginCode, loginPWD, hosCode);
  }
  
  public java.lang.String ILoadLIMSSampleResultReportAudited(java.lang.String barCode, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String hosCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.ILoadLIMSSampleResultReportAudited(barCode, loginCode, loginPWD, hosCode);
  }
  
  public java.lang.String loadLIMSSampleInfosGetResult(java.lang.String startDate, java.lang.String endDate, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.loadLIMSSampleInfosGetResult(startDate, endDate, loginCode, loginPWD, delegateHosCode);
  }
  
  public java.lang.String login(java.lang.String cname, java.lang.String key) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.login(cname, key);
  }
  
  public java.lang.String getReportByBarcode(java.lang.String barCode, java.lang.String sessionKey) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.getReportByBarcode(barCode, sessionKey);
  }
  
  public void updateHasTransResultStatus(java.lang.String barCode, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    iHospitalInterface.updateHasTransResultStatus(barCode, loginCode, loginPWD, delegateHosCode);
  }
  
  public java.lang.String uploadSampleInfoAndApplyItem(java.lang.String strXML) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.uploadSampleInfoAndApplyItem(strXML);
  }
  
  public java.lang.String IHospitalSendSampleInfo(java.lang.String jsonInfo, java.lang.String labCenterCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.IHospitalSendSampleInfo(jsonInfo, labCenterCode);
  }
  
  public java.lang.String IHospitalGetTCTResult(java.lang.String barCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.IHospitalGetTCTResult(barCode);
  }
  
  public java.lang.String IHospitalGetHPVResult(java.lang.String barCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.IHospitalGetHPVResult(barCode);
  }
  
  public java.lang.String getHMtctbg(java.lang.String barCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.getHMtctbg(barCode);
  }
  
  public java.lang.String getHMzzblbg(java.lang.String barCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.getHMzzblbg(barCode);
  }
  
  public java.lang.String getHMhpvbg(java.lang.String barCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.getHMhpvbg(barCode);
  }
  
  public java.lang.String insertAbuttingJoint(byte[] dsArry) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.insertAbuttingJoint(dsArry);
  }
  
  public byte[] getSampleInfoResult(java.lang.String centerCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.getSampleInfoResult(centerCode);
  }
  
  public java.lang.String IHospitalPicInsert(java.lang.String sampleId, java.lang.String imageType, java.lang.String imageName, byte[] imageStream, java.lang.String imageSort) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.IHospitalPicInsert(sampleId, imageType, imageName, imageStream, imageSort);
  }
  
  public java.lang.String ILoadLIMSSampleSpecialResultAuditedByApplyCode(java.lang.String barCode, java.lang.String patientName, java.lang.String applyItemCode, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String hosCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.ILoadLIMSSampleSpecialResultAuditedByApplyCode(barCode, patientName, applyItemCode, loginCode, loginPWD, hosCode);
  }
  
  public java.lang.String uploadAbuttingJoint(java.lang.String strXml) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.uploadAbuttingJoint(strXml);
  }
  
  public java.lang.String updateHospitalPDFResultForGZOM(java.lang.String barCode, java.lang.String PDFArrBase64, java.lang.String serialNumber, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException{
    if (iHospitalInterface == null)
      _initIHospitalInterfaceProxy();
    return iHospitalInterface.updateHospitalPDFResultForGZOM(barCode, PDFArrBase64, serialNumber, loginCode, loginPWD, delegateHosCode);
  }
  
  
}