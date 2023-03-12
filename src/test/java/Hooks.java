import functionalLibrary.CommonFunctionLib;
import functionalLibrary.CommonFunctions;
import io.netty.util.internal.logging.CommonsLoggerFactory;
import org.junit.After;
import org.junit.Before;

public class Hooks {

    CommonFunctionLib commonFunctionLib=new CommonFunctionLib();

    @Before
    public void openBrowser()

    {
        commonFunctionLib.openBrowser();
    }

   // @After
    public void closeBrowser()
    {
        commonFunctionLib.closeBrowser();
    }
}
