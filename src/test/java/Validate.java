import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Validate {
    public static void equals(String actual, String expected){
        if (actual.length()==expected.length()){
            if (actual.equals(expected)){
                System.out.println("Verification Passed.");
            }else {
                System.out.println("Verification Failed\nExpected: "+expected+"\nActual: "+actual);
            }
        }else {
            System.out.println("Verification Failed\nExpected: "+expected+"\nActual: "+actual);
        }
    }


    public static void equals(ArrayList<String> actualList, ArrayList<String> expectedList){
        if (actualList.size()==expectedList.size()){
            if (actualList.equals(expectedList)){
                System.out.println("Verification of List of Strings Passed.");
            }else {
                System.out.println("Verification Failed: ");
                for (int i=0;i<expectedList.size();i++){
                    if (!actualList.get(i).equals(expectedList.get(i))){
                        System.out.println("Expected: "+expectedList.get(i));
                        System.out.println("Actual: "+actualList.get(i));
                    }
                }
            }
        }else {
            System.out.println("Verification Failed\nExpected Size: "+expectedList.size()+"\nActual Size: "+actualList.size());
        }
    }

    public static void equals(List<WebElement> elements, ArrayList<String> expectedList){
        ArrayList<String> actualList=new ArrayList<>();
        for (int i=0;i<elements.size();i++){
            actualList.add(elements.get(i).getText());
        }
        equals(actualList,expectedList);

    }


}
