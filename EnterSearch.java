package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import hooks.TestNgHooks;

public class EnterSearch extends TestNgHooks{

	public UpdateCallerDetailsServiceNow searchfield(String data) {

		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(data, Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		return new UpdateCallerDetailsServiceNow();

	}

	

	}

			
		


		
		


	
		



	



