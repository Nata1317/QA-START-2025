package org.prog.session7;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlloTest {
    private WebDriver driver;

    @BeforeSuite
    public void initWebDriver() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    @Test
    public void searchIphoneTest() {
        driver.get("https://www.allo.ua");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-form__input")));
        searchField.sendKeys("iPhone");
        searchField.sendKeys(Keys.ENTER);

        Assert.assertTrue(driver.getPageSource().contains("iPhone"));

        System.out.println("Search completed successfully");
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}