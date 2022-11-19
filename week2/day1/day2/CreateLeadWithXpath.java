package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadWithXpath {

	public static void main(String[] args) {
		       //Setup browser driver
				WebDriverManager.chromedriver().setup();
				//Launch the browser
				ChromeDriver driver = new ChromeDriver();
				//Load the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				//Maximize the browser window
				driver.manage().window().maximize();
				//Enter the user name
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
				driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
				driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
				driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Dhivya");
				driver.findElement(By.xpath("//input[contains(@id,'last')]")).sendKeys("Ravi");
				driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();


	}

}

