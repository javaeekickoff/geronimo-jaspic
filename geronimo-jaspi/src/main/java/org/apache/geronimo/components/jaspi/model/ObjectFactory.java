//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.07.15 at 04:13:34 PM PDT 
//


package org.apache.geronimo.components.jaspi.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.geronimo.xml.ns.geronimo_jaspi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Jaspi_QNAME = new QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "jaspi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.geronimo.xml.ns.geronimo_jaspi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JaspiType }
     * 
     */
    public JaspiType createJaspiType() {
        return new JaspiType();
    }

    /**
     * Create an instance of {@link ServerAuthContextType }
     * 
     */
    public ServerAuthContextType createServerAuthContextType() {
        return new ServerAuthContextType();
    }

    /**
     * Create an instance of {@link AuthModuleType }
     * 
     */
    public AuthModuleType createAuthModuleType() {
        return new AuthModuleType();
    }

    /**
     * Create an instance of {@link ServerAuthConfigType }
     * 
     */
    public ServerAuthConfigType createServerAuthConfigType() {
        return new ServerAuthConfigType();
    }

    /**
     * Create an instance of {@link TargetType }
     * 
     */
    public TargetType createTargetType() {
        return new TargetType();
    }

    /**
     * Create an instance of {@link MessagePolicyType }
     * 
     */
    public MessagePolicyType createMessagePolicyType() {
        return new MessagePolicyType();
    }

    /**
     * Create an instance of {@link ClientAuthContextType }
     * 
     */
    public ClientAuthContextType createClientAuthContextType() {
        return new ClientAuthContextType();
    }

    /**
     * Create an instance of {@link ConfigProviderType }
     * 
     */
    public ConfigProviderType createConfigProviderType() {
        return new ConfigProviderType();
    }

    /**
     * Create an instance of {@link TargetPolicyType }
     * 
     */
    public TargetPolicyType createTargetPolicyType() {
        return new TargetPolicyType();
    }

    /**
     * Create an instance of {@link ClientAuthConfigType }
     * 
     */
    public ClientAuthConfigType createClientAuthConfigType() {
        return new ClientAuthConfigType();
    }

    /**
     * Create an instance of {@link ProtectionPolicyType }
     * 
     */
    public ProtectionPolicyType createProtectionPolicyType() {
        return new ProtectionPolicyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JaspiType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://geronimo.apache.org/xml/ns/geronimo-jaspi", name = "jaspi")
    public JAXBElement<JaspiType> createJaspi(JaspiType value) {
        return new JAXBElement<JaspiType>(_Jaspi_QNAME, JaspiType.class, null, value);
    }

}
