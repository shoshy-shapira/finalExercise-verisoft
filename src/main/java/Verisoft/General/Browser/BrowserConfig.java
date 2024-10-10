package Verisoft;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserConfig {
    public void setup() {
        WebDriverManager.chromedriver().setup();
    }

}
