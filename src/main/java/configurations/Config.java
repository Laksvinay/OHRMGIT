package configurations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {

	public static String getPropertyValue(String ProprtyName) {
		  // TODO Auto-generated method stub
		  FileReader input=null;
		  
		  try {
		    input=new FileReader("C:\\Users\\laksh\\eclipse-workspace\\SeleniumFrameworkInt\\src\\main\\java\\configurations\\configurations");
		  } catch (FileNotFoundException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  
		  Properties p=new Properties();
		  
		  try {
		   p.load(input);
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  
		   return p.getProperty(ProprtyName);
		 

		 }
}
