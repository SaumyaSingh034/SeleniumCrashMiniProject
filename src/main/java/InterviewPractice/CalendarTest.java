package InterviewPractice;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarTest {

  public static void main(String[] args){

      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();

      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //URL launch
      driver.get("https://jqueryui.com/datepicker/#date%E2%88%92range");
      //identify and switch to frame
      WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame']"));
      driver.switchTo().frame(frame);
      WebElement datepicker = driver.findElement(By.id("datepicker"));
      datepicker.click();
      List<WebElement> d =driver.findElements(By.xpath("//table/tbody/tr/td"));
      //iterate list
      for (int i = 0; i<d.size(); i++) {
          //check expected data
          String s = d.get(i).getText();
          if (s.equals("2")) {
              d.get(i).click();
              break;
          }
      }
      //get data selected
      String m = datepicker.getAttribute("value");
      System.out.print("Date selected in calendar is: "+ m);
      //close browser
      //driver.quit();


  }
}
