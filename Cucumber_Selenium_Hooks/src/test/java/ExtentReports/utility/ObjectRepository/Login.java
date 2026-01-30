package ExtentReports.utility.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;
	
	@FindBy(xpath="//input[1]")
	WebElement checkBox1;
	
	@FindBy(xpath="//input[2]")
	WebElement checkBox2;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void selectCheckBox() throws InterruptedException {
		if(!checkBox1.isSelected()) {
			checkBox1.click();
		}
		if(!checkBox2.isSelected()) {
			checkBox2.click();
		}
		Thread.sleep(2000);
	}
}
