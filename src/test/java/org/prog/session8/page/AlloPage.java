package org.prog.session8.page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class AlloPage {
    private final WebDriver driver;
    private final WebDriverWait wait;
    public AlloPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Step("Open Allo")
    public void loadPage()  {
        driver.get("https://allo.ua/");

    }

    @Step("Search product: {product}")
        public void searchProduct(String product) {
            WebElement search = wait.until(ExpectedConditions.elementToBeClickable
                    (By.name("search")));
            search.clear();
            search.sendKeys(product);
            search.sendKeys(Keys.ENTER);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".sum")));
        }
        @Step("Get first product price")
        public String getFirstPrice() {
            String price = wait.until(driver -> {
              WebElement element = driver.findElement(By.cssSelector(".sum"));
              String text = element.getText();
              if(text.isEmpty()) {
                  return null;
              }
              return text;
            } );
            String currency = wait.until(driver -> {
                WebElement element = driver.findElement(By.cssSelector(".currency"));
                String text = element.getText();
                if (text.isEmpty()) {
                    return null;
                }
                return text;
            });
            return price + currency;
        }
        @Step("Check price contains hryvnia sign")
        public boolean isPriceContainsHryvniaSign(){
        String price = getFirstPrice();
            System.out.println("PRICE = " + price);
            return price.contains("₴");

}
}
