package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Everthingaboutselenium {

	public static void main(String[] args) {
		
 //System.setProperty(" webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Selenium material\\Chromedriver.exe");
   
   
   
 WebDriverManager.chromedriver().setup();
  
  WebDriver driver= new ChromeDriver();
  
  driver.navigate().to("https://www.globalsqa.com");
  
  driver.manage().window().maximize();
  

	}

}
