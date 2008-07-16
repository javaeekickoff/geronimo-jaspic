//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.07.15 at 04:13:34 PM PDT 
//


package org.apache.geronimo.components.jaspi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;
import javax.security.auth.message.AuthException;
import javax.security.auth.message.AuthStatus;
import javax.security.auth.message.MessageInfo;
import javax.security.auth.message.module.ServerAuthModule;
import javax.security.auth.message.module.ClientAuthModule;
import javax.security.auth.message.config.ServerAuthContext;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serverAuthContextType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="serverAuthContextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageLayer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationContextID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serverAuthModule" type="{http://geronimo.apache.org/xml/ns/geronimo-jaspi}authModuleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serverAuthContextType", propOrder = {
        "messageLayer",
        "appContext",
        "authenticationContextID",
        "serverAuthModule"
        })
public class ServerAuthContextType
        implements ServerAuthContext, Serializable {

    private final static long serialVersionUID = 12343L;
    protected String messageLayer;
    protected String appContext;
    @XmlElement(required = true)
    protected String authenticationContextID;
    protected List<AuthModuleType<ServerAuthModule>> serverAuthModule;

    /**
     * Gets the value of the messageLayer property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getMessageLayer() {
        return messageLayer;
    }

    /**
     * Sets the value of the messageLayer property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMessageLayer(String value) {
        this.messageLayer = value;
    }

    /**
     * Gets the value of the appContext property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getAppContext() {
        return appContext;
    }

    /**
     * Sets the value of the appContext property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAppContext(String value) {
        this.appContext = value;
    }

    /**
     * Gets the value of the authenticationContextID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getAuthenticationContextID() {
        return authenticationContextID;
    }

    public String getAuthenticationContextID(MessageInfo messageInfo) {
        return authenticationContextID;
    }

    /**
     * Sets the value of the authenticationContextID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAuthenticationContextID(String value) {
        this.authenticationContextID = value;
    }

    /**
     * Gets the value of the serverAuthModule property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serverAuthModule property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerAuthModule().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthModuleType }
     */
    public List<AuthModuleType<ServerAuthModule>> getServerAuthModule() {
        if (serverAuthModule == null) {
            serverAuthModule = new ArrayList<AuthModuleType<ServerAuthModule>>();
        }
        return this.serverAuthModule;
    }

    public void cleanSubject(MessageInfo messageInfo, Subject subject) throws AuthException {
        for (AuthModuleType<ServerAuthModule> authModuleType: getServerAuthModule()) {
            ServerAuthModule serverAuthModule = authModuleType.getAuthModule();
            serverAuthModule.cleanSubject(messageInfo, subject);
        }
    }

    public AuthStatus secureResponse(MessageInfo messageInfo, Subject serviceSubject) throws AuthException {
        for (AuthModuleType<ServerAuthModule> authModuleType: getServerAuthModule()) {
            ServerAuthModule serverAuthModule = authModuleType.getAuthModule();
            AuthStatus result = serverAuthModule.secureResponse(messageInfo, serviceSubject);

            //jaspi spec p 86
            if (result == AuthStatus.SEND_SUCCESS) {
                continue;
            }
            if (result == AuthStatus.SEND_CONTINUE || result == AuthStatus.SEND_FAILURE) {
                return result;
            }
            throw new AuthException("Invalid AuthStatus " + result + " from server auth module: " + serverAuthModule);
        }
        return AuthStatus.SEND_SUCCESS;
    }

    public AuthStatus validateRequest(MessageInfo messageInfo, Subject clientSubject, Subject serviceSubject) throws AuthException {
        for (AuthModuleType<ServerAuthModule> authModuleType: getServerAuthModule()) {
            ServerAuthModule serverAuthModule = authModuleType.getAuthModule();
            AuthStatus result = serverAuthModule.validateRequest(messageInfo, clientSubject, serviceSubject);

            //jaspi spec p 88
            if (result == AuthStatus.SUCCESS) {
                continue;
            }
            if (result == AuthStatus.SEND_SUCCESS || result == AuthStatus.SEND_CONTINUE || result == AuthStatus.FAILURE) {
                return result;
            }
            throw new AuthException("Invalid AuthStatus " + result + " from server auth module: " + serverAuthModule);
        }
        return AuthStatus.SUCCESS;
    }
}
