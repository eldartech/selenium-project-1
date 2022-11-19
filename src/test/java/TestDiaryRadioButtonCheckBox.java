import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestDiaryRadioButtonCheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");
        WebElement saveButton = webDriver.findElement(By.id("demo"));
        if (saveButton.isDisplayed()){
            System.out.println("Save Button Test Passed: isDisplayed");
        }else {
            System.out.println("Save Button Test Failed: isDisplayed");
        }

        if (saveButton.isEnabled()){
            System.out.println("Save Button Test Passed: isEnabled");
        }else {
            System.out.println("Save Button Test Failed: isEnabled");
        }

        List<WebElement> radioButtons= webDriver.findElements(By.xpath("//input[@type='radio']"));
        radioButtons.get(0).click();
        if (radioButtons.get(0).isSelected()){
            System.out.println(radioButtons.get(0).getAttribute("value")+" is selected.");
            if (!radioButtons.get(1).isSelected()){
                System.out.println(radioButtons.get(1).getAttribute("value")+" is not selected.");

            }
        }else {
            System.out.println(radioButtons.get(0).getAttribute("value")+" is not selected.");
        }

        List<WebElement> checkBoxes= webDriver.findElements(By.xpath("//input[@type='checkbox']"));
        if (checkBoxes.get(1).isSelected() && !checkBoxes.get(0).isSelected()){
            System.out.println("Default Selection of Check Box Test");
            System.out.println(checkBoxes.get(1).getAttribute("name")+ " is selected");
        }else {
            System.out.println("Default Selection of Check Box Test");
            System.out.println(checkBoxes.get(1).getAttribute("name")+ " is not selected");
        }

        checkBoxes.get(0).click();
        if (checkBoxes.get(1).isSelected() && checkBoxes.get(0).isSelected()){
            System.out.println("All Check Boxes Selected Test");
            System.out.println(checkBoxes.get(0).getAttribute("name")+ " is selected");
            System.out.println(checkBoxes.get(1).getAttribute("name")+ " is selected");
        }else {
            System.out.println("All Check Boxes Selected Test");
            System.out.println(checkBoxes.get(0).getAttribute("name")+ " is not selected");
            System.out.println(checkBoxes.get(1).getAttribute("name")+ " is not selected");
        }

        checkBoxes.get(0).click();
        checkBoxes.get(1).click();
        if (!checkBoxes.get(1).isSelected() && !checkBoxes.get(0).isSelected()){
            System.out.println("All Check Boxes Not Selected Test");
            System.out.println(checkBoxes.get(0).getAttribute("name")+ " is not selected");
            System.out.println(checkBoxes.get(1).getAttribute("name")+ " is not selected");
        }else {
            System.out.println("All Check Boxes Not Selected Test");
            System.out.println(checkBoxes.get(0).getAttribute("name")+ " is selected");
            System.out.println(checkBoxes.get(1).getAttribute("name")+ " is selected");
        }


    }
}
