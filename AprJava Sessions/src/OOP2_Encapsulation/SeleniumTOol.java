package OOP2_Encapsulation;

/**
 * 
 * This code is for hiding the Methods
 * @author ADMIN
 *
 */

public class SeleniumTOol {
	
	
	private String browserName;
	
	
	public String getBrowserName() {
		return browserName;
	}
	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}
	private void browserInteraction(String browsername) {
		System.out.println("Intercating With Browser" + browsername);
	}
	private void interactWithWebElement() {
		System.out.println("intercation With WebElements");
	}
	private void doClickOnElement() {
		interactWithWebElement();
		System.out.println("Clicking the Elements");
		
	}
	
	private void doSendKeysToElement(String value) {
		interactWithWebElement();
		System.out.println("Sending the Value to Element : "+ value);
	}
	private void closeTheBrowser() {
		System.out.println("Browser Closed");
		
	}
	
	public void launchBrowser(String browsername) {
		browserInteraction(browsername); 
	}
	public void click() {
		doClickOnElement();
		
	}
	public void sendKeys(String value) {
		doSendKeysToElement(value);
		
	}
	public void browserClose() {
     closeTheBrowser();
		
	}
	
	

}
