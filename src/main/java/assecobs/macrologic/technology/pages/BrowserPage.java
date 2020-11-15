package assecobs.macrologic.technology.pages;

import assecobs.macrologic.technology.framework.BrowserManager;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

import static assecobs.macrologic.technology.framework.BrowserManager.getDriver;
import static assecobs.macrologic.technology.framework.Navigator.TEST_URL;

public class BrowserPage {

    public static void pause() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void testKeys() throws AWTException {

        Robot rb = new Robot();

        for (int i = KeyEvent.VK_A; i <= KeyEvent.VK_Z; i++) {
            rb.keyPress(KeyEvent.VK_ALT);
            rb.keyPress(i);
            rb.keyRelease(KeyEvent.VK_ALT);
            rb.keyRelease(i);
            System.out.println("Selenium ALT + " + (char) i);
            pause();
        }

        for (int i = KeyEvent.VK_A; i <= KeyEvent.VK_Z; i++) {
            switch (i) {
                case KeyEvent.VK_N:
                case KeyEvent.VK_T:
                case KeyEvent.VK_W:
                    continue;
                default:
                    break;
            }
            rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(i);
            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyRelease(i);

            System.out.println("Selenium pressed CTRL + " + (char) i);
            pause();
        }

        for (int i = KeyEvent.VK_0; i <= KeyEvent.VK_9; i++) {
            rb.keyPress(KeyEvent.VK_ALT);
            rb.keyPress(i);
            rb.keyRelease(KeyEvent.VK_ALT);
            rb.keyRelease(i);
            System.out.println("Selenium ALT + " + (char) i);
            pause();
        }

        for (int i = KeyEvent.VK_0; i <= KeyEvent.VK_9; i++) {          //TODO replace loop on lambda
            rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(i);
            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyRelease(i);
            System.out.println("Selenium ALT + " + (char) i);
            pause();
        }
    }

    private void initBrowser(String browser) {
        switch (browser) {
            case "Chrome":
                BrowserManager.openBrowser(new ChromeDriver());
                break;
            case "Opera":
                BrowserManager.openBrowser(new OperaDriver());
                break;
            case "Firefox":
                BrowserManager.openBrowser(new FirefoxDriver());
                break;
            case "Edge":
                BrowserManager.openBrowser(new EdgeDriver());
                break;
            case "Explorer":
                BrowserManager.openBrowser(new InternetExplorerDriver());
                break;
            case "Safari":
                BrowserManager.openBrowser(new SafariDriver());
                break;
        }
    }

    public void testAltLetterCombinationKey(String browser) throws AWTException {
        Robot rb = new Robot();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(browser).append("\n").append("Test");
        for (int i = KeyEvent.VK_A; i <= KeyEvent.VK_Z; i++) {
            this.initBrowser(browser);
            getDriver().navigate().to(TEST_URL);
            TestPage testPage = PageFactory.initElements(getDriver(), TestPage.class);

            rb.keyPress(KeyEvent.VK_ALT);
            rb.keyPress(i);
            rb.keyRelease(KeyEvent.VK_ALT);
            rb.keyRelease(i);

            System.out.println();
            pause();
            try {
                if (testPage.getElement().getText().length() > 2) {
                    stringBuilder.append("Selenium ALT + " + (char) i + " Success \n");
                } else {
                    stringBuilder.append("Selenium ALT + " + (char) i + " Failed \n");
                }
            } catch (WebDriverException webException) {
                stringBuilder.append("Selenium ALT + " + (char) i + " Failed \n");
            }
            BrowserManager.closeBrowser();
            pause();
        }
        System.out.println(stringBuilder);
    }

    public void testCtrlLetterCombinationKey(String browser) throws AWTException {
        Robot rb = new Robot();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(browser).append("\n").append("Test");
        for (int i = KeyEvent.VK_A; i <= KeyEvent.VK_Z; i++) {
            this.initBrowser(browser);
            getDriver().navigate().to(TEST_URL);
            TestPage testPage = PageFactory.initElements(getDriver(), TestPage.class);

            rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(i);
            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyRelease(i);

            System.out.println();
            pause();

            try {
                if (testPage.getElement().getText().length() > 2) {
                    stringBuilder.append("Selenium Ctrl + " + (char) i + " Success \n");
                } else {
                    stringBuilder.append("Selenium Ctrl + " + (char) i + " Failed \n");
                }
            } catch (WebDriverException webException) {
                stringBuilder.append("Selenium Ctrl + " + (char) i + " Failed \n");
            }
            BrowserManager.closeBrowser();
        }
        System.out.println(stringBuilder.toString());
    }

    public void testCtrlNumberInNewBrowserWindow(String browser) throws AWTException {
        Robot rb = new Robot();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(browser).append("\n").append("Test");
        for (int i = KeyEvent.VK_0; i <= KeyEvent.VK_9; i++) {
            this.initBrowser(browser);
            getDriver().navigate().to(TEST_URL);
            TestPage testPage = PageFactory.initElements(getDriver(), TestPage.class);

            rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(i);
            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyRelease(i);

            System.out.println();
            pause();

            try {
                if (testPage.getElement().getText().length() > 2) {
                    stringBuilder.append("Selenium Ctrl + " + (char) i + " Success \n");
                } else {
                    stringBuilder.append("Selenium Ctrl + " + (char) i + " Failed \n");
                }
            } catch (WebDriverException webException) {
                stringBuilder.append("Selenium Ctrl + " + (char) i + " Failed \n");
            }
            BrowserManager.closeBrowser();
        }
        System.out.println(stringBuilder.toString());
    }

    public void testAltNumberKeyInNewBrowserWindow(String browser) throws AWTException {
        Robot rb = new Robot();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(browser).append("\n").append("Test");
        for (int i = KeyEvent.VK_0; i <= KeyEvent.VK_9; i++) {
            this.initBrowser(browser);
            getDriver().navigate().to(TEST_URL);
            TestPage testPage = PageFactory.initElements(getDriver(), TestPage.class);

            rb.keyPress(KeyEvent.VK_ALT);
            rb.keyPress(i);
            rb.keyRelease(KeyEvent.VK_ALT);
            rb.keyRelease(i);

            System.out.println();
            pause();

            try {
                if (testPage.getElement().getText().length() > 2) {
                    stringBuilder.append("Selenium Alt + ").append((char) i).append(" Success \n");
                } else {
                    stringBuilder.append("Selenium Alt + ").append((char) i).append(" Failed \n");
                }
            } catch (WebDriverException webException) {
                stringBuilder.append("Selenium Alt + ").append((char) i).append(" Failed \n");
            }
            BrowserManager.closeBrowser();
        }
        System.out.println(stringBuilder.toString());
    }

}
