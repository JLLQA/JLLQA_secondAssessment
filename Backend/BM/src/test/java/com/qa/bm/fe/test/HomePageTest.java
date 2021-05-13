package com.qa.bm.fe.test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.bm.fe.page.HomePage;

public abstract class HomePageTest {

    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1366, 768));
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void testSite() throws InterruptedException {
        driver.get(HomePage.URL);
        assertEquals("Boorgor Builder", driver.getTitle());
    }
    
    @Test
    public void enterSite() {
        driver.get(HomePage.URL);
        HomePage page = PageFactory.initElements(driver, HomePage.class);
        page.getEnterBtn().click();
        WebElement text1 = this.driver.findElement(By.xpath("/html/body/div[3]/div[1]/h1"));
        String text2 = text1.getText();
        
        assertEquals("Let's Make BoorgorMons",text2);
    }
    
    @After
    public void tearDown() {
        driver.close();
    }
}