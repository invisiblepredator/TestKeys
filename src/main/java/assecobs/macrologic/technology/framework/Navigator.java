package assecobs.macrologic.technology.framework;


import assecobs.macrologic.technology.pages.BrowserPage;

public class Navigator {

    private static final String TEST_URL = "http://localhost:8080/";

    public static BrowserPage openBrowserPage() {
        BrowserManager.getDriver().navigate().to(TEST_URL);
        return new BrowserPage();
    }
}
