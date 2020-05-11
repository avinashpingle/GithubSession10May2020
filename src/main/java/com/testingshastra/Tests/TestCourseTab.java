package com.testingshastra.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.testingshastra.Pages.CourseTab;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCourseTab {
	WebDriver driver;

	@Test
	public void checkCourseTab() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.testingshastra.com");
		CourseTab ct = new CourseTab(driver);
		ct.clickOnCourseTab();
	}
}
