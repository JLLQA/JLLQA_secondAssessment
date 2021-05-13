package bmTestingTest;

import static org.junit.Assert.assertEquals;
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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bmTestingPage.CreatePage;
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
		driver.manage().window().setSize(new Dimension(1920, 1080));
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
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

	@Test
	public void testCreatePage() throws InterruptedException {
		driver.get(URL + "/Pages/create.html");
		CreatePage bm = PageFactory.initElements(driver, CreatePage.class);
//		HomePage main = PageFactory.initElements(driver, HomePage.class);
		bm.createBM("Jimmy", "Bun", "Tomato", "Yes");
		bm.getCreate().click();
//		main.getCreateNav().click();
		Thread.sleep(5000);
		WebElement createdText = this.driver.findElement(By.className("main"));
		String created = "Name: Jimmy Items: Bun & Tomato Edible: Yes";
		String check = createdText.getText();
		System.out.println(check);
		assertTrue(check.contains(created));
	}
	
//	@Test
//	public void testUpdatePage() {
//		driver.get(URL + "/Pages/update.html");
//		UpdatePage bm = PageFactory.initElements(driver, UpdatePage.class);
//		bm.updateBM(1L, "James", "Bun", "Tomato", "Yes");
//		bm.getUpdate().click();
//	}
//	
//	@Test
//	public void testDeletePage() {
//		
//	}


//	@After
//	public void tearDown() {
//		driver.close();
//	}

}
