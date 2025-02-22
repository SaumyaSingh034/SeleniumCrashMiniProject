package InterviewPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
    public WebDriver driver;
    
    @Test
    public void selectUsage(){
        WebElement element = driver.findElement(By.id(""));
        Select select = new Select(element);
        select.selectByIndex(1);
        select.selectByValue("test");
        select.selectByVisibleText("tsestts");

    }
    
}
