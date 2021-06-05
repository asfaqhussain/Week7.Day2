package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;

public class CreateCallerPagesServiceNow extends TestNgHooks{

	public CreateCallerPagesServiceNow typeFirstname(String firstname) {

		driver.findElement(By.id("sys_user.first_name")).sendKeys(firstname);
		return this;
	}

	public CreateCallerPagesServiceNow typeLastname(String lastname) {
		driver.findElement(By.id("sys_user.last_name")).sendKeys(lastname);
		return this;
	}

	public CreateCallerPagesServiceNow typeUsertitle(String usertitle) {
		driver.findElement(By.id("sys_user.title")).sendKeys(usertitle);
		return this;
	}

	public CreateCallerPagesServiceNow typeEmail(String email) {
		driver.findElement(By.id("sys_user.email")).sendKeys(email);
		return this;
	}

	public CreateCallerPagesServiceNow typePhone(String phone) {
		driver.findElement(By.id("sys_user.phone")).sendKeys(phone);
		return this;
	}


	public CreateCallerPagesServiceNow typeMobile(String mobileph) {
		driver.findElement(By.id("sys_user.mobile_phone")).sendKeys(mobileph);
		return this;
	}
	
	public ReturnPageServiceNow clickSubmit() {
		driver.findElement(By.id("sysverb_insert")).click();
		return new ReturnPageServiceNow() ;
	}
}
