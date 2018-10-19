/**
 * TranslatorSentenceStringResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.WebXml;

public class TranslatorSentenceStringResponse  implements java.io.Serializable {
    private java.lang.String[] translatorSentenceStringResult;

    public TranslatorSentenceStringResponse() {
    }

    public TranslatorSentenceStringResponse(
           java.lang.String[] translatorSentenceStringResult) {
           this.translatorSentenceStringResult = translatorSentenceStringResult;
    }


    /**
     * Gets the translatorSentenceStringResult value for this TranslatorSentenceStringResponse.
     * 
     * @return translatorSentenceStringResult
     */
    public java.lang.String[] getTranslatorSentenceStringResult() {
        return translatorSentenceStringResult;
    }


    /**
     * Sets the translatorSentenceStringResult value for this TranslatorSentenceStringResponse.
     * 
     * @param translatorSentenceStringResult
     */
    public void setTranslatorSentenceStringResult(java.lang.String[] translatorSentenceStringResult) {
        this.translatorSentenceStringResult = translatorSentenceStringResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TranslatorSentenceStringResponse)) return false;
        TranslatorSentenceStringResponse other = (TranslatorSentenceStringResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.translatorSentenceStringResult==null && other.getTranslatorSentenceStringResult()==null) || 
             (this.translatorSentenceStringResult!=null &&
              java.util.Arrays.equals(this.translatorSentenceStringResult, other.getTranslatorSentenceStringResult())));
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
        if (getTranslatorSentenceStringResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranslatorSentenceStringResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranslatorSentenceStringResult(), i);
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
        new org.apache.axis.description.TypeDesc(TranslatorSentenceStringResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">TranslatorSentenceStringResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translatorSentenceStringResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "TranslatorSentenceStringResult"));
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
