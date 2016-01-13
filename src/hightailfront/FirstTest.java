package hightailfront;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstTest obj = new FirstTest();
		//obj.callFirefox();
		obj.callChrome();

	}
	
	public void  callFirefox(){
		WebDriver driver = new FirefoxDriver();
		String baseUrl ="https://www.hightail.com";
		driver.get(baseUrl);
		
	}
	
	public void  callChrome(){
		WebDriver driver;
		String baseUrl ="https://www.hightail.com";
		System.setProperty("webdriver.chrome.driver", "/Users/saurabh.soni/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		
	}

}
