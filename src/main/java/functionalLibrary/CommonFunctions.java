package functionalLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CommonFunctions

{
        public static WebDriver driver;
git config
        public void openBrowser()
        {
            //WebDriverManager.chromedriver().setup();
            //driver = new ChromeDriver();
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        public void closeBrowser()
        {
            driver.quit();
        }
       /* public void waitForTime(int waitTime)
        {
            driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);

        }*/
       /* public void mouseOver(WebElement element)
        {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();


        }*/

}
