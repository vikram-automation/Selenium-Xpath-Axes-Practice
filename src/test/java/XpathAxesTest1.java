import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class XpathAxesTest1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qacapitalsapp.ccbp.tech/");
        List<WebElement> countrylist = driver.findElements(By.xpath("//select[@class='capital-select']/child::option"));
        ArrayList<String> countrytextlist = new ArrayList();
        for(WebElement option : countrylist){
            String text = option.getText();
            countrytextlist.add(text);
        }
        String[] expectedArray = {"New Delhi","London","Paris","Kathmandu","Helsinki"};
        int i=0;
        for(i=0; i<5; i++){
            if(!expectedArray[i].equals(countrytextlist.get(i))){
                System.out.println("Mismatch found");
                break;
            }
            }
        if(i == 5){
            System.out.println("All options are expected");
        }
    }
}
