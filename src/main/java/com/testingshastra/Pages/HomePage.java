package com.testingshastra.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath="//a[text()='Home']")
	private WebElement home;
}
