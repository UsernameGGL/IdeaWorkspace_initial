/**
 * WeatherQueryServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public class WeatherQueryServiceLocator extends org.apache.axis.client.Service implements com.WeatherQueryService {

    public WeatherQueryServiceLocator() {
    }


    public WeatherQueryServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WeatherQueryServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WeatherQuery
    private java.lang.String WeatherQuery_address = "http://localhost:8080/services/WeatherQuery";

    public java.lang.String getWeatherQueryAddress() {
        return WeatherQuery_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WeatherQueryWSDDServiceName = "WeatherQuery";

    public java.lang.String getWeatherQueryWSDDServiceName() {
        return WeatherQueryWSDDServiceName;
    }

    public void setWeatherQueryWSDDServiceName(java.lang.String name) {
        WeatherQueryWSDDServiceName = name;
    }

    public com.WeatherQuery_PortType getWeatherQuery() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WeatherQuery_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWeatherQuery(endpoint);
    }

    public com.WeatherQuery_PortType getWeatherQuery(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.WeatherQuerySoapBindingStub _stub = new com.WeatherQuerySoapBindingStub(portAddress, this);
            _stub.setPortName(getWeatherQueryWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWeatherQueryEndpointAddress(java.lang.String address) {
        WeatherQuery_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.WeatherQuery_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.WeatherQuerySoapBindingStub _stub = new com.WeatherQuerySoapBindingStub(new java.net.URL(WeatherQuery_address), this);
                _stub.setPortName(getWeatherQueryWSDDServiceName());
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
        if ("WeatherQuery".equals(inputPortName)) {
            return getWeatherQuery();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://example", "WeatherQueryService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://example", "WeatherQuery"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WeatherQuery".equals(portName)) {
            setWeatherQueryEndpointAddress(address);
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
