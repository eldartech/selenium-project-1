import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.rmi.server.ExportException;
import java.sql.SQLOutput;
import java.util.List;

public class Project {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url="file:///Users/techtorialacademy/Desktop/main.html";
        driver.navigate().to(url);
        String expectedTitle="My Profile";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title test is passed");
            System.out.println("Expected: "+expectedTitle);
            System.out.println("Actual: "+actualTitle);
        } else {
            System.out.println("Title test failed");
            System.out.println("Expected: "+expectedTitle);
            System.out.println("Actual: "+actualTitle);
        }
        driver.manage().window().fullscreen();
       String actualURL=driver.getCurrentUrl();

        if (actualURL.equals(url)) {
            System.out.println("URL test is passed");
            System.out.println("Expected: "+url);
            System.out.println("Actual: "+actualURL);
        } else {
            System.out.println("URL test is failed");
            System.out.println("Expected: "+url);
            System.out.println("Actual: "+actualURL);
        }


        System.out.println(driver.findElement(By.partialLinkText("esla")).getText());
        System.out.println(driver.findElement(By.id("area001")).getText());
        if(driver.findElement(By.id("area001")).getText().contains("Area")){
            System.out.println("Id Test Passed");
        }else{
            System.out.println("Id Test Failed");
        }
       // WebElement areaOfExperience= driver.findElement(By.id("area001"));
        //WebElement work=driver.findElement(By.name("work002"));

        System.out.println(driver.findElement(By.name("work002")).getText());
        if (driver.findElement(By.name("work002")).getText().equals("Work Experience")){
            System.out.println("Name test passed");
        }else{
            System.out.println("name test failed");
        }

        driver.findElement(By.name("work002")).click();



        WebElement skills=driver.findElement(By.className("skills003"));
        System.out.println(skills.getText());
        if(skills.getText().equals("Technical Skills")){
            System.out.println("Skills Test Passed");
        }else{
            System.out.println("Skills Test Failed");
        }
        System.out.println(skills.getTagName());

        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(headings);
        String linkName="The Boring Company";
        for (WebElement link: links){
            if (link.getText().equals(linkName)){
                System.out.println(link.getAttribute("href"));
                link.click();
                break;
            }
        }

        if (driver.getTitle().equals(linkName)){
            System.out.println("Redirection Test Passed");
            System.out.println("Expected: "+ linkName);
            System.out.println("Actual: "+driver.getTitle());
        }else {
            System.out.println("Redirection Test Failed");
            System.out.println("Expected: "+ linkName);
            System.out.println("Actual: "+driver.getTitle());
        }
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        driver.navigate().back();

        System.out.println(driver.findElement(By.className("avatar")).getCssValue("width"));
        System.out.println(driver.findElement(By.className("avatar")).getSize());

        if (driver.findElement(By.className("avatar")).isDisplayed()){
            System.out.println("Image is displayed.");
        }else {
            System.out.println("Image is not displayed");
        }


       WebElement contactMe=driver.findElement(By.linkText("Contact Me"));
       contactMe.click();
       driver.navigate().refresh();
       Thread.sleep(4000);
       WebElement submitButton=driver.findElement(By.id("style"));
        if (submitButton.isEnabled()) {
            submitButton.submit();
        }else {
            System.out.println("Submit button is disabled");
        }



       driver.quit();


    }


    }
