package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage
{
    public WebDriver driver;
    public ProductPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(className = "title")
    public WebElement productPageHeading;
    @FindBy(className = "product_sort_container")
    public WebElement sortDropDown;
    public void verifyProductPageLanding(String expectedPageHeading)
    {
        Assert.assertEquals(expectedPageHeading,productPageHeading.getText());
    }
    public void chooseSortOption(String sortOption)
    {
      new Select(sortDropDown).selectByVisibleText(sortOption);
    }
    public void chooseProduct(String productName)
    {
       driver.findElement(By.xpath("//div[text()='"+productName+"']")).click();


    }





}
