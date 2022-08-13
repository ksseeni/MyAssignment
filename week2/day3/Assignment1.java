package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement usernm = driver.findElement(By.id("username"));
		usernm.sendKeys("Demosalesmanager");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crmlink = driver.findElement(By.linkText("CRM/SFA"));
		crmlink.click();
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		WebElement createlead = driver.findElement(By.linkText("Create Lead"));
		createlead.click();
		WebElement company = driver.findElement(By.id("createLeadForm_companyName"));
		company.sendKeys("CTS");
		WebElement firstnm = driver.findElement(By.id("createLeadForm_firstName"));
		firstnm.sendKeys("Seenivasan");
		WebElement lastnm = driver.findElement(By.id("createLeadForm_lastName"));
		lastnm.sendKeys("Kaliyamoorthy");
		WebElement localfn = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		localfn.sendKeys("Seeni");
		WebElement dept = driver.findElement(By.id("createLeadForm_departmentName"));
		dept.sendKeys("QA");
		WebElement desc = driver.findElement(By.id("createLeadForm_description"));
		desc.sendKeys("SampleTest");
		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("ksseeni@gmail.com");
		WebElement ste = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stels = new Select(ste);
		stels.selectByVisibleText("New York");
		WebElement submit = driver.findElement(By.className("smallSubmit"));
		submit.click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		}
	

}