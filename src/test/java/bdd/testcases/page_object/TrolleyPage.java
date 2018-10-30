package bdd.testcases.page_object;

import bdd.testcases.driver.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TrolleyPage extends DriverHelper {


    @FindBy(css = ".description>strong>a")
    private WebElement productInBasket;


    public String getProdcutInBasket() {
        return productInBasket.getText();
    }

    public void collect(String postcode) {
        driver.findElement(By.cssSelector("")).sendKeys(postcode);
    }

    public void chooseStore() {
        driver.findElement(By.cssSelector("")).click();
    }
}
