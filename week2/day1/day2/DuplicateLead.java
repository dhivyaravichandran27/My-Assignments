package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		//Enter Primary email
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testing@yopmail.com");
		//Create Lead
		driver.findElement(By.name("submitButton")).click();
		//Click Find leads button
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		//Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		//Enter Email
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("testing@yopmail.com");
		//Click find leads button
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		Thread.sleep(3000);
		//Capture name of First Resulting lead
		String capturedName = driver.findElement(By.xpath("//div[contains(@class,'firstName')]/a[@class='linktext']")).getText();
		System.out.println(capturedName);
		//Click First Resulting lead
		driver.findElement(By.xpath("//div[contains(@class,'firstName')]/a[@class='linktext']")).click();
		//Click Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.getTitle();
		System.out.println("Title:" + title);
		String S2="Duplicate Lead | opentaps CRM";
		if(S2.equals(title))
		{
			System.out.println("Title is verified");
		}
		else
		{
			System.out.println("Title is not verified");
		}
		driver.findElement(By.name("submitButton")).click();
		String leadName= driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("Duplicate lead name:"+ leadName);
		//Confirm the duplicated lead name is same as captured name
		if(capturedName.equals(leadName))
		{
			System.out.println("Lead name is Verified");
		}
		else
		{
			System.out.println("Lead name is not same");
		}
		driver.close();
	}

}
