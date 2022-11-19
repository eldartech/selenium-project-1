import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class GoogleSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","driver/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("iphone"+ Keys.RETURN);
        List<WebElement> searchResults=driver.findElements(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
        System.out.println(searchResults);
        for (WebElement result:searchResults){
            System.out.println(result.getText());
        }
    }
}
