package selenium;

public class maven1 {

	import org.testng.annotations.Test;

	public class testng {

			
			@Test(groups= {"sanity"}) 
			public void test5()
			{
				System.out.println("test5 is running");
			}
			
			@Test(groups= {"sanity","smoke"}) 
			public void test6()
			{
				System.out.println("test6 is running");
			}
			
			@Test(groups= {"sanity","regression"}) 
			public void test7()
			{
				System.out.println("test7 is running");
			}
			
			
			@Test(groups= {}) 
			public void test8()
			{
				System.out.println("test8 is running");
			}
			
		
	
	
	
	
	
		
	
}
