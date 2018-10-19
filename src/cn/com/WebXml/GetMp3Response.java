/**
 * GetMp3Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.WebXml;

public class GetMp3Response  implements java.io.Serializable {
    private byte[] getMp3Result;

    public GetMp3Response() {
    }

    public GetMp3Response(
           byte[] getMp3Result) {
           this.getMp3Result = getMp3Result;
    }


    /**
     * Gets the getMp3Result value for this GetMp3Response.
     * 
     * @return getMp3Result
     */
    public byte[] getGetMp3Result() {
        return getMp3Result;
    }


    /**
     * Sets the getMp3Result value for this GetMp3Response.
     * 
     * @param getMp3Result
     */
    public void setGetMp3Result(byte[] getMp3Result) {
        this.getMp3Result = getMp3Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMp3Response)) return false;
        GetMp3Response other = (GetMp3Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMp3Result==null && other.getGetMp3Result()==null) || 
             (this.getMp3Result!=null &&
              java.util.Arrays.equals(this.getMp3Result, other.getGetMp3Result())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetMp3Result() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetMp3Result());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetMp3Result(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMp3Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">GetMp3Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMp3Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "GetMp3Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
