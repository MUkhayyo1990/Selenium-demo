import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TastCaseAutomationWithAssertion {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

      String expectedUrl = "https://www.google.com/";
       String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        Assert.assertEquals(driver.getTitle(),"Google");

       // driver.close();
        driver.quit();


    }
}
