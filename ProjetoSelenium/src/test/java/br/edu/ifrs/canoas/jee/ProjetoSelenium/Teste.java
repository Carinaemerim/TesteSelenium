package br.edu.ifrs.canoas.jee.ProjetoSelenium;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class Teste {

	private static WebDriver driver;
	
	@BeforeClass
	public static void setUpClass() {
		System.setProperty("webdriver.chrome.driver" ,  ".\\resources\\chromedriver.exe");
	}
	
	@AfterClass
	public static void tearDownClass(){
		driver.quit();
		
	}
	
	@Before
	public void setUp(){
		
		driver = new ChromeDriver();
		driver.get("http://www.seleniumhq.org/");
	}
	
	@Test
	public void checkPageTitle(){
		
		String expected = "Selenium - Web Browser Automation";
		String actual = driver.getTitle();
		
		assertThat(expected).as(actual);
	}
	
	@Test
	public void  findAndClickOnElement(){
		
		driver.findElement("Download");
		String expected = "Download";
		String actual = driver.getTitle();
		
		assertEquals (expected, actual);
	}

}