package com.Qsoiders.Atlasian.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author SAMPATH P
 *
 */
public class FileUtility {
/**
 * It helps to read the data from property file in terms of value by supplying the key
 * @param key
 * @return keyValue
 * @throws IOException
 */
	public String readPropertyFileData(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/trellocommondata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String keyValue = pobj.getProperty(key);
		return keyValue;
	}
}
