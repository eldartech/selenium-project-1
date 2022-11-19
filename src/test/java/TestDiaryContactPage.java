import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDiaryContactPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","driver/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");
        WebElement name=driver.findElement(By.name("your-name"));
        name.clear();
        name.sendKeys("John Doe");
        WebElement email = driver.findElement(By.name("your-email"));
        email.clear();
        email.sendKeys("john@yahoo.com");
        WebElement subject = driver.findElement(By.name("your-subject"));
        subject.clear();
        subject.sendKeys("Selenium Locators");
        WebElement message = driver.findElement(By.name("your-message"));
        message.clear();
        message.sendKeys("I want to learn Selenium Automation.");
        WebElement sendButton=driver.findElement(By.xpath("//input[@value='Send']"));
        sendButton.click();
        Thread.sleep(3000);
        WebElement successMessage = driver.findElement(By.xpath("//form/div[@role='alert']"));//xpath= (//div[@role='alert'])[2]
        String expectedMessage = "Your message was sent successfully. Thanks.";
        Validate.equals(successMessage.getText(),expectedMessage);
    }

    /*
    Create a method which will compare 2 Strings
    if it is not matching you should print "Verification Failed.\n Expected: \n Actual: values
    if it is matching you should print "Verification Passed"

     */



}
