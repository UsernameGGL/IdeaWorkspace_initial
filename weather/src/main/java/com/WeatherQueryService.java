/**
 * WeatherQueryService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public interface WeatherQueryService extends javax.xml.rpc.Service {
    public String getWeatherQueryAddress();

    public com.WeatherQuery_PortType getWeatherQuery() throws javax.xml.rpc.ServiceException;

    public com.WeatherQuery_PortType getWeatherQuery(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
