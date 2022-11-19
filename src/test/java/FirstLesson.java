import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstLesson {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        WebDriver star=new ChromeDriver();
        star.get("https://www.google.com/");
        WebElement searchInput=star.findElement(By.name("q"));
        String searchValue="selenium";
        searchInput.sendKeys(searchValue+ Keys.RETURN);
//        WebElement searchButton=driver.findElement(By.xpath("//input[@class='gNO89b']"));
//        searchButton.click();
        if (star.getCurrentUrl().contains(searchValue)){
            System.out.println(star.getCurrentUrl());
            System.out.println("Url test passed");
        }else {
            System.out.println("Url test Failed");
        }
        String testTitle=star.getTitle().contains(searchValue)?"TITLE TEST PASSED":"TITLE TEST FAILED";
        System.out.println(testTitle);
      //  System.out.println(star.getPageSource());;
        star.get("file:///Users/techtorialacademy/Desktop/main.html");
        String headerOfPage=star.findElement(By.className("classname001")).getText();
        if (headerOfPage.equals("Elon Musk")){
            System.out.println("Test Status: Pass!");
        }else {
            System.out.println("Test Status: Failed!");
        }
        System.out.println(star.findElement(By.linkText("Tesla")).getText());
        System.out.println(star.findElement(By.name("technical header")).getText());
        star.findElement(By.partialLinkText("Contact")).click();


    }
}
