import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestDiaryXPath {
   private static final ArrayList<String> EXPECTED_MENU_LIST =new ArrayList<>(Arrays.asList("DIARY", "TRAINING", "PROBLEMS & SOLUTIONS", "CONTACT"));

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");//set the driver
        WebDriver driver=new ChromeDriver();//launching the  browser
        driver.get("http://www.testdiary.com/");
        List<WebElement> menuItems=driver.findElements(By.xpath("//ul[@id='menu-main-2']/li/a"));
        Iterator<WebElement> iterator=menuItems.iterator();
        ArrayList<String> menuItemTexts=new ArrayList<>();

        while (iterator.hasNext()){
            menuItemTexts.add(iterator.next().getText());
        }
        Validate.equals(menuItemTexts, EXPECTED_MENU_LIST);
        driver.navigate().to("http://www.testdiary.com/training/selenium/selenium-test-page/");
        String element="//h1[contains(text(),'Selenium Test Page')]";
        //By  element1=By.xpath("//h1[contains(text(),'Selenium Test Page')]");
        WebElement headingOfPage=driver.findElement(By.xpath(element));
        String expectedHeading="Selenium Test Page";
        Validate.equals(headingOfPage.getText(),expectedHeading);
        WebElement header=driver.findElement(By.cssSelector("h1.title[itemprop='name headline']"));
        System.out.println(header.getText());


    }
}
