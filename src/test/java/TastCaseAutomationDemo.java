import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TastCaseAutomationDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        if(driver.getCurrentUrl().equals("https://www.google.com/")){
            System.out.println("Url test PASSED");

        }else{
            System.out.println("Fail");

        }
        if(driver.getTitle().equals("Google")){
            System.out.println("Title test PASSED.");
        }else{
            System.out.println("FAIL");
        }
        driver.close();
        //driver.quit();


    }
}
