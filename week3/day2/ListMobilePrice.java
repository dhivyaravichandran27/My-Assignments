package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListMobilePrice {

	public static void main(String[] args) {
		//Setup browser driver
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://www.amazon.in/");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Click search 
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("phone");
		ele.sendKeys(Keys.ENTER);
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        List<Integer> priceList = new ArrayList<Integer>();
		for(int i=0;i<price.size();i++)
        {
        	WebElement value = price.get(i);
        //	String priceOfMobile = value.getText();
        	System.out.println(value.getText());
        	String text = value.getText().replaceAll(",","").replace("₹","");
        	System.out.println(text);
        	int price1 = Integer.parseInt(text);
        	priceList.add(price1);
        	
        }
        	
        	Collections.sort(priceList);
        	System.out.println(priceList.get(0));
        
	}
}
