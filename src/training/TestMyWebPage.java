package training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;


public class TestMyWebPage {

	public static void main(String[] args) throws InterruptedException {

		//this is grace branch
		
		
		System.out.println("Grace of God!");
		System.setProperty("webdriver.ie.driver", "C:\\Anbu\\Training\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.jesuscalls.com/");
		Thread.sleep(1000);
		System.out.println("Title:"+driver.getTitle());
		String strPromise = driver.findElement(By.className("home_news_link_text")).getText();
		System.out.println(strPromise);
		driver.findElement(By.className("home_news_link_text")).sendKeys(Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		 String strPromise1 = driver.findElement(By.cssSelector("p")).getText();
		 System.out.println(strPromise1);
		 
		driver.quit();
		
	}
	
	

}
