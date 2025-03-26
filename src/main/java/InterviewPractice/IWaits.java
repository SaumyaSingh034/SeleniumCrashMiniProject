package InterviewPractice;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;

public class IWaits {

    public WebDriver driver;
    By test = By.id(" ");
    @FindBy(id = "test")
    WebElement data;

    @Test
    public void waitsTest(){

        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        Select select = new Select(data);
        List<WebElement> selectOptions = select.getOptions();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("x`");

        Alert alert = driver.switchTo().alert();
        //alert.
        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.cssSelector("#id"));
        WebElement destination = driver.findElement(By.cssSelector(".classname"));
        actions.dragAndDrop(source, destination).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='hello']")));

        Wait fWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(ElementNotInteractableException.class);


    }
}
