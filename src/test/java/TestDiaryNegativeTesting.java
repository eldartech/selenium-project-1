import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestDiaryNegativeTesting {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.testdiary.com/training/selenium/selenium-test-page/");
        WebElement sendButton=driver.findElement(By.xpath("//div//input[@value='Send']"));
        sendButton.click();
        Thread.sleep(2000);
        WebElement failureMessage=driver.findElement(By.xpath("//form/div[@role='alert']"));

        String expectedFailureMessage="Validation errors occurred. Please confirm the fields and submit it again.";
        Validate.equals(failureMessage.getText(),expectedFailureMessage);

        List<WebElement> labels = driver.findElements(By.xpath("//span[@role='alert']"));
        String expectedAlertColor="rgba(255, 0, 0, 1)";//red
        for (WebElement label: labels){
            Validate.equals(label.getCssValue("color"),expectedAlertColor);
        }
    }
}
