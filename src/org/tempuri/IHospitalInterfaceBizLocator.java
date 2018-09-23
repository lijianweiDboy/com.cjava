/**
 * IHospitalInterfaceBizLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class IHospitalInterfaceBizLocator extends org.apache.axis.client.Service implements org.tempuri.IHospitalInterfaceBiz {

    public IHospitalInterfaceBizLocator() {
    }


    public IHospitalInterfaceBizLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IHospitalInterfaceBizLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IHospitalInterface
    private java.lang.String BasicHttpBinding_IHospitalInterface_address = "http://www.kdclilab.com:8093/IHospitalInterface";

    public java.lang.String getBasicHttpBinding_IHospitalInterfaceAddress() {
        return BasicHttpBinding_IHospitalInterface_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IHospitalInterfaceWSDDServiceName = "BasicHttpBinding_IHospitalInterface";

    public java.lang.String getBasicHttpBinding_IHospitalInterfaceWSDDServiceName() {
        return BasicHttpBinding_IHospitalInterfaceWSDDServiceName;
    }

    public void setBasicHttpBinding_IHospitalInterfaceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IHospitalInterfaceWSDDServiceName = name;
    }

    public org.tempuri.IHospitalInterface getBasicHttpBinding_IHospitalInterface() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IHospitalInterface_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IHospitalInterface(endpoint);
    }

    public org.tempuri.IHospitalInterface getBasicHttpBinding_IHospitalInterface(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.BasicHttpBinding_IHospitalInterfaceStub _stub = new org.tempuri.BasicHttpBinding_IHospitalInterfaceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IHospitalInterfaceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IHospitalInterfaceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IHospitalInterface_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.IHospitalInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.BasicHttpBinding_IHospitalInterfaceStub _stub = new org.tempuri.BasicHttpBinding_IHospitalInterfaceStub(new java.net.URL(BasicHttpBinding_IHospitalInterface_address), this);
                _stub.setPortName(getBasicHttpBinding_IHospitalInterfaceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_IHospitalInterface".equals(inputPortName)) {
            return getBasicHttpBinding_IHospitalInterface();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "IHospitalInterfaceBiz");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_IHospitalInterface"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IHospitalInterface".equals(portName)) {
            setBasicHttpBinding_IHospitalInterfaceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
