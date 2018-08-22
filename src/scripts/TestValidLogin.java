package scripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestValidLogin extends BaseTest {
	@Test
	public void testValidLogin(){
		
	LoginPage lp=new LoginPage(driver);
String username = Lib.getCellValue("ValidLogin",1,0);
String password = Lib.getCellValue("ValidLogin", 1, 1);
lp.setusername(username);
lp.setPassword(password);
lp.loginClick();
String actualTitle=driver.getTitle();
SoftAssert s=new SoftAssert();
AssertJUnit.assertEquals(actualTitle, "actiTIME - Login");
s.assertAll();
}
}