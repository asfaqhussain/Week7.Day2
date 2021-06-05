package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import hooks.TestNgHooks;

public class UpdateCallerDetailsServiceNow extends TestNgHooks {

public UpdateCallerDetailsServiceNow updatePhone(String phone) {
	
	driver.findElement(By.id("sys_user.phone")).clear();
	driver.findElement(By.id("sys_user.phone")).sendKeys("0987654321");
	return this;
}


public ReturnPageServiceNow clickUpdate() {
	driver.findElement(By.id("sysverb_update")).click();
	return new ReturnPageServiceNow() ;
}



}







	
	



