package com.testingshastra.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testingshastra.Pages.CourseTab;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCourseTab {
	WebDriver driver;
	CourseTab ct = new CourseTab(driver);
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.testingshastra.com");
	}
	@Test(priority =0)
	public void checkCourseTab() {
		String expectedTitle = "Testing Shastra";
		ct.clickOnCourseTab();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test(priority=1)
	private void testCourseTabElements() {
		String expectedTitle = "Automation Testing";
		ct.clickAutomationTesting();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		// Added by Shreyas
	}
}
