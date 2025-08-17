package TestNG;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 3)
	public void test(){
		System.out.println("Test run");
	}

}
