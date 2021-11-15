package com.TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageClasses.PageClass_ForProfileCreator;



public class TestClass_ForProfileCreator extends BasicStepClass {
	
	  @Test(priority=1)
	    public void TestCase()
	    {
	    	PageClass_ForProfileCreator pc = new PageClass_ForProfileCreator(driver);
	    	
	    	pc.ProfileCreator();
	    	
	    	WebElement dropdown =driver.findElement(By.xpath("//*[text()='Select']")) ;
	        Actions as = new Actions(driver);
			
			as.click(dropdown).perform();
			
			WebElement self =driver.findElement(By.xpath("//*[text()='Self']")) ;

			self.click();
			
			pc.GernderSelect();
			
			pc.NextButton();
			
			WebElement title = driver.findElement(By.xpath("//*[@class='common_formTitle__3pQj7']"));
			
			Assert.assertTrue(title.isDisplayed());
		
	    }
	  
	  @Test (priority=2)
	  public void VerifyCommunityName() { 
		  
		  String Expected = "Marathi";
		  
		  String Actual = driver.findElement(By.xpath("//div[@class='Dropdown-control mother_tongue_selector Dropdown-disabled']")).getText();
		  
		  Assert.assertEquals(Expected,Actual);
		  		
	  }

}
