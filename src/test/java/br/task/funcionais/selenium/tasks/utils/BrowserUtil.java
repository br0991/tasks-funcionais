package br.task.funcionais.selenium.tasks.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtil {

	private static WebDriver driver;

	public BrowserUtil() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8001/tasks/");
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
