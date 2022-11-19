package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Login
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click Leads
		driver.findElement(By.linkText("Leads")).click();
		//Click create Leads
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//Enter First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhivya");
		//ENter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
		//Create Lead
		driver.findElement(By.name("submitButton")).click();
		//Click Find leads button
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		//Enter first name
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]")).sendKeys("Dhivya");
		//Click Find leads button
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		//Click First resulting lead
		Thread.sleep(3000);
		String id = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).click();
		//Verify title of the page
		String title = driver.getTitle();
		System.out.println("Title:" + title);
		String S2="View Lead | opentaps CRM";
		if(S2.equals(title))
		{
			System.out.println("Title is verified");
		}
		else
		{
			System.out.println("Title is not verified");
		}
		//Click Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//Change the company name
		String newS1 ="Test1234";
		WebElement ele = driver.findElement(By.id("updateLeadForm_companyName"));
		ele.clear();
		ele.sendKeys(newS1);
		//Click Update
		driver.findElement(By.className("smallSubmit")).click();
		String cName =driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Updated company name :" +cName);
		//To verify enter company value
		String c1Name = newS1 + " ("+id+")";
		System.out.println("Entered company name with id:"+ c1Name);
		//Verify company name with updated value
		if(c1Name.equals(cName))
		{
			System.out.println("Company name is verified");
		}
		else
		{
			System.out.println("Company name is not same");
		}
	}

}
