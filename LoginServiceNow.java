package pages;

import hooks.TestNgHooks;

public class LoginServiceNow extends TestNgHooks {

	
	
	public  LoginServiceNow clickMainFrame(){
		switchToFrame("gsft_main");
		return this;
	}
	
	public LoginServiceNow typeUsername(String username) {
		
		clearAndType(locateElement("id","user_name"),username);
		return this;
	}
	
  
	public LoginServiceNow typePassword(String password) {
		
		clearAndType(locateElement("id","user_name"),password);
		return this;
	}
	
	
	public HomePageServiceNow clickLogin()
	{
		click(locateElement("id","sysverb_login"));
		return new HomePageServiceNow();
	}
}
