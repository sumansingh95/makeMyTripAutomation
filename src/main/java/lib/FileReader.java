package lib;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileReader{
    public static Map<String, String> readProperties(final String path) {
        Properties prop = new Properties();
        Map<String, String> propMap = new HashMap<String, String>();
        InputStream input = null;
        try {
            input = new FileInputStream(path);
            prop.load(input);
        } catch (IOException e) {
            System.out.println("Exception at readproperties:"+ e);
        }

        for (java.util.Map.Entry<Object, Object> entries : prop.entrySet()) {
            propMap.put((String) entries.getKey(), (String) entries.getValue());
        }
        return propMap;
    }
}
