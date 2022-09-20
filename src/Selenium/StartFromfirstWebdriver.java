package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartFromfirstWebdriver {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		
	//	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\Selenium material.chromedriver.exe");
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
	//	driver.get("https://www.facebook.com");
		
	//	maximize the window
		
	//	driver.manage().window().maximize();
		
	//	Use of wait
		
	//	Thread.sleep(3000);
		
	//	print current url
		
	//	String url =driver.getCurrentUrl();
		
	//	System.out.println("url is "+url);
		
	//	to get the title ot the page
		
	//	String title=driver.getTitle();
		
	//	System.out.println("title is" +title);
		
	//	to get page source
		
	//	String PageSource=driver.getPageSource();
		
	//	System.out.println(" PageSource "+ PageSource);
		
	//	Use of navigate method
		
	//	for navigate to url
		
	//	driver.navigate().to("https://www.facebook.com");
		
	//	for navigate to back
		
	//	 driver.navigate().back();
		 
    //	for navigate to forward
		 
	//	 driver.navigate().forward();
		   
    //	use of locator id
		
	//	 driver.findElement(By.id("email")).sendKeys("9657051509");
		 
    //	use of locator Name
		 
	//	 driver.findElement(By.name("pass")).sendKeys("shubhum");
		 
	//	 use of locator Tagname
		 
	//	 driver.findElement(By.tagName("button")).click();
		 
    //  
	//		 driver.get("http://only-testing-blog.blogspot.com/2014/09/temp.html");
			
	//		 driver.manage().window().maximize();
			
	//		 Thread.sleep(3000);
		 
	//	     use of locator by class name
			
	//	 driver.findElement(By.id("user-name")).sendKeys("standard_user");
			
   //	     use of locator by normal x path
			
	//	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		
   //		 use of locator by normal multiple x path
		
		
	//	 driver.findElement(By.xpath("//input[@class='submit-button btn_action'][@id='login-button']")).click();
		 
   //	 use of locator by xpath with and
		 
   //	 driver.findElement(By.xpath("//input[@class='submit-button btn_action'and @id='login-button']")).click();
		
	//	 use of locator by xpath with or
		 
	//	 driver.findElement(By.xpath("//input[@class='submit-button btn_action'or @id='login-button']")).click();
		 
	//	 use of locator by xpath with contains
		 
	//	 driver.findElement(By.xpath("//input[contains(@class,'submit-button btn_action')]")).click();
		 
	//	 use of locator by xpath with starts-with
		 
	//	 driver.findElement(By.xpath("//input[starts-with(@class,'submit-button btn_action')]")).click();
		 
	//	 use of locator by  text
			 
			//input[@type='text'][last()]
		 
	//	 Thread.sleep(3000);
		 
	//	 driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
			 
	//		 use of locator by  text
			 
	//	driver.findElement(By.xpath("//input[@type='text'][last()]")).click();
			 
	//		 use of findelements= use this link for to use find elements sugarcrm.com/au/request-demo/
		
	//	 driver.get("https://demoqa.com/automation-practice-form");
			
	//	 driver.manage().window().maximize();
		
	//	 Thread.sleep(3000);
	 
	//	List<WebElement> Alltags= driver.findElements(By.tagName("a"));
		
	//	System.out.println("total tags are"+Alltags.size());
		
	//	for(int i=0;i<Alltags.size();i++);
		
	//	System.out.println("Links:"+Alltags.get(i).getAttribute("href"));
		
	//   how to handle checkbox 	
		
	//	 JavascriptExecutor jse=(JavascriptExecutor)driver;
		 
	//	 jse.executeScript("window.scrollBy(0,500)");
		 
	//	 Actions Act=new Actions(driver);
		 
	//	 WebElement currentaddress=driver.findElement(By.id("currentAddress"));
		 
	//	 Act.moveToElement(currentaddress).perform();
		 
	//	 Act.perform();
		 
	// WebElement checkbox=  driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
	 
	 //     checkbox.click();
		
	//	Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		
	//	System.out.println("checkbox is"+checkbox.isDisplayed());
		
	//	System.out.println("checkbox is"+checkbox.isEnabled());
		
	//	System.out.println("checkbox is"+checkbox.isSelected());
		
	//	List<WebElement> checkboxs=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
	//	System.out.println("all checkboxes on this page are"+checkboxs.size());
		
	//	How to handle radiobuttons
		
	//	WebElement radiobutton=driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
		
	//	      radiobutton.click();
		
	//	System.out.println("radiobutton is"+radiobutton.isDisplayed());
			 
	//	System.out.println("radiobutton is"+radiobutton.isEnabled());
		 
	//	System.out.println("radiobutton is"+radiobutton.isSelected());
		
	//List<WebElement> radiobuttons=	driver.findElements(By.xpath("//input[@type='radio']"));
	
	//System.out.println("Radiobuttons on the page are"+radiobuttons.size());
	
	//   how to handle dropdown by pavan
		

	//	 driver.get("https://www.opencart.com/index.php?route=account/register");
			
	//	 driver.manage().window().maximize();
		
	//	 Thread.sleep(3000);
	
	//	WebElement country= driver.findElement(By.id("input-country"));
		
	//	Select drpCountry = new Select(country);
		
	
	//	drpCountry.selectByIndex(3);
		
	//	Thread.sleep(2000);
		
	//	drpCountry.selectByValue("4");
		
	//	Thread.sleep(2000);
		
	//	drpCountry.selectByVisibleText("Angola");
		
//WebElement firstoption=drpCountry.getFirstSelectedOption();
		
	//	System.out.println(firstoption.getText());
		
		
	// how we can select the value without select by value ,index,and visible text method
		
	//	List<WebElement> AllOptions=drpCountry.getOptions();
		
	//	for(WebElement option:AllOptions)
			
	//	{
		
	//		if(option.getText().equals("Cuba"))
			
	//		{
				
	//		option.click();
			
	//		break;
			
	//		}
			
	//	}
		
	//		dropdown by software testing mentor
			

	//	 driver.get("https://demoqa.com/select-menu");
					
	//	 driver.manage().window().maximize();
				
	//			 Thread.sleep(3000);
				 
	//			 Actions act=new Actions(driver);
				 
	//	WebElement car=driver.findElement(By.id("cars"));
		
	//	act.moveToElement(car).perform();
			
	//	 WebElement multiledropdown=driver.findElement(By.id("cars"));
		 
	//	 Select sel=new Select(multiledropdown);
		 
	//	sel.selectByIndex(0);
		 
	//	 sel.selectByValue("opel");
		 
	//	 sel.selectByVisibleText("Audi");
		 
	//	List<WebElement> allselecteditems= sel.getAllSelectedOptions();
				
	//	 System.out.println("All selected options are"+allselecteditems);
		 
	//	 System.out.println(sel.getAllSelectedOptions().size());
		
	//	AutoSuggested Dropdown
		

	//		 driver.get("https://www.makemytrip.com/");
						
	//		 driver.manage().window().maximize();
					
	//				 Thread.sleep(3000);
					 
	//				 driver.findElement(By.xpath("//span[text()='From']")).click();
					 
	//				WebElement from =driver.findElement(By.xpath("//input[@placeholder='From']"));
					
	//				from.sendKeys("mumbai");
					 
	//				Thread.sleep(2000);
					
	//				from.sendKeys(Keys.ARROW_DOWN);
					
	//				Thread.sleep(2000);
		
	//				from.sendKeys(Keys.ENTER);
					
					
					
				
	//				    alert 
		
    //               simple alert
                   
	//		 driver.get("https://demoqa.com/alerts");
						
	//		 driver.manage().window().maximize();
					
	//				 Thread.sleep(3000);
					 
	//				 one type
					 
	//		driver.findElement(By.id("alertButton")).click();
			
	//		driver.switchTo().alert().accept();
			
			
	//		    the other one
			
	//		driver.findElement(By.id("alertButton")).click();
			
	//		Alert simplealert=driver.switchTo().alert();
			
	//		simplealert.accept();
			
	//		confirmation alert
			
	//		Thread.sleep(2000);
			
	//		driver.findElement(By.id("confirmButton")).click();
			
	//		Alert confirmalert=driver.switchTo().alert();
			
	//		System.out.println("text is"+confirmalert.getText());
			
	//		confirmalert.accept();
			
	//		prompt alert
			
	//		Actions act=new Actions(driver);
			
	//		WebElement ele=driver.findElement(By.id("promtButton"));
			
	//		act.moveToElement(ele).build().perform();
			
			
	//		driver.findElement(By.id("promtButton")).click();
			
	//		Alert promptalert=driver.switchTo().alert();
			
	//		String alerttext=promptalert.getText();
			
	//		System.out.println(alerttext);
			
	//		promptalert.sendKeys("ahe tujha ashirvad");
			
	//		promptalert.accept();
			
	//		Action class mouse movements concepts
			
	//		1) how to perform mouse hover action
			
	//		driver.get("http://spicejet.com/");
			
	//		 driver.manage().window().maximize();
				
	//		 Thread.sleep(3000);
			
	//		 Actions act=new Actions(driver);
			 
	//		 WebElement ele=driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1rngwi6 r-o9xkwf']"));
			 
	//		 act.moveToElement(ele);
			 
	//		 act.build().perform();
			 
	//		 Thread.sleep(2000);
			 
	//		driver.findElement(By.xpath("//div[text()='Zero Cancellation']")).click();
			
			 
	//		 2)drag and drop
			
	//		driver.get("http://jqueryui.com/droppable");
			
	//		 driver.manage().window().maximize();
			 
	//		 Thread.sleep(3000);
				
	//		 driver.switchTo().frame(0);
			 
	//		 Actions act=new Actions(driver);
			 
	//		 WebElement drag=driver.findElement(By.id("draggable"));
			 
	//		 WebElement drop=driver.findElement(By.id("droppable"));
			 
	//		 act.clickAndHold(drag).moveToElement(drop).release().build().perform();
			 
	//		 3) right click
			
	//		 driver.get("https://jqueryui.com/slider/#colorpicker");
				
	//		 driver.manage().window().maximize();
			 
	//		 Thread.sleep(3000);
			 
	//		 driver.switchTo().frame(0);
			 
	//		 Actions act=new Actions(driver);
			 
	//		 act.contextClick().perform();
			 
	//		 WebElement ele=driver.findElement(By.xpath("//div[@id='swatch']"));
			 
	//		 act.contextClick(ele).perform();
			 
	//		4)doubleclick

    //         driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
			
	//		 driver.manage().window().maximize();
			 
	//		 Thread.sleep(3000);

	//		 driver.switchTo().frame("iframeResult");
			 
	//		 Actions act=new Actions(driver);
			 
	//	     WebElement ele =	 driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
	//	     act.doubleClick(ele);
			 
    //			 5)Slider by software testing mentor
		     
	//	     driver.get("https://jqueryui.com/slider/#colorpicker");
				
	//	 			 driver.manage().window().maximize();
		 			 
	//	 			 Thread.sleep(3000);
			
	//	 			 WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		 			 
	//	 			driver.switchTo().frame(frame);
		 			
	//	 			Thread.sleep(2000);
		 			
	//	 			 Actions Act=new Actions(driver);
		 			 
	//			   WebElement Greenslider=	driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
		
	//	           Act.dragAndDropBy(Greenslider, 100, 120).perform();
		
	//	       slider by pavan
		
	//	      driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
	//		 			 driver.manage().window().maximize();
			 			 
	//	 			 Thread.sleep(3000);
		 			 
	//	 			 Actions Act=new Actions(driver);
		 			 
	//	   WebElement Miniumslider= driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		   

	//			   System.out.println("location of the element"+Miniumslider.getLocation());
				   
	//			   System.out.println("height and width of the element"+Miniumslider.getSize());
				
	//	   Act.dragAndDropBy(Miniumslider, 100, 0).perform();
		   
	//	   System.out.println("location of the element"+Miniumslider.getLocation());
		   
	//	   System.out.println("height and width of the element"+Miniumslider.getSize());
		
	//	         Keyboard actions
		           
	//	    1)       if we want to press any single key   by pavan
		
	//	         driver.get("http://the-internet.herokuapp.com/key_presses");
		        		   
	//	         driver.manage().window().maximize();
		         
	//	         Actions act=new Actions(driver);
		         
	//	         act.sendKeys(Keys.ENTER).perform()
	 			 
	//	     		 			 Thread.sleep(3000);		   

	//	         act.sendKeys(Keys.BACK_SPACE).perform()
	 			 
	//	 			 Thread.sleep(3000);
		         
	//	         act.sendKeys(Keys.ESCAPE).perform()
	 			 
	//	 			 Thread.sleep(3000);
		         
	//	         act.sendKeys(Keys.SPACE).perform()
	 			 
	//	 			 Thread.sleep(3000);
		         
		//         if we want to press the combination of the keys like control c control a by software testing mentor
			
	//             driver.get("https://text-compare.com/");
      		   
	//         driver.manage().window().maximize();
		         
	//	WebElement sourcecode=  driver.findElement(By.xpath("//*[@id='inputText1']"));
		
	//	sourcecode.sendKeys("i lou you");
		
	//	Actions act=new Actions(driver);
		
	//	act.keyDown(sourcecode, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
	//	WebElement destcode=  driver.findElement(By.xpath("//*[@id=\"inputText2\"]"));
		
	//	act.keyDown(destcode, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
//		if we want to press the combination of the keys like control c control a by pavan  (not recommended)
		
  //		driver.get("https://text-compare.com/");
		   
   //     driver.manage().window().maximize();
		
   //     WebElement sourcecode1=  driver.findElement(By.xpath("//*[@id='inputText1']"));
        
   //     WebElement destcode2=  driver.findElement(By.xpath("//*[@id=\"inputText2\"]"));
		
   //      sourcecode1.sendKeys("ahe tula sajanyachi khup avad");
        
   //     Actions actu= new Actions(driver);
        
        //   control A
        
   //     actu.keyDown(Keys.CONTROL);
        
   //     actu.sendKeys("a");
        
  //      actu.keyUp(Keys.CONTROL);
	     
  //    actu.perform();
	    
	    //   control c
	    
   //     actu.keyDown(Keys.CONTROL);
        
   //     actu.sendKeys("c");
        
   //     actu.keyUp(Keys.CONTROL);
	     
   //    actu.perform();
	    
	    // Tab key which will shift to box no 2
	    
	//    actu.sendKeys(Keys.TAB);
	    
	//    actu.perform();
	    
	    //   control  v
	    
   //     actu.keyDown(Keys.CONTROL);
        
   //     actu.sendKeys("v");
        
   //     actu.keyUp(Keys.CONTROL);
	     
	//    actu.perform();
		
	//      Resize the element
		
	//	driver.get("https://jqueryui.com/resizable/");
		
	//	driver.manage().window().maximize();
		
	//	WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		
	//	driver.switchTo().frame(frame);
		
	//	Thread.sleep(2000);
		
	//	WebElement element=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
	//	Actions action=new Actions(driver);
		
	//	action.dragAndDropBy(element, 300, 100).build().perform();
		
	//	Window handles by software testing mentor
		
    //		         driver.get("https://www.salesforce.com/au/");
			        		   
	//		         driver.manage().window().maximize();
			         
    // WebElement ele=driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div/div/div[5]/div/div[2]/div[1]/div/div[6]/div[1]/div[1]/div/div/div[2]/div[3]/div/div/div/div[2]/div/div/div/div/a"));
 
    // ele.click();
 
    // Thread.sleep(3000);                                            //
    
    //  Set<String> windowhandles= driver.getWindowHandles();         //
      
    //   System.out.println(windowhandles);                           //
      
    // Iterator<String> iterator= windowhandles.iterator();           //                           confusion in windowhandles and window handle
     
    // String  parentwindow= iterator.next();                         //
     
    // System.out.println(parentwindow);                              //
     
    // String  childwindow = iterator.next();                         //
     
    //  System.out.println(childwindow);                              //
     
    // driver.switchTo().window(childwindow);                         //
     
     //  driver.findElement(By.xpath("//*[@id=\"globalnavbar-header-container\"]/div[2]/div/div[2]/div/div/div[2]/div/a")).click();//
		
		
	//javascript executor all uses
		
	//	1) for scrolling purpose
		
	//	  driver.get("https://www.salesforce.com/au/");
		   
	//	 driver.manage().window().maximize();
		 
	//	 JavascriptExecutor sc=(JavascriptExecutor)driver;
		 
	//	 sc.executeScript("window.scrollBy(0,400)","");
		 
	//	2)for highlighting the any element we draw the border 
		 
	/*	  driver.get("https://demo.nopcommerce.com/");
		   
		  driver.manage().window().maximize();
		 
		  WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
			 
		 JavascriptExecutor drawborder =(JavascriptExecutor)driver;
		 
		 drawborder.executeScript("arguments[0].style.border= '3px solid red'",logo );  //  
		 
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 
		 File src =ts.getScreenshotAs(OutputType.FILE);
		
		 File target =new File(".\\FileScreenshot\\logo.png");
		
		 FileUtils.copyFile(src, target);*/
		 
	//3)    get title of the page by javascriptexecutor 
		
		/*driver.get("https://demo.nopcommerce.com/");
		   
				 driver.manage().window().maximize();
			 
				 JavascriptExecutor js =(JavascriptExecutor)driver;
				 
			 String title =js.executeScript("return document.title;").toString();
		
			  System.out.println("title is"+title);*/
		 
		 
	//  4)  How to perform click by using javascript exceutor
		
	/*	driver.get("https://demo.nopcommerce.com/");
		   
				 driver.manage().window().maximize();
				 
				WebElement ele= driver.findElement(By.xpath("//a[@class='ico-register']"));
				 
				 JavascriptExecutor js =(JavascriptExecutor)driver;
				 
				 js.executeScript("arguments[0].click();", ele);*/
				 
	//	5)  generate alert		 

	/*			 driver.get("https://demo.nopcommerce.com/");
				                                                                             // Confusion in alert in javscript executor//
				 driver.manage().window().maximize();
								 
					 JavascriptExecutor js =((JavascriptExecutor)driver);
				 
				 js.executeScript("alert(' "+message +" ')","Hello how are u" );*/
		
	//	6)  Refreshbrowser by javascript executor

         /*           driver.get("https://demo.nopcommerce.com/");
		   
					 driver.manage().window().maximize();
									 
				JavascriptExecutor js =((JavascriptExecutor)driver);
					 
					 js.executeScript("history.go(0)");*/
				 
	//	7) for zoom out zomm in		 
					 
			/*		 driver.get("https://demo.nopcommerce.com/");
					   
					 driver.manage().window().maximize();
					 
					 JavascriptExecutor js =(JavascriptExecutor)driver;
					 
				    js.executeScript("document.body.style.zoom='150%'");*/
					 
		//			 Wits in selenium webdriver
					 
	//				 Implicit waits
					 
	//				 driver.get("https://demo.nopcommerce.com/");
					   
	//				 driver.manage().window().maximize();
					 
	//				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					 
	//				 JavascriptExecutor js =((JavascriptExecutor)driver);
					 
	//				 js.executeScript("document.body.style.zoom='150%'");
					 
	//				 Explicit wait  Very imortant this appoach is for only one element
		
		
	//	             driver.get("https://www.google.com/");
		             
	//	             driver.manage().window().maximize();
		             
	//	             WebDriverWait Mywait= new WebDriverWait(driver,Duration.ofSeconds(15));
		             
	//	             driver.findElement(By.name("q")).sendKeys("selenium");
		             
	//	             driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		             
	//	           WebElement element=  Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium WebDriver']")));
		             
	//	           element.click();
				 
					 
    //                 fluent wait also similar to WebDriverWait with more Flexibility in polling time and ignoring exceptions
		
   	//                  Wait<WebDriver>mywait = new FluentWait<WebDriver>(driver);
   	            
   //	                 .withTimeout(Duration.ofSeconds(30))
   	            
   //	                  .pollingEvery(Duration.ofSeconds(5))
   	            
    //	                  .ignoring(NoSuchElementException.class);
		           
	//	              driver.get("https://www.google.com/");
		                                                                                         //  Confusion in fluent wait//
	//	              driver.manage().window().maximize();
		             
	//	              WebDriverWait Mywait= new WebDriverWait(driver,Duration.ofSeconds(15));
		             
	//	              driver.findElement(By.name("q")).sendKeys("selenium");
		              
	//	              driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		              
	//	              WebElement Element = mywait.until(new Function<WebDriver,WebElement>() {
		            	  
	//	            	  public WebElement apply(WebDriver driver) {
		            		  
	//	            		  return driver.findElement(By.xpath("//h3[text()=Selenium WebDriver']"));
	//	            	  }
		              
	//	              });
		              
	//	              Element.click();
		
	//	             How to handle iframe    i Frame
		
	//	             driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?oerview-summary.html");
		             
	//	             driver.manage().window().maximize();
		             
	//	             driver.switchTo().frame("String name or id");
		             
	//	             driver.switchTo().frame("Webelement");
		             
	//	             driver.switchTo().frame(2);
		             
	//	             driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
		             
	//	             driver.switchTo().defaultContent();              //for go back to the main page/window or frame
		 
	
       //                     inner iframes//iframe within iframere
		             
	  //             driver.get("http://demo.automationtesting.in/Frames.html");
		             
	 //             driver.manage().window().maximize();
		             
	//             driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		             
	//	          WebElement outerframe=   driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		          
	//	          driver.switchTo().frame(outerframe);
		          
	//	          WebElement inneriframe=  driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		          
	//	          driver.switchTo().frame(inneriframe);
		          
	//	          driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("jay ho");
		          
	//	      if we want to go to child frame and capture the text and again want go to the parent frame and capture the texts
		
	//	          driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		          
	//	          driver.manage().window().maximize();
		          
	//	          driver.switchTo().frame("iframeResult");
		          
	//	          driver.switchTo().frame(0);
		          
	//	          WebElement text = driver.findElement(By.xpath("/html/body/h1"));
		          
	//	         System.out.println("The text is"+ text.getText());
		         
	//	         driver.switchTo().parentFrame();
		         
	//	         WebElement textfromparentwindow = driver.findElement(By.xpath("/html/body/p"));
		         
	//	         System.out.println("the text is"+textfromparentwindow.getText());
		
	//	         Screenshot by using takescreenshot interface
		
	//	              screenshot of the full apge
		
	//	         driver.get("https://demo.nopcommerce.com/");
		         
	//         driver.manage().window().maximize();
		         
	//	         TakesScreenshot ts= (TakesScreenshot)driver;
		         
	//	        File src= ts.getScreenshotAs(OutputType.FILE);
		        
	//	        File trg=new File(".\\Screenshot\\homepage.png");
		        
	//	        FileUtils.copyFile(src, trg);
		
	//	            Screenshot of section/portion of the page
		
	//	        driver.get("https://demo.nopcommerce.com/");
		        
	//	        driver.manage().window().maximize();
		            
	//	        WebElement section= driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]"));
		            
	//            File src= section.getScreenshotAs(OutputType.FILE);
		        		        
	//	        File trg=new File(".\\Screenshot\\Featuredproduct.png");
		        		        
	//	        FileUtils.copyFile(src, trg);
		        
	//	        Screenshot of the element
		        
    //            driver.get("https://demo.nopcommerce.com/");
		        
	//	        driver.manage().window().maximize();
		            
	//	        WebElement ele= driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		            
	//            File source= ele.getScreenshotAs(OutputType.FILE);
		        		        
	//	        File target=new File(".\\Screenshot\\elementscreenshot.png");
		        		        
	//	        FileUtils.copyFile(source, target);
		
	//	           How to hhamdle the table
		
	//	     Step 1--swich to frame which has that perticular table
		
	//	     Step 2--get the number of rows
		     
	//	     Step 3--get the number of the column
		     
	//	     Step 4--iterate rows and columnand get thetext and print it
		
	//	     driver.get("https://www.w3schools.com/html/html_tables.asp");
		     
	//	     driver.get("https://www.asx.com.au");
		     
	//	     driver.manage().window().maximize();
		        
		   //*[@id="customers"]/tbody/tr[2]/td[1]
		     
		   //*[@id="customers"]/tbody/tr[3]/td[1]
		     
		   //*[@id="customers"]/tbody/tr[4]/td[1]
		     
		   //*[@id="customers"]/tbody/tr[7]/td[1]
		          
		   //*[@id="customers"]/tbody/tr
		     
		   //*[@id="customers"]/tbody/tr[2]/td
		     
		  //   Actions act = new Actions(driver);
		     
		 //    WebElement ele= driver.findElement(By.xpath("//*[@id='main']/div[3]/a"));
		     
		  //   act.moveToElement(ele).perform();
		     
		     
		 // List<WebElement> rowelements =   driver.findElements(By.xpath("//*[//*[@id=\"customers\"]/tbody/tr"));
		  
		 //   System.out.println("number of rows is "+ rowelements.size());
		    
		 //   int rowsize = rowelements.size();
		  
		//  List<WebElement> columnelements = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td"));
		  
		//  System.out.println("number of column is "+ columnelements.size());
			
		//  int columnsize = rowelements.size();
		  
		//  for(int i=1; i<=rowsize; i++) {
			  
		//	  for(int j=1; j<=columnsize; j++) {
				  
		//		  System.out.println(driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+ i+ "]/td["+j+"]")).getText());
		//	  }
		//  };
		     
		//     how we can read and write datato /from properties file
		     
		//     Properties properties=new Properties();
		     
		//     FileInputStream inputstream = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\abhijeet practice\\Everythingaboutselenium\\Properties\\Testdata.properties");
		     
		//     properties.load(inputstream);
		     
		//    System.out.println( properties.getProperty("browser"));
		    
		//    System.out.println(properties.getProperty("url"));
		    
		//    FileOutputStream outputstream = new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\abhijeet practice\\Everythingaboutselenium\\Properties\\Testdata.properties");
		    
		//    properties.setProperty("testdata", "4762626526");
		    
		//    properties.store(outputstream, "this is customer datall");
		
		//         Read Excel data
		
		//     File src = new File("E:\\Exceldataforselenium\\Testdata.xlsx");
		     
		//     FileInputStream fis =new FileInputStream(src);
		     
		//     XSSFWorkbook wb= new XSSFWorkbook(fis);
		     
		//     XSSFSheet sheet1= wb.getSheetAt(0);
		     
		//  String data0 =   sheet1.getRow(0).getCell(0).getStringCellValue();
		  
		//  System.out.print("datafrom excelis"+ data0);
		     
		//   int rowcount = sheet1.getLastRowNum();                     // i have run this program in another project
		   
		//   System.out.println("Total Number of rows is"+rowcount);  //  is it possible to count total number of column
		   
		//   for(int i=0; i<rowcount; i++)
		 //  {
		//	  String data0= sheet1.getRow(i).getCell(0).getStringCellValue();
			  
		//	  System.out.println("Tst data from excel is"+data0);
		
		//   }
		
		//         Authentication popup
		
		//       driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); nothing more than that just put username and password in url
		
		//      How to upload file in selenium WebDriver by sendkeys
		
		 /*     driver.get("https://www.monsterindia.com/");
		      
		      driver.manage().window().maximize();
		      
		   WebElement ele = driver.findElement(By.xpath("//span[@class='uprcse semi-bold']"));
		              
		   ele.click();
		   
		   driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\ADMIN\\Desktop");*/
		   
		//   How to upload file in selenium WebDriver roboat class
		
	/*	driver.get("https://www.monsterindia.com/");
		
		driver.manage().window().maximize();
		
		  WebElement ele = driver.findElement(By.xpath("//span[@class='uprcse semi-bold']"));
		  
		  ele.click();
		   
		  WebElement button= driver.findElement(By.xpath("//input[@id='file-upload']"));
		  
		  JavascriptExecutor sc=(JavascriptExecutor)driver;
		  
		  sc.executeScript("arguments[0].click();", button);
		  
	//	  now we have to do only three things
		   
	//	  1)need to copy the pathof the file and keep it into the clipboard/buffer
		  
	//	  2) we need to paste that path means control V
		  
	//	  3) press the Enter the button
		  
		  Robot rb= new Robot();
		  
		  rb.delay(2000);
		  
	//	       Put the file into the clipboard
		       
	/*	  StringSelection ss=new StringSelection("C:\\Users\\ADMIN\\//Downloads\\pan card.jpeg");  
		  
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		  
	//	  we need to paste that path means control V
		  
		  rb.keyPress(KeyEvent.VK_CONTROL);//press on control key
		  
		  rb.keyPress(KeyEvent.VK_V);
		  
		  rb.delay(2000);
		  
		  rb.keyRelease(KeyEvent.VK_CONTROL);                                               //                    Ask to the shreya tomarrow
		  
		  rb.keyRelease(KeyEvent.VK_V);
		  
	//	  Enterkeys
		  
		  rb.keyPress(KeyEvent.VK_ENTER);
		  
		  rb.keyRelease(KeyEvent.VK_ENTER);*/
		
	//	How to handle cookies
		
		
	/*	driver.manage().getCookies();//Return the all cookies
		
		driver.manage().addCookie();// create and add the cookies
		
		driver.manage().deleteCookie(null);// delete cookie
		
		driver.manage().deleteCookieNamed(null);//delete specific cookie according to name
		
		driver.manage().deleteAllCookies();//delete all cookies */
		
	   /*driver.get("https://demo.nopcommerce.com");
		
		Set<Cookie>  cookies=driver.manage().getCookies();
		
		System.out.println("Size of cookies:"+cookies.size());
		
		 for(Cookie cookie:cookies)
			 
		 {
			 System.out.println(cookie.getName()+" : "+cookie.getValue()+" : "+cookie.getDomain());
		 }
		 
		 Cookie cokkiesobj=new Cookie("Mycookie123","123456");
		 
		 driver.manage().addCookie(cokkiesobj);
		 

			  cookies=driver.manage().getCookies();
			
			System.out.println("Size of cookies after adding:"+cookies.size());//4
			
			driver.manage().deleteCookie(cokkiesobj);
			
            cookies=driver.manage().getCookies();
			
			System.out.println("Size of cookies after deleting by object:"+cookies.size());//3
			
			driver.manage().deleteCookieNamed("Mycookie123");
			
            cookies=driver.manage().getCookies();
			
			System.out.println("Size of cookies after deleteing by name:"+cookies.size());//2
			
			driver.manage().deleteAllCookies();
			
            cookies=driver.manage().getCookies();
			
			System.out.println("Size of cookies after deleting all:"+cookies.size());*/
			
//			how to handle tooltip
			
	/*	driver.get("https://jqueryui.com/tooltip/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement Ele=driver.findElement(By.xpath("//input[@id='age']"));
		
		String TooltipText= Ele.getAttribute("title");
		
		System.out.println(TooltipText);*/
		
//      How to open a link in a new tab
		
	/*	driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		driver.findElement(By.linkText("//a[@class='ico-register']")).sendKeys(tab);*/
		
//		how to open urls in a multiple tabs and windows
		
//		how to open multiple urls urls in a multiple tabs and windows
		
//		multiple urls in a multiple tab in same browser window
		
	/*	driver.get("https://demo.nopcommerce.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.opencart.com/"); */
		
//		Multiple urls in a multipl browser window
		

	/*	driver.get("https://demo.nopcommerce.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.opencart.com/");*/
		
	//	how to capture size and the location of the webelement
		
	/*	driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		 WebElement logo=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		 
	//	 Location 1st method
		 
		 System.out.println("location(x,y);"+logo.getLocation());
		 
		 System.out.println("Location (x):"+logo.getLocation().getX());
		 
		 System.out.println("Location (y):"+logo.getLocation().getY());
		 
	//	 Location 2nd Method
		 
		 
		 System.out.println("Location (x):"+logo.getRect().getX());
		 
		 System.out.println("Location (y):"+logo.getRect().getY());
		 
	// size of the eliment
		 
	//	 1 st method
		 
		System.out.println("Size(width,height)"+ logo.getSize());
		
		System.out.println("width"+logo.getSize().getWidth());
		
		System.out.println("Height"+logo.getSize().getHeight());
		
	//	2nd Method
		
		System.out.println("width"+logo.getRect().getDimension().getWidth());
		
		System.out.println("Height"+logo.getRect().getDimension().getHeight());*/
		
		
		
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
		
		
		
		
		
		
		  
		  
		  
		  
		  
		  

		    
		      
	    
		   
		   
		     
		     
		     
		     
		     
		     
	}

}

