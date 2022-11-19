package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the browser window
		driver.manage().window().maximize();
		//implicit wait
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
		//Enter Phone Number
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		//Submit
		driver.findElement(By.name("submitButton")).click();
		//Click Find leads button
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		//click Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter Phone Number
		driver.findElement(By.xpath("(//input[contains(@name,'Number')])[4]")).sendKeys("9876543210");
		//Click Find button
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		Thread.sleep(3000);
		//Capture element
	    String text4 = driver.findElement(By.xpath("//div[contains(@class,'partyId')]/a[@class='linktext']")).getText();
		System.out.println(text4);
		//Click First resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).click();
		//Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		//Click Find Leads
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		//Enter capture Lead id
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text4);
		//Click Find Leads button
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		//Verify message "No records to display" in the Lead List
		String text2 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text2);
		String text3 = "No records to display";
		if(text2.equals(text3))
		{
			System.out.println("Successful Deletion");
		}
		else
		{
			System.out.println("Records present");
			
		}
		//Close the browser
		driver.close();
		
		
	}

}
