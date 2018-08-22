package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	WebElement unTB;
	@FindBy(name="pwd")
	WebElement pwdTB;
	@FindBy(xpath="//div[contains(text(),'Login')]")

	WebElement loginBtn;

public LoginPage(WebDriver driver){
	PageFactory.initElements(driver,this);
}
	public void setusername(String un){
	unTB.sendKeys(un);
	}
	public void setPassword(String password){
		pwdTB.sendKeys(password);
		}
	public void loginClick() {
		loginBtn.click();
	}

}


