package com.bdd.Util;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Util {

    public static boolean waitElementIsVisible(WebElement webElement, WebDriver driver, int duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
        return element != null;
    }

    public static int getRandom() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static String getValueFromDataTable(DataTable dataTable, String key) {
        List<Map<String, String>> mapList = dataTable.asMaps();
        return (String) mapList.get(0).get(key);
    }
}
