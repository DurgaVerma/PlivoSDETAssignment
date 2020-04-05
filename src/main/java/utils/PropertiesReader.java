package utils;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;

public class PropertiesReader {

	private Properties prop;

    public PropertiesReader() {

        prop = new Properties();

        try 
        {
            String env = System.getProperty("env");

            if (null == env) env = "integration";

            Reporter.log(String.format("\n Selected environment is %s", env),true);
            
            String propertiesFilePath = env + ".properties";

            try 
            {
            	prop.load(new FileInputStream(String.format("./src/main/resources/slackProperties/%s", propertiesFilePath)));
			} 
            catch (Exception e) 
            {
				Reporter.log("Not able to load prpoertyfile, Please check the path or file name",true);
				e.printStackTrace();
			}
        }
        catch (Exception e) {
        	e.printStackTrace();
		}
            
              
    }
    
    public Properties getProperties() {
        return prop;
    }

    public String getSlackApiHost() {
        return prop.getProperty("slackApiHost");
    }
    
   
}