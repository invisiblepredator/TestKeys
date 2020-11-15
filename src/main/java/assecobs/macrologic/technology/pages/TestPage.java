package assecobs.macrologic.technology.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestPage {

    @FindBy(id = "list")
    private WebElement element;

    public WebElement getElement() {
        return element;
    }
}
