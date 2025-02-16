package org.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private WebDriver driver;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
    }


    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
