package testHelp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTestHelp {
    private WebDriver driver;
    @Before
    public void startUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @After
    public void end(){
        if(driver!=null)
            driver.quit();
    }

    @Test
    public void helpTest() throws InterruptedException {
        driver.get("https://iplatform-web.test.russianpost.ru/");

        driver.findElement(By.linkText("Помощь")).click();
        Thread.sleep(5000);
    }

}