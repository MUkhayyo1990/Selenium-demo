import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        String CurrentUrl = driver.getCurrentUrl();
        System.out.println(CurrentUrl);

        String title = driver.getTitle();
        System.out.println(title);

        String pageSource = driver.getPageSource();
        System.out.println("---------------------");
        System.out.println(pageSource);
        System.out.println("-----------------------");
        if (pageSource.contains("Watch Now")){
            System.out.println("Correct Page");
        }else {
            System.out.println("Wrong Page");
        }
    }
}
