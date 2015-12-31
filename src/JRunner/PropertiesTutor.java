package JRunner;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

public class PropertiesTutor extends Tutor {

    /**
     * Returns the value of system property java.version
     */
    public String getJavaVersion() {
        String version = System.getProperty("java.version");
        return version;
    }

    @Test
    public void testJavaVersion() {
        String version = getJavaVersion();
        log(getJavaVersion());
        assertTrue(version.startsWith("1."));
    }

    /**
     * Loads properties-file from folder files/props.properties
     * and returns the loaded properties
     * @return
     */
    public Properties getProperties() {


        Properties prop = new Properties();
        try {
            InputStream inStream = new FileInputStream("files/props.properties");
            prop.load(inStream);
        } catch (IOException e){

        }
        System.out.print(prop);

        return prop;
    }

    @Test
    public void testGetProperties() {
        Properties props = getProperties();
        log("country="+props.getProperty("country"));
        log("color="+props.getProperty("color"));
        assertEquals("Australia", props.getProperty("country"));
        assertEquals("red", props.getProperty("color"));
    }

}
