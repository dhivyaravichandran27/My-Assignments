package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Enter the user name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhivya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dhivya1");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("abc");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testing@yopmail.com");
		WebElement element1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select ele = new Select(element1);
		ele.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println("Title="+title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement cName = driver.findElement(By.id("createLeadForm_companyName"));
		cName.clear();
		cName.sendKeys("Testleaf123");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.clear();
		firstName.sendKeys("Testleaf");
		driver.findElement(By.name("submitButton")).click();
		String title1 = driver.getTitle();
		System.out.println("Duplicate lead title ="+title1);
	
		
		

	}

}
