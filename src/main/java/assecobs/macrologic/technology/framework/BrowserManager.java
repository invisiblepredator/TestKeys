package assecobs.macrologic.technology.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserManager {

    private static WebDriver browser;

    public static void openBrowser(RemoteWebDriver remoteWebDriver) {
        browser = remoteWebDriver;
    }

    public static void closeBrowser() {
        browser.quit();
    }

    public static WebDriver getDriver() {
        return browser;
    }
}
