/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.07.15 at 04:13:34 PM PDT 
//


package org.apache.geronimo.components.jaspi.model;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.message.config.AuthConfigFactory;
import javax.security.auth.message.config.AuthConfigProvider;
import javax.security.auth.message.config.RegistrationListener;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.geronimo.components.jaspi.impl.ConfigProviderImpl;
import org.apache.geronimo.osgi.locator.ProviderLocator;


/**
 * <p>Java class for configProviderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configProviderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageLayer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *             &lt;element name="properties" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="clientAuthConfig" type="{http://geronimo.apache.org/xml/ns/geronimo-jaspi}clientAuthConfigType" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="serverAuthConfig" type="{http://geronimo.apache.org/xml/ns/geronimo-jaspi}serverAuthConfigType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="persistent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="classLoaderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "configProvider", namespace = "http://geronimo.apache.org/xml/ns/geronimo-jaspi")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configProviderType", propOrder = {
    "messageLayer",
    "appContext",
    "description",
    "className",
    "properties",
    "clientAuthConfig",
    "serverAuthConfig",
    "persistent",
    "classLoaderName"
})
public class ConfigProviderType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;

    protected String messageLayer;
    protected String appContext;
    protected String description;
    protected String className;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(StringMapAdapter.class)
    protected Map<String, String> properties;
    private List<ClientAuthConfigType> clientAuthConfig;
    private List<ServerAuthConfigType> serverAuthConfig;
    protected Boolean persistent = Boolean.FALSE;
    protected String classLoaderName;


    public ConfigProviderType() {
    }

    public ConfigProviderType(String messageLayer, String appContext, boolean persistent, AuthConfigFactory authConfigFactory) {
        this.messageLayer = messageLayer;
        this.appContext = appContext;
        this.persistent = persistent;
    }

    /**
     * Gets the value of the messageLayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageLayer() {
        return messageLayer;
    }

    /**
     * Sets the value of the messageLayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageLayer(String value) {
        this.messageLayer = value;
    }

    /**
     * Gets the value of the appContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppContext() {
        return appContext;
    }

    /**
     * Sets the value of the appContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppContext(String value) {
        this.appContext = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Map<String, String> getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties(Map<String, String> value) {
        this.properties = value;
    }

    /**
     * Gets the value of the clientAuthConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientAuthConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientAuthConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientAuthConfigType }
     * 
     * @return map of id to client auth config
     */
    public List<ClientAuthConfigType> getClientAuthConfig() {
        if (clientAuthConfig == null) {
            clientAuthConfig = new ArrayList<ClientAuthConfigType>();
        }
        return clientAuthConfig;
    }

    /**
     * Gets the value of the serverAuthConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serverAuthConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerAuthConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServerAuthConfigType }
     * 
     * @return map of id to server auth config
     */
    public List<ServerAuthConfigType> getServerAuthConfig() {
        if (serverAuthConfig == null) {
            serverAuthConfig = new ArrayList<ServerAuthConfigType>();
        }
        return serverAuthConfig;
    }

    /**
     * Gets the value of the persistent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPersistent() {
        return persistent;
    }

    /**
     * Sets the value of the persistent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersistent(boolean value) {
        this.persistent = value;
    }

    public String getClassLoaderName() {
        return classLoaderName;
    }

    public void setClassLoaderName(String classLoaderName) {
        this.classLoaderName = classLoaderName;
    }

    public static String getRegistrationKey(String layer, String appContext) {
        return layer + "/" + appContext;
    }

    public String getKey() {
        return getRegistrationKey(getMessageLayer(), getAppContext());
    }

}
