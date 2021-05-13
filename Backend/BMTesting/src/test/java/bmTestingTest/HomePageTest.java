package bmTestingTest;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import bmTestingPage.HomePage;


public class HomePageTest {
	
	private WebDriver driver;
	public static final String URL = "http://localhost:8080";

	@Before
    public void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        driver = new ChromeDriver(options);
        driver.manage().window().setSize(new Dimension(1366, 768));
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    }
	
	@Test
	public void testHomePageNav() {
		driver.get(URL + "/index.html");
		HomePage main = PageFactory.initElements(driver, HomePage.class);
		main.getEnterNav().click();
		
		assertTrue(driver.getTitle().contains("Boorgor Builder"));
	}
	
	@Test
	public void testUpdatePageNav() {
		driver.get(URL + "/Pages/create.html");
		HomePage main = PageFactory.initElements(driver, HomePage.class);
		main.getUpdateNav().click();
		WebElement headText = this.driver.findElement(By.xpath("/html/body/div[1]/p"));
		String check = headText.getText();
		assertTrue(check.contains("Update"));
	}
	
	@Test
	public void testDeletePageNav() {
		driver.get(URL + "/Pages/update.html");
		HomePage main = PageFactory.initElements(driver, HomePage.class);
		main.getDeleteNav().click();
		WebElement headText = this.driver.findElement(By.xpath("/html/body/div[1]/p"));
		String check = headText.getText();
		assertTrue(check.contains("Delete"));
	}
	
	@Test
	public void testCreatePageNav() {
		driver.get(URL + "/Pages/delete.html");
		HomePage main = PageFactory.initElements(driver, HomePage.class);
		main.getCreateNav().click();
		WebElement headText = this.driver.findElement(By.xpath("/html/body/div[1]/p"));
		String check = headText.getText();
		assertTrue(check.contains("Create"));
	}
	
	@After
    public void tearDown() {
        driver.close();
    }

}
