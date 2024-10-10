package Verisoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser implements Browser {
    private WebDriver driver;

    @Override
    public void open(String url) {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Override
    public void maximize() {
        driver.manage().window().maximize();
    }

    @Override
    public void quit() {
        if (driver != null) {
            driver.quit();
        }
    }
    @Override
    public WebDriver getDriver() {
        return driver;
    }

}
