package Selenium;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chalochalopracticekartehain {

	public static void main(String[] args) throws InterruptedException {
		
 //  System.setProperty(" webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Selenium material\\Chromedriver.exe");
   
    WebDriverManager.chromedriver().setup();
  
    WebDriver driver= new ChromeDriver();
  
    driver.navigate().to("www.amazon.com");
  
    driver.manage().window().maximize();
  
 // driver.navigate().to("https://demoqa.com/automation-practice-form");
   
  // driver.get("https://www.facebook.com");
   
  //driver.manage().window().maximize();
   
   Thread.sleep(3000);
   
   String URL= driver.getCurrentUrl();
   
   System.out.println("url is"+URL);
   
   String title=  driver.getTitle();
 
   System.out.println("title is"+title);
   
   String pagesource= driver.getPageSource();
 
   System.out.println("pagesource is"+pagesource);
   
   driver.navigate().back();
   
   driver.navigate().forward();
   
 //   driver.findElement(By.id("email")).sendKeys("9657051509");
    
 //   driver.findElement(By.id("pass")).sendKeys("shubhum");
   
//   driver.findElement(By.name("login")).click();
   
   
//  driver.findElement(By.xpath("//input[@type='text' or @id='firstName']")).sendKeys("Abhijeet");
   
  // driver.findElement(By.xpath("//input[@placeholder='Last Name' and @id='lastName']")).sendKeys("Wannale");
   
  //  driver.findElement(By.xpath("//input[contains(@placeholder,'name@example.com')]")).sendKeys("Abhijeetwannale@gmail.com");
    
   // driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
    
  // WebElement radioButton =  driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
    
 // boolean isSelect = radioButton.isSelected();
    
    //System.out.println("radiobutton"+isSelect);
    
    // boolean isDisplayed = radioButton.isDisplayed();
    
    // System.out.println("radiobutton"+isDisplayed);
    
    // boolean isEnabled = radioButton.isEnabled();
    
    //  System.out.println("radiobutton"+isEnabled);
    
    // radioButton.click();
    
    
   
  // driver.findElement(By.cssSelector("input#userNumber")).sendKeys("9145441306");
   
   JavascriptExecutor jse=(JavascriptExecutor)driver;
   
   jse.executeScript("window.scrollBy(0,400)");
   
   //WebElement currentaddress=driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
  
   // Actions actions=new Actions(driver);
  
   // actions.moveToElement(currentaddress);
  
   //actions.perform();
  
  
 // driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
  
 // WebElement checkbox = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
  
  // boolean isSelect1 = checkbox.isSelected();
  
  // System.out.println("checkbutton "+isSelect1);
  
  // boolean isDisplayed1 = checkbox.isDisplayed();
  
  // System.out.println("checkbutton "+isDisplayed1);
  
  //boolean isEnabled1 = checkbox.isEnabled();
  
  // System.out.println("checkbutton "+isEnabled1);
  
  //checkbox.click();
 
  // driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("At post Dapka gundopant tq mukhed dist nanded");
 
  //   dropdown (select class)
   
  // driver.navigate().to("https://demoqa.com/select-menu");
   
  //Select select=new Select( driver.findElement(By.id("oldSelectMenu")));
   
  // WebElement dropdown2=  driver.findElement(By.id("oldSelectMenu"));
   
  // Select select2= new Select(dropdown2);
   
   
  
  //using select by value
  
 // select.selectByValue("5");
  
  //using select by index
  
 // select.selectByIndex(5);
  
//using select by visible text
  
// select2.selectByVisibleText("Purple");
  
 // WebElement xyz=driver.findElement(By.id("cars"));                 //               website for dropdown
  
  // Actions actions=new Actions(driver);                               //   imp     //https://demo.automationtesting.in/Register.html
                                                                               
                                                                      //                Website for alert
   
  // actions.moveToElement(xyz);                                     //     imp    //https://nxtgenaiacademy.com/alertandpopup/
 
   //actions.perform();                                        https://chercher.tech/practice/practice-pop-ups-selenium-webdriver
  
 // multiselect dropdown
  
   //WebElement dropdown = driver.findElement(By.id("cars"));
  
   // Select select1= new Select(dropdown);
  
   // select1.selectByValue("volvo");
  
   //select1.selectByIndex(2);
  
   //select1.selectByVisibleText("Audi");
  
//  Alert 
   
   //driver.navigate().to("https://demoqa.com/alerts");
   
  // driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
   
  // window handle
   
 //  driver.navigate().to("https//www.globalsqa.com");
   
   
   
   
   
  
  
  
 
   
   
  
 
   
   
   
   
   
   
	}

}





