package TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	
//	@Test(enabled = false)
	@Ignore
	public void TestCase1(){
		System.out.println("Testcase1 execute");
	}
	
	@Test
	public void TestCase2(){
		System.out.println("Testcase2 execute");
	}
	

}
