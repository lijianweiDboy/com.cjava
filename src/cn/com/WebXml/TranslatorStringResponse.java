/**
 * TranslatorStringResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.WebXml;

public class TranslatorStringResponse  implements java.io.Serializable {
    private java.lang.String[] translatorStringResult;

    public TranslatorStringResponse() {
    }

    public TranslatorStringResponse(
           java.lang.String[] translatorStringResult) {
           this.translatorStringResult = translatorStringResult;
    }


    /**
     * Gets the translatorStringResult value for this TranslatorStringResponse.
     * 
     * @return translatorStringResult
     */
    public java.lang.String[] getTranslatorStringResult() {
        return translatorStringResult;
    }


    /**
     * Sets the translatorStringResult value for this TranslatorStringResponse.
     * 
     * @param translatorStringResult
     */
    public void setTranslatorStringResult(java.lang.String[] translatorStringResult) {
        this.translatorStringResult = translatorStringResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TranslatorStringResponse)) return false;
        TranslatorStringResponse other = (TranslatorStringResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.translatorStringResult==null && other.getTranslatorStringResult()==null) || 
             (this.translatorStringResult!=null &&
              java.util.Arrays.equals(this.translatorStringResult, other.getTranslatorStringResult())));
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
        if (getTranslatorStringResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranslatorStringResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranslatorStringResult(), i);
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
        new org.apache.axis.description.TypeDesc(TranslatorStringResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">TranslatorStringResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translatorStringResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "TranslatorStringResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "string"));
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
