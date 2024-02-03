package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contains reusable to initialize and read data from properties file
 * 
 * @author supri
 */

public class PropertiesUtility {
	private Properties property;

	/**
	 * This method is used initialize properties file
	 * 
	 * @param filePath
	 */

	public void propertiesInit(String filePath) {
		FileInputStream fis = null;
		try {

			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
		property = new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	/**
	 * this method fetches data from properties file based on the key passed
	 * 
	 * @param key
	 * @return
	 */
	public String readFromProperties(String key) {
		return property.getProperty(key);

	}
}
