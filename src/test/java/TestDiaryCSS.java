import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDiaryCSS {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","driver/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.navigate().to("http://www.testdiary.com/");
        WebElement headingUsingCss=driver.findElement(By.cssSelector("p.description"));
        System.out.println(headingUsingCss.getAttribute("itemprop"));

    }
}
