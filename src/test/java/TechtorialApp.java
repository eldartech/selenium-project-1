import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TechtorialApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///Users/techtorialacademy/Downloads/Techtorial%20(2).html");
        List<WebElement> menuOptions = driver.findElements(By.cssSelector("td.mouseOut"));
        ArrayList<String> expectedMenuOptions = new ArrayList<>(Arrays.asList("SIGN-ON","REGISTER","SUPPORT","CONTACT"));
        Validate.equals(menuOptions,expectedMenuOptions);
        List<WebElement> leftNavOptions = driver.findElements(By.cssSelector("tr.mouseOut"));
        ArrayList<String> expectedLeftNav = new ArrayList<>(Arrays.asList("Home","Java","Selenium","Cucumber","TestNG","Rest Api","SQL"));
        Validate.equals(leftNavOptions,expectedLeftNav);



    }
}
