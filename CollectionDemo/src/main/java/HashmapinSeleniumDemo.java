import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashmapinSeleniumDemo {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://classic.crmpro.com/index.html");
	 String credentialcustomer=getCredentialsMap().get("Customer");
	driver.findElement(By.name("username")).sendKeys(getUserName("Admin"));
	driver.findElement(By.name("password")).sendKeys(getPassword("Admin"));
	
	

	}
	
	
	public static HashMap<String, String> getCredentialsMap() {
		
	HashMap<String, String>	values= new HashMap<String,String>();
	values.put("Customer", "Monicagoyal:Nivin@123");
	values.put("Admin", "Naivedyagoyal:Mickey123");
	values.put("Distributor", "MukeshGoyal:Mukesh@123");
	return values;
	
		
		
		
		
	}
	
	public static String getUserName(String role) {
		
	String credentials=	getCredentialsMap().get(role);
	return credentials.split(":")[0];
		
	}

	
	public static String getPassword(String role) {
	String credentials=	getCredentialsMap().get(role);	
	return credentials.split(":")[1]; 	
		
	}
}
