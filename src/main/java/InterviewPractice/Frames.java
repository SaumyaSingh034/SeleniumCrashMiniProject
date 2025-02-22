package InterviewPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
    public WebDriver driver;

    @Test
    public void testFrames(){
        driver.switchTo().frame(1);
        driver.switchTo().frame("name");
        driver.switchTo().frame(driver.findElement(By.id("")));
    }

    @Test
    public void actions(){
        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(By.id("")));
        actions.sendKeys(Keys.ENTER);

        actions.keyDown(Keys.SHIFT);
        actions.sendKeys("tutorialPojnt");

    }
}
