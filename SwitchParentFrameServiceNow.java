package pages;

import hooks.TestNgHooks;

public class SwitchParentFrameServiceNow extends TestNgHooks {

	
	public ClickNewButtonServiceNow switchParentFrame() {
		locateElement("xpath","//button[text()='New']");
		return new ClickNewButtonServiceNow();
	}
	
	public   SwitchParentFrameServiceNow switchHomeFrame() {
		switchToFrame("gsft_main");
		return this;
	}
	
	
	public   EnterSearch switchEnterSearch() {
		
		return new EnterSearch();
	}

	
	

}

