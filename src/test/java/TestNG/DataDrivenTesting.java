package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {
	
	@Test(dataProvider="dsm")
	public void testLogin(String username, String password){
		System.out.println("Username"+username+"and password"+password);
	}
	
	@DataProvider(name="dsm")
	public Object[][] dataSuplierMethod(){
		Object[][] data = {{"Arun", "123"},{"Tony","456"},{"Rony","890"}};
		return data;
	}

}
