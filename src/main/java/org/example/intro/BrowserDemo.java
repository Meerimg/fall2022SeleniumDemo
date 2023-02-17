package org.example.intro;

import org.openqa.selenium.devtools.v106.browser.Browser;
import org.testng.annotations.Test;

public class BrowserDemo extends BaseTest{



    @Test
    public void test1(){
        browserHelper.openURL("https://demoqa.com/browser-windows");

    }
}
