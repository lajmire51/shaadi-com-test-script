package com.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageClass_ForProfileCreator {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//button[@class='btn-primary form-control']")
	private WebElement letsbegin;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="password1")
	private WebElement pass;
	
	@FindBy(id="gender_male")
	private WebElement gender;
	
	@FindBy(xpath="//*[@data-testid='next_button']")
	private WebElement nextbutton;
	
	
	
	

	public PageClass_ForProfileCreator(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void ProfileCreator() {
		
		letsbegin.click();
		
		email.sendKeys("lajmire51@gmail.com");
		
		 pass.sendKeys("laxaj71");
		 	
	}

	public void GernderSelect() {
		// TODO Auto-generated method stub
		
		gender.click();
		
	}
	
	public void NextButton() {
		// TODO Auto-generated method stub
		
		nextbutton.click();
		
	}
	
	
	public void VerifyCommunityName() {
		
	}

   
}
