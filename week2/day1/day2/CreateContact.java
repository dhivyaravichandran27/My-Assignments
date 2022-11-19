package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Dhivya");
		driver.findElement(By.id("lastNameField")).sendKeys("Ravi");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Dhivyal");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Ravi2");
		driver.findElement(By.name("departmentName")).sendKeys("testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Description");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("dhivya@yopmaial.com");
		WebElement element1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select ele = new Select(element1);
		ele.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Note");
		driver.findElement(By.xpath("//input[contains(@class,'small')]")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
