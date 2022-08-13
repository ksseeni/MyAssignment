package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumKickStart {
	
public static void main(String[] args) { 
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver(); 
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
//	driver.close();
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("Demosalesmanager");
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("crmsfa");
	WebElement loginbutton = driver.findElement(By.className("decorativeSubmit"));
	loginbutton.click();
    WebElement elementmessage = driver.findElement(By.tagName("h2"));
    String logintext = elementmessage.getText();
    System.out.println(logintext);
    WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
    crm.click();
    WebElement createlead = driver.findElement(By.linkText("Create Lead"));
     createlead.click();
     WebElement company = driver.findElement(By.id("createLeadForm_companyName"));
     company.sendKeys("Demos");
 	WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
     firstName.sendKeys("Demosa") ;
     WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
     lastname.sendKeys("Demosa") ;
      WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
     source.sendKeys("Cold Call");
     WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
     Select dd1 = new Select(industry);
     dd1.selectByIndex(1);
     WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
     Select dd2 = new Select(ownership);
     dd2.selectByValue("OWN_PARTNERSHIP");
     WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
     Select dd3= new Select(currency);
     dd3.selectByVisibleText("ALL - Albanian Lek");
     WebElement submit = driver.findElement(By.className("smallSubmit"));
     submit.click();
     
     
     
 
     
     
   
     
     
     
    
    
    
    
    
    
}

}
