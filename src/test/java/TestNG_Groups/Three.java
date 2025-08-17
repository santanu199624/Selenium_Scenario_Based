package TestNG_Groups;

import org.testng.annotations.Test;

public class Three {
	
	@Test
	public void threeA(){
		System.out.println("This is threeA");
	}
	
	@Test
	public void threeB(){
		System.out.println("This is threeB");
	}
	
	@Test(groups= {"smoke"})
	public void threeC(){
		System.out.println("This is threeC");
	}

}
