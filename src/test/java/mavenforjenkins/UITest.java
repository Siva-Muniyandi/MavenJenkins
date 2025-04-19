package mavenforjenkins;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class UITest {
	@Test
	public void startBrowser() {
		System.out.println("Starting Test");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/");
		Assert.assertEquals(driver.getTitle().contains("Welcome to Naveen AutomationLabs - naveen automationlabs"),
				true);
		driver.quit();

	}
}
