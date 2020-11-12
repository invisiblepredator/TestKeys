package assecobs.macrologic.technology;

import assecobs.macrologic.technology.framework.BrowserManager;
import assecobs.macrologic.technology.framework.Navigator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class KeysTesting {

    @BeforeMethod
    public void openBrowser(){
        BrowserManager.openBrowser();
    }

    @Test
    public void firstTest() throws AWTException {
        Navigator.openBrowserPage().enterCTRLandF();
    }

  /*
    @AfterMethod
    public void closeBrowser() {
        BrowserManager.closeBrowser();
    }
  */
}
