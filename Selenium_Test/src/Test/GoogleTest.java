package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		
		WebDriver driver=(WebDriver) new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vivek\\workspace\\Selenium_Test\\src\\Driver\\chromedriver.exe");
        driver.get("https://www.google.co.in/");

	}

}
