package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

	public class TestInvalidLogin extends BaseTest {
		@Test
		public void testInValidLogin() throws InterruptedException{
			
		LoginPage lp=new LoginPage(driver);
		int rowCount = Lib.getRowCount("InValidLogin");
		for (int i = 0; i <=rowCount; i++) {
			
		
	String username = Lib.getCellValue("InValidLogin",i,0);
	String password = Lib.getCellValue("InValidLogin", i, 1);
	lp.setusername(username);
	Thread.sleep(2000);
	lp.setPassword(password);
	Thread.sleep(2000);
	lp.loginClick();
	}
	}
}
	
