package cn.johnyu.mymvc.framework.util;


import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by WhiteSaber on 15/8/17.
 */
public class PropertiesLoaderUtils {

    public static Properties loadDefaultProperties() throws IOException {
        Map<Object, Object> tableNameMap = new HashMap<>();
        String filename = "DispatcherServlet.properties";
        InputStream inputStream = PropertiesLoaderUtils.class.getClassLoader().getResourceAsStream(filename);
        try {
            return loadProperties(filename, inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Properties loadDefaultBeansXml() throws IOException {
        Map<Object, Object> tableNameMap = new HashMap<>();
        String filename = "dispatcher.xml";
        InputStream inputStream = PropertiesLoaderUtils.class.getClassLoader().getResourceAsStream(filename);
        try {
            return loadProperties(filename, inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Properties loadProperties(String filename, InputStream is) throws IOException {
        Properties props = new Properties();
        fillProperties(props, filename, is);
        return props;
    }

    public static void fillProperties(Properties props, String filename, InputStream is) throws IOException {
        try {
            if (filename != null && filename.endsWith(".xml")) {
                props.loadFromXML(is);
            } else {
                props.load(is);
            }
        } finally {
            is.close();
        }
    }

    @Test
    public void test() throws IOException {
        Properties properties = loadDefaultProperties();
        Properties properties1 = loadDefaultBeansXml();
        return;

    }
}
