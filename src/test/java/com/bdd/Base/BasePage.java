package com.bdd.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    protected static WebDriver driver;

    public static void setUp() throws Exception {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        }
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
