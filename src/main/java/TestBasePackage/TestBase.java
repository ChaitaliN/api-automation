package TestBasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	
	public Properties prop;
	
	
	public TestBase()
	{
		prop=new Properties();
	
		try {	
		FileInputStream ip=new FileInputStream("/Users/chaitu/workspace/api-automation/src/main/java/config/config.properties");
		
			prop.load(ip);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		} 
		
		}

}
