package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    public WebDriver driver;

    public CheckoutPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "title")
   public WebElement checkoutPageHeading;

    @FindBy(id = "first-name")
    public WebElement firstNameTxtFld;

    @FindBy(id = "last-name")
    public WebElement lastNameTxtFld;

    @FindBy(id = "postal-code")
    public WebElement postcodeTxtFld;

    @FindBy(name = "cancel")
    public WebElement cancelBtn;

    @FindBy(id = "continue")
    public WebElement continueButton;

    public void verifyCheckOutPageLanding(String expectedCheckoutPageHeading)
    {
        Assert.assertEquals(expectedCheckoutPageHeading, checkoutPageHeading.getText());
    }

    public void enterFirstname(String firstname)
    {
        firstNameTxtFld.sendKeys(firstname);
    }

    public void enterLastname(String lastname)
    {
        lastNameTxtFld.sendKeys(lastname);
    }
    public void enterPostcode(String postcode)
    {
        postcodeTxtFld.sendKeys(postcode);
    }

    public void clickContinueBtn()
    {
        continueButton.click();
    }



}
