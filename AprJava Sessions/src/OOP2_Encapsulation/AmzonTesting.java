package OOP2_Encapsulation;


/**
 * 
 * This code is for hiding the Methods
 * @author ADMIN
 *
 */

public class AmzonTesting {
	public static void main(String[] args) {
		SeleniumTOol driver = new SeleniumTOol();
		driver.launchBrowser("Chrome");
		driver.sendKeys("Nikhil@gail.com");
		driver.sendKeys("test@123");
		driver.click();
		driver.browserClose();
		driver.setBrowserName("Applesssss");
		System.out.println(driver.getBrowserName());
	}
}
