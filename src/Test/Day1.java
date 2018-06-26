package Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Day1 {
	@BeforeSuite
	public void befores() {
		System.out.println("asdasdsz");
	}
	@AfterTest
	public void predemo() {
		System.out.println("post");
	}	
	@DataProvider(name = "test1")
	public String[] createData1() {
		String[] arr= {"Ankit","Ashwin","Nikhil"};
	return arr;
	}
	//This test method declares that its data should be supplied by the Data Provider  //named "test1"
 @Test(dataProvider="test1")
	public void Demo (String a)		
	{
	// TODO Auto-generated method stub
System.out.println("Hello "+a);
	}
 @AfterSuite
 void after() {
	 System.out.println("after");
 }
}