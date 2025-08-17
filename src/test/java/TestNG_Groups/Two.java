package TestNG_Groups;

import org.testng.annotations.Test;

public class Two {
	
	@Test
	public void twoA(){
		System.out.println("This is twoA");
	}
	
	@Test(groups= {"smoke"})
	public void twoB(){
		System.out.println("This is twoB");
	}
	
	@Test
	public void twoC(){
		System.out.println("This is twoC");
	}

}
