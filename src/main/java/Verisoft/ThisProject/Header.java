package Verisoft.ThisProject;

import Verisoft.General.AditStoreAnnotations;
import Verisoft.General.Browser.Browser;
import Verisoft.General.ClickActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AditStore {
    private final Browser browser;
    @FindBy (xpath = "//*[@id=\"menu-item-671\"]/a")
    private WebElement accessoriesLink;

private ClickActions clickActions;//initialization ClickActions
    public AditStore(Browser browser) {
        this.browser=browser;
        //init element
        PageFactory.initElements(browser.getDriver(), this);
        this.clickActions = new ClickActions();//realization ClickActions
    }

    public void clickAccessoriesLink(){
        clickActions.clickElement(accessoriesLink);
        browser.waitForPageLoad();

    }

    }

