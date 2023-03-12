package stepDefinitions;

import functionalLibrary.CommonFunctionLib;
import functionalLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProductPage;

public class
LoginSteps extends CommonFunctionLib {

    HomePage homePage = new HomePage (driver);
    ProductPage productPage = new ProductPage(driver);
    //CheckoutPage checkoutPage = new CheckoutPage(driver);

    @Given("I am on HomePage {string} with title {string}")
    public void openHomePage(String url, String expectedHomePageTitle)
    {
        //ChromeOptions options = new ChromeOptions();
        //options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        //WebDriver driver = new ChromeDriver(options);
        //driver.get(url);
        driver.get(url);
       homePage.verifyHomePageLanding(expectedHomePageTitle);
    }



    @When("I do login with username {string} and password {string}")
    public void doLogin(String username, String password)
    {
        homePage.enterUsername(username);
        homePage.enterPassword(password);
        homePage.clickLoginBtn();
    }

    @Then("I should land on product page With Heading {string}")
    public void verifyProductsPageLanding(String expectedProductsPageHeading)
    {
        productPage.verifyProductPageLanding(expectedProductsPageHeading);
    }

    /*public void doCheckout(String firstname, String lastname, String postcode)
    {

        checkoutPage.enterFirstname(firstname);
        checkoutPage.enterLastname(lastname);
        checkoutPage.enterPostcode(postcode);
        checkoutPage.clickContinueBtn();
    }*/


}
