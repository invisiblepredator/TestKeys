package assecobs.macrologic.technology;

import assecobs.macrologic.technology.pages.BrowserPage;
import org.testng.annotations.Test;

import java.awt.*;

public class KeysTesting {

    private static final String pathToDriver = "src/main/resources/drivers/";

    static {
        System.setProperty("webdriver.chrome.driver", pathToDriver + "chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", pathToDriver + "geckodriver.exe");
        System.setProperty("webdriver.opera.driver", pathToDriver + "operadriver.exe");
        System.setProperty("webdriver.edge.driver", pathToDriver + "msedgedriver.exe");
        //System.setProperty("webdriver.edge.driver", pathToDriver + "edgedriver.exe");     //TODO something went wrong with
        System.setProperty("webdriver.ie.driver", pathToDriver + "IEDriverServer.exe");
        //TODO add here Safary driver and uncomment the Test
    }

//    @Test TODO all in one test (much more faster but troubles with different keys makes fail our test)
//    public void inChromeTest() throws AWTException {
//        BrowserManager.openBrowser(new ChromeDriver());
//        Navigator.openBrowserPage().testKeys();
//    }

    @Test
    public void inChromeTest2() throws AWTException {
        BrowserPage browserPage = new BrowserPage();
        browserPage.testAltLetterCombinationKey("Chrome");
        browserPage.testCtrlLetterCombinationKey("Chrome");
        browserPage.testAltNumberKeyInNewBrowserWindow("Chrome");
        browserPage.testCtrlNumberInNewBrowserWindow("Chrome");
    }

    @Test
    public void inFirefoxTest() throws AWTException {
        BrowserPage browserPage = new BrowserPage();
        browserPage.testAltLetterCombinationKey("Firefox");
        browserPage.testCtrlLetterCombinationKey("Firefox");
        browserPage.testAltNumberKeyInNewBrowserWindow("Firefox");
        browserPage.testCtrlNumberInNewBrowserWindow("Firefox");
    }

    @Test
    public void inOperaTest() throws AWTException {
        BrowserPage browserPage = new BrowserPage();
        browserPage.testAltLetterCombinationKey("Opera");
        browserPage.testCtrlLetterCombinationKey("Opera");
        browserPage.testAltNumberKeyInNewBrowserWindow("Opera");
        browserPage.testCtrlNumberInNewBrowserWindow("Opera");
    }

//    @Test
//    public void inEdgeTest() throws AWTException {
//        BrowserPage browserPage = new BrowserPage();
//        browserPage.testAltLetterCombinationKey("Edge");
//        browserPage.testCtrlLetterCombinationKey("Edge");
//        browserPage.testAltNumberKeyInNewBrowserWindow("Edge");
//        browserPage.testCtrlNumberInNewBrowserWindow("Edge");
//    }

    @Test
    public void inIETest() throws AWTException {
        BrowserPage browserPage = new BrowserPage();
        browserPage.testAltLetterCombinationKey("Explorer");
        browserPage.testCtrlLetterCombinationKey("Explorer");
        browserPage.testAltNumberKeyInNewBrowserWindow("Explorer");
        browserPage.testCtrlNumberInNewBrowserWindow("Explorer");
    }

//    @Test  TODO Safari Test on MacOS
//    public void safaryTest() throws AWTException {
//        BrowserPage browserPage = new BrowserPage();
//        browserPage.testAltLetterCombinationKey("Safari");
//        browserPage.testCtrlLetterCombinationKey("Safari");
//        browserPage.testAltNumberKeyInNewBrowserWindow("Safari");
//        browserPage.testCtrlNumberInNewBrowserWindow("Safari");
//    }

}
