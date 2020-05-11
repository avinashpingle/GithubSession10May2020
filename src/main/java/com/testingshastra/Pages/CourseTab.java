package com.testingshastra.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseTab {
	WebDriver driver;
	@FindBy(xpath = "//a[contains(text(),'Courses')]")
	@CacheLookup
	WebElement CourseTab;
	@FindBy(partialLinkText = "Automation Testing")
	WebElement automationTesting;
	@FindBy(linkText = "Advance Java")
	WebElement advanceJava;
	@FindBy(partialLinkText = "Angular")
	WebElement angular;

	public CourseTab(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnCourseTab() {
		CourseTab.click();
	}
	public void clickAutomationTesting() {
		automationTesting.click();

	}
}
