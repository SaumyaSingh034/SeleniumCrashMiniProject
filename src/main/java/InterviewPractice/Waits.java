package InterviewPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Waits {
    public WebDriver driver;

    @Test
    public void testWaits(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("")));

        //Fluyent
        Wait fWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class);


    }


    @Test
    public void windows(){
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String defaultWindow = iterator.next();
        String clid = iterator.next();
        driver.switchTo().window(clid);
    }
}
