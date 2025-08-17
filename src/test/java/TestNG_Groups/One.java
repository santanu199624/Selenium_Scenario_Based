package TestNG_Groups;

import org.testng.annotations.Test;

public class One {
	
	@Test(groups= {"smoke"})
	public void oneA(){
		System.out.println("This is OneA");
	}
	
	@Test
	public void oneB(){
		System.out.println("This is OneB");
	}
	
	@Test
	public void oneC(){
		System.out.println("This is OneC");
	}

}
