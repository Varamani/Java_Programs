package SeleniumBasics;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Class3 {
	
	
	@Test(dataProvider="TestData")
	public void Login(String Username,String Password)
	{
		String username="Admin123";
		String password="Admin123";
		
		Assert.assertEquals(username, Username);
	}

	
	@DataProvider(name="TestData")
	public Object[][] testData()
	{
		Object[][] data= new Object[1][2];
		data[0][0]="admin123";
		data[0][1]="admin123";
		
		return data;
	}
	
	

}
