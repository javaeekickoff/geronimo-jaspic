
package sxc.org.apache.geronimo.components.jaspi.model;

import java.util.Map;
import javax.xml.XMLConstants;
import javax.xml.namespace.QName;
import com.envoisolutions.sxc.jaxb.FieldAccessor;
import com.envoisolutions.sxc.jaxb.JAXBObject;
import com.envoisolutions.sxc.jaxb.LifecycleCallback;
import com.envoisolutions.sxc.jaxb.RuntimeContext;
import com.envoisolutions.sxc.util.Attribute;
import com.envoisolutions.sxc.util.XoXMLStreamReader;
import com.envoisolutions.sxc.util.XoXMLStreamWriter;
import org.apache.geronimo.components.jaspi.model.ConfigProviderType;
import org.apache.geronimo.components.jaspi.model.StringMapAdapter;

@SuppressWarnings({
    "StringEquality"
})
public class ConfigProviderTypeJAXB
    extends JAXBObject<ConfigProviderType>
{

    public final static ConfigProviderTypeJAXB INSTANCE = new ConfigProviderTypeJAXB();
    private final static LifecycleCallback lifecycleCallback = new LifecycleCallback(ConfigProviderType.class);
    private final static FieldAccessor<ConfigProviderType, String> configProviderTypeMessageLayer = new FieldAccessor<ConfigProviderType, String>(ConfigProviderType.class, "messageLayer");
    private final static FieldAccessor<ConfigProviderType, String> configProviderTypeAppContext = new FieldAccessor<ConfigProviderType, String>(ConfigProviderType.class, "appContext");
    private final static FieldAccessor<ConfigProviderType, String> configProviderTypeDescription = new FieldAccessor<ConfigProviderType, String>(ConfigProviderType.class, "description");
    private final static FieldAccessor<ConfigProviderType, String> configProviderTypeClassName = new FieldAccessor<ConfigProviderType, String>(ConfigProviderType.class, "className");
    private final static FieldAccessor<ConfigProviderType, Map<String, String>> configProviderTypeProperties = new FieldAccessor<ConfigProviderType, Map<String, String>>(ConfigProviderType.class, "properties");
    private final static FieldAccessor<ConfigProviderType, Boolean> configProviderTypePersistent = new FieldAccessor<ConfigProviderType, Boolean>(ConfigProviderType.class, "persistent");
    private final static FieldAccessor<ConfigProviderType, String> configProviderTypeClassLoaderName = new FieldAccessor<ConfigProviderType, String>(ConfigProviderType.class, "classLoaderName");
    private final static StringMapAdapter stringMapAdapterAdapter = new StringMapAdapter();

    public ConfigProviderTypeJAXB() {
        super(ConfigProviderType.class, null, new QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi".intern(), "configProviderType".intern()));
    }

    public static ConfigProviderType readConfigProviderType(XoXMLStreamReader reader, RuntimeContext context)
        throws Exception
    {
        return INSTANCE.read(reader, context);
    }

    public static void writeConfigProviderType(XoXMLStreamWriter writer, ConfigProviderType configProviderType, RuntimeContext context)
        throws Exception
    {
        INSTANCE.write(writer, configProviderType, context);
    }

    public final ConfigProviderType read(XoXMLStreamReader reader, RuntimeContext context)
        throws Exception
    {

        // Check for xsi:nil
        if (reader.isXsiNil()) {
            return null;
        }

        if (context == null) {
            context = new RuntimeContext();
        }

        ConfigProviderType configProviderType = new ConfigProviderType();
        context.beforeUnmarshal(configProviderType, lifecycleCallback);


        // Check xsi:type
        QName xsiType = reader.getXsiType();
        if (xsiType!= null) {
            if (("configProviderType"!= xsiType.getLocalPart())||("http://geronimo.apache.org/xml/ns/geronimo-jaspi"!= xsiType.getNamespaceURI())) {
                return context.unexpectedXsiType(reader, ConfigProviderType.class);
            }
        }

        // Read attributes
        for (Attribute attribute: reader.getAttributes()) {
            if (XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI!= attribute.getNamespace()) {
                context.unexpectedAttribute(attribute);
            }
        }

        // Read elements
        for (XoXMLStreamReader elementReader: reader.getChildElements()) {
            if (("messageLayer" == elementReader.getLocalName())&&("http://geronimo.apache.org/xml/ns/geronimo-jaspi" == elementReader.getNamespaceURI())) {
                // ELEMENT: messageLayer
                String messageLayer = elementReader.getElementAsString();
                configProviderTypeMessageLayer.setObject(reader, context, configProviderType, messageLayer);
            } else if (("appContext" == elementReader.getLocalName())&&("http://geronimo.apache.org/xml/ns/geronimo-jaspi" == elementReader.getNamespaceURI())) {
                // ELEMENT: appContext
                String appContext = elementReader.getElementAsString();
                configProviderTypeAppContext.setObject(reader, context, configProviderType, appContext);
            } else if (("description" == elementReader.getLocalName())&&("http://geronimo.apache.org/xml/ns/geronimo-jaspi" == elementReader.getNamespaceURI())) {
                // ELEMENT: description
                String description = elementReader.getElementAsString();
                configProviderTypeDescription.setObject(reader, context, configProviderType, description);
            } else if (("className" == elementReader.getLocalName())&&("http://geronimo.apache.org/xml/ns/geronimo-jaspi" == elementReader.getNamespaceURI())) {
                // ELEMENT: className
                String className = elementReader.getElementAsString();
                configProviderTypeClassName.setObject(reader, context, configProviderType, className);
            } else if (("properties" == elementReader.getLocalName())&&("http://geronimo.apache.org/xml/ns/geronimo-jaspi" == elementReader.getNamespaceURI())) {
                // ELEMENT: properties
                String propertiesRaw = elementReader.getElementAsString();

                Map properties;
                try {
                    properties = stringMapAdapterAdapter.unmarshal(propertiesRaw);
                } catch (Exception e) {
                    context.xmlAdapterError(elementReader, StringMapAdapter.class, Map.class, Map.class, e);
                    continue;
                }

                configProviderTypeProperties.setObject(reader, context, configProviderType, properties);
            } else if (("persistent" == elementReader.getLocalName())&&("http://geronimo.apache.org/xml/ns/geronimo-jaspi" == elementReader.getNamespaceURI())) {
                // ELEMENT: persistent
                Boolean persistent = ("1".equals(elementReader.getElementAsString())||"true".equals(elementReader.getElementAsString()));
                configProviderTypePersistent.setBoolean(reader, context, configProviderType, persistent);
            } else if (("classLoaderName" == elementReader.getLocalName())&&("http://geronimo.apache.org/xml/ns/geronimo-jaspi" == elementReader.getNamespaceURI())) {
                // ELEMENT: classLoaderName
                String classLoaderName = elementReader.getElementAsString();
                configProviderTypeClassLoaderName.setObject(reader, context, configProviderType, classLoaderName);
            } else {
                context.unexpectedElement(elementReader, new QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "messageLayer"), new QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "appContext"), new QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "description"), new QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "className"), new QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "properties"), new QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "persistent"), new QName("http://geronimo.apache.org/xml/ns/geronimo-jaspi", "classLoaderName"));
            }
        }

        context.afterUnmarshal(configProviderType, lifecycleCallback);

        return configProviderType;
    }

    public final void write(XoXMLStreamWriter writer, ConfigProviderType configProviderType, RuntimeContext context)
        throws Exception
    {
        if (configProviderType == null) {
            writer.writeXsiNil();
            return ;
        }

        if (context == null) {
            context = new RuntimeContext();
        }

        String prefix = writer.getUniquePrefix("http://geronimo.apache.org/xml/ns/geronimo-jaspi");
        if (ConfigProviderType.class!= configProviderType.getClass()) {
            context.unexpectedSubclass(writer, configProviderType, ConfigProviderType.class);
            return ;
        }

        context.beforeMarshal(configProviderType, lifecycleCallback);


        // ELEMENT: messageLayer
        String messageLayer = configProviderTypeMessageLayer.getObject(configProviderType, context, configProviderType);
        if (messageLayer!= null) {
            writer.writeStartElement(prefix, "messageLayer", "http://geronimo.apache.org/xml/ns/geronimo-jaspi");
            writer.writeCharacters(messageLayer);
            writer.writeEndElement();
        }

        // ELEMENT: appContext
        String appContext = configProviderTypeAppContext.getObject(configProviderType, context, configProviderType);
        if (appContext!= null) {
            writer.writeStartElement(prefix, "appContext", "http://geronimo.apache.org/xml/ns/geronimo-jaspi");
            writer.writeCharacters(appContext);
            writer.writeEndElement();
        }

        // ELEMENT: description
        String description = configProviderTypeDescription.getObject(configProviderType, context, configProviderType);
        if (description!= null) {
            writer.writeStartElement(prefix, "description", "http://geronimo.apache.org/xml/ns/geronimo-jaspi");
            writer.writeCharacters(description);
            writer.writeEndElement();
        }

        // ELEMENT: className
        String className = configProviderTypeClassName.getObject(configProviderType, context, configProviderType);
        if (className!= null) {
            writer.writeStartElement(prefix, "className", "http://geronimo.apache.org/xml/ns/geronimo-jaspi");
            writer.writeCharacters(className);
            writer.writeEndElement();
        } else {
            context.unexpectedNullValue(configProviderType, "className");
        }

        // ELEMENT: properties
        Map<String, String> propertiesRaw = configProviderTypeProperties.getObject(configProviderType, context, configProviderType);
        String properties = null;
        try {
            properties = stringMapAdapterAdapter.marshal(propertiesRaw);
        } catch (Exception e) {
            context.xmlAdapterError(configProviderType, "properties", StringMapAdapter.class, Map.class, Map.class, e);
        }
        if (properties!= null) {
            writer.writeStartElement(prefix, "properties", "http://geronimo.apache.org/xml/ns/geronimo-jaspi");
            writer.writeCharacters(properties);
            writer.writeEndElement();
        } else {
            context.unexpectedNullValue(configProviderType, "properties");
        }

        // ELEMENT: persistent
        Boolean persistent = configProviderTypePersistent.getBoolean(configProviderType, context, configProviderType);
        writer.writeStartElement(prefix, "persistent", "http://geronimo.apache.org/xml/ns/geronimo-jaspi");
        writer.writeCharacters(Boolean.toString(persistent));
        writer.writeEndElement();

        // ELEMENT: classLoaderName
        String classLoaderName = configProviderTypeClassLoaderName.getObject(configProviderType, context, configProviderType);
        if (classLoaderName!= null) {
            writer.writeStartElement(prefix, "classLoaderName", "http://geronimo.apache.org/xml/ns/geronimo-jaspi");
            writer.writeCharacters(classLoaderName);
            writer.writeEndElement();
        }

        context.afterMarshal(configProviderType, lifecycleCallback);
    }

}