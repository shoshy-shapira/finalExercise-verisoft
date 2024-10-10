package Verisoft;

import org.openqa.selenium.WebDriver;

public interface Browser {

    void open(String url);
    void maximize();
    void quit();
    WebDriver getDriver();


}
