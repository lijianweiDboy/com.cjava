/**
 * IHospitalInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IHospitalInterface extends java.rmi.Remote {
    public java.lang.String loadLIMSSampleInfos(java.lang.String startDate, java.lang.String endDate, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException;
    public java.lang.String loadLIMSSampleInfosByWhere(java.lang.String startDate, java.lang.String endDate, java.lang.String barCode, java.lang.String pathologyNo, java.lang.String patientName, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException;
    public java.lang.String loadDataSetSchema(java.lang.String barCode, java.lang.String sampleNo, java.lang.String labGroup, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException;
    public java.lang.String loadDataSetSchemaForHPV21(java.lang.String barCode, java.lang.String sampleNo, java.lang.String labGroup, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException;
    public void updateHasLoadStatus(java.lang.String barCode, java.lang.String sampleNo, java.lang.String labGroup, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException;
    public java.lang.String updateHospitalCommonResult(java.lang.String barCode, java.lang.String sampleNo, java.lang.String labGroup, java.lang.String subItemStr, java.lang.String resultXML, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException;
    public java.lang.String updateHospitalPDFResult(java.lang.String barCode, java.lang.String sampleNo, java.lang.String labGroup, java.lang.String subItemStr, byte[] PDFArr, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException;
    public java.lang.String ISetSampleInfoDelay(java.lang.String barCode, java.lang.String testSampleID, java.lang.String opReason, java.lang.String delayRptDate, java.lang.String isCreateCurrentReport, java.lang.String isCreateDelayReport, java.lang.String creator, java.lang.String createDate, java.lang.String creatorName, java.lang.String delegateHosCode, java.lang.String loginCode, java.lang.String loginPWD) throws java.rmi.RemoteException;
    public java.lang.String ISetSampleInfoReturn(java.lang.String barCode, java.lang.String testSampleID, java.lang.String applyItemNames, java.lang.String opReason, java.lang.String creator, java.lang.String createDate, java.lang.String creatorName, java.lang.String delegateHosCode, java.lang.String loginCode, java.lang.String loginPWD) throws java.rmi.RemoteException;
    public java.lang.String ISetSampleInfoAddItem(java.lang.String barCode, java.lang.String testSampleID, java.lang.String applyItemNames, java.lang.String opReason, java.lang.String creator, java.lang.String createDate, java.lang.String creatorName, java.lang.String delegateHosCode, java.lang.String loginCode, java.lang.String loginPWD) throws java.rmi.RemoteException;
    public java.lang.String ISetSampleInfoReturnItem(java.lang.String barCode, java.lang.String testSampleID, java.lang.String applyItemCodes, java.lang.String opReason, java.lang.String creator, java.lang.String createDate, java.lang.String creatorName, java.lang.String delegateHosCode, java.lang.String loginCode, java.lang.String loginPWD) throws java.rmi.RemoteException;
    public java.lang.String ILoadLIMSSampleInfoAudited(java.lang.String startDate, java.lang.String endDate, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String hosCode) throws java.rmi.RemoteException;
    public java.lang.String ILoadLIMSSampleResultAudited(java.lang.String barCode, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String hosCode) throws java.rmi.RemoteException;
    public java.lang.String ILoadLIMSSampleSpecialResultAudited(java.lang.String barCode, java.lang.String sampleNo, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String hosCode) throws java.rmi.RemoteException;
    public java.lang.String ILoadLIMSSampleResultReportAudited(java.lang.String barCode, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String hosCode) throws java.rmi.RemoteException;
    public java.lang.String loadLIMSSampleInfosGetResult(java.lang.String startDate, java.lang.String endDate, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException;
    public java.lang.String login(java.lang.String cname, java.lang.String key) throws java.rmi.RemoteException;
    public java.lang.String getReportByBarcode(java.lang.String barCode, java.lang.String sessionKey) throws java.rmi.RemoteException;
    public void updateHasTransResultStatus(java.lang.String barCode, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException;
    public java.lang.String uploadSampleInfoAndApplyItem(java.lang.String strXML) throws java.rmi.RemoteException;
    public java.lang.String IHospitalSendSampleInfo(java.lang.String jsonInfo, java.lang.String labCenterCode) throws java.rmi.RemoteException;
    public java.lang.String IHospitalGetTCTResult(java.lang.String barCode) throws java.rmi.RemoteException;
    public java.lang.String IHospitalGetHPVResult(java.lang.String barCode) throws java.rmi.RemoteException;
    public java.lang.String getHMtctbg(java.lang.String barCode) throws java.rmi.RemoteException;
    public java.lang.String getHMzzblbg(java.lang.String barCode) throws java.rmi.RemoteException;
    public java.lang.String getHMhpvbg(java.lang.String barCode) throws java.rmi.RemoteException;
    public java.lang.String insertAbuttingJoint(byte[] dsArry) throws java.rmi.RemoteException;
    public byte[] getSampleInfoResult(java.lang.String centerCode) throws java.rmi.RemoteException;
    public java.lang.String IHospitalPicInsert(java.lang.String sampleId, java.lang.String imageType, java.lang.String imageName, byte[] imageStream, java.lang.String imageSort) throws java.rmi.RemoteException;
    public java.lang.String ILoadLIMSSampleSpecialResultAuditedByApplyCode(java.lang.String barCode, java.lang.String patientName, java.lang.String applyItemCode, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String hosCode) throws java.rmi.RemoteException;
    public java.lang.String uploadAbuttingJoint(java.lang.String strXml) throws java.rmi.RemoteException;
    public java.lang.String updateHospitalPDFResultForGZOM(java.lang.String barCode, java.lang.String PDFArrBase64, java.lang.String serialNumber, java.lang.String loginCode, java.lang.String loginPWD, java.lang.String delegateHosCode) throws java.rmi.RemoteException;
}
