package com.selenium.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionExample1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		String URL = "https://facebook.com";

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(URL);

		WebElement fbFooter = driver.findElement(By.xpath("//*[@id=\"pageFooterChildren\"]/ul"));

		List<WebElement> fbFooterlink = fbFooter.findElements(By.tagName("a"));

		System.out.println("Total link in the footer " + fbFooterlink.size());

		for (WebElement fb : fbFooterlink) {
			System.out.println(
					"Print the footer name " + fb.getText() + " and   footer url " + fb.getAttribute("href"));

		}

	}

}
