package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("dhivya");
		driver.findElement(By.name("lastname")).sendKeys("ravi");
		driver.findElement(By.name("reg_email__")).sendKeys("9999999999");
		driver.findElement(By.id("password_step_input")).sendKeys("abcabc");
		WebElement date = driver.findElement(By.name("birthday_day"));
		Select date1 = new Select(date);
		date1.selectByIndex(9);
		WebElement day = driver.findElement(By.name("birthday_month"));
		Select day1 = new Select(day);
		day1.selectByVisibleText("Feb");
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select year1 = new Select(year);
		year1.selectByValue("2000");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
	}

}
