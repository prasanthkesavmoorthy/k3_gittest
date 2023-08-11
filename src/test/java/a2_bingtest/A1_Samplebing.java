package a2_bingtest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_Samplebing {
	@Test
	public void loginBingTest() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.bing.com/");
		System.out.println(wd.getTitle());
		WebElement elements = wd.findElement(By.name("q"));
		elements.sendKeys("chennai");
		elements.submit();
		System.out.println(wd.getTitle());
		wd.navigate().back();
		System.out.println(wd.getTitle());
		wd.navigate().forward();
		System.out.println(wd.getTitle());
		File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:/vcentryWorkspace/batch261/k3_gitTest/screenshots1/bing.png"));
		wd.quit();
	}
}
