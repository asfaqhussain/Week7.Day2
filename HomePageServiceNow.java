package pages;
import org.openqa.selenium.WebElement;

import hooks.TestNgHooks;

public class HomePageServiceNow extends TestNgHooks{

	public MyHomePageServiceNow verifyWelcomeMsg (){
		
		 WebElement navsideBar =  locateElement("xpath,//nav[@class='navpage-nav']");
			boolean navdisplay = navsideBar.isDisplayed();
			System.out.println(navdisplay);
			
			if(navdisplay)
			{
				if(verifyTitle("ServiceNow"))
				{
					System.out.println("Login Successful");
				}else
				{
					System.out.println("Login not Successful");
				}
			}
			return new MyHomePageServiceNow();
	}
	
 
	public LoginServiceNow clickLogout() {
	locateElement("xPath","//span[@class='caret']");
	locateElement("link","logout");
		return new  LoginServiceNow();
	}
	


	
}
