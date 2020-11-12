package assecobs.macrologic.technology.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserManager {

    private static WebDriver browser;

    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");



//      System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); //TODO avoid path
//        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); //TODO avoid path
//        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); //TODO avoid path

        browser = new ChromeDriver();
       // browser = new FirefoxDriver();
        //browser = new OperaDriver();
        //browser = new EdgeDriver();
        //browser = new InternetExplorerDriver();

    }

    public static void closeBrowser() {
        browser.quit();
    }

    public static WebDriver getDriver() {
        return browser;
    }
}
