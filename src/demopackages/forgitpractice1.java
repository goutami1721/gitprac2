package demopackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class forgitpractice1 {

	@Test
	public void geturl()
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void print()
	{
		System.out.println("hello");
		System.out.println("hii");
		System.out.println("bye");
		
		
	}

}
