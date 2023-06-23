package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumopenProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager");
	
	
	}

}
