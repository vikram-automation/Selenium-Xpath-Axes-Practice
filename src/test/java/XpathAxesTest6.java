import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class XpathAxesTest6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaservicesect.ccbp.tech/");
        List<WebElement> headingel = driver.findElements(By.xpath("//h1[text()='Online Support 24/7']/ancestor::div[2]/preceding::div[contains(@class, 'shadow')]/h1"));
        ArrayList<String> headingtextel = new ArrayList<String>();
        for(WebElement text: headingel){
            String option = text.getText();
            headingtextel.add(option);
        }
        String[] expectedorder1 = {"Fast and Free Delivery","100% Money back guarantee" };
        int i = 0;
        for(i=0;i<2;i++){
            if(!expectedorder1[i].equals(headingtextel.get(i))){
                System.out.println("Mismatch Found in Titles");
                break;
            }
        }
        if(i==2){
            System.out.println("Titles checked");
        }
        List<WebElement> descriptionel = driver.findElements(By.xpath("//h1[text()='Online Support 24/7']/ancestor::div[2]/preceding::div[contains(@class,'shadow')]/p"));
        ArrayList<String> descriptiontextel = new ArrayList<String>();
        for(WebElement p : descriptionel){
            String textlist = p.getText();
            descriptiontextel.add(textlist);

        }
        String[] expectedorder2 = {"Fast, free, and convenient delivery choices on millions of items.","This is probably the most popular guarantee in the world."};
        int j = 0;
        for(j=0;j<2;j++){
            if(!expectedorder2[j].equals(descriptiontextel.get(j))){
                System.out.println("Mismatch Found in Descriptions");
                break;
            }

        }
        if(j==2){
            System.out.println("Descriptions Checked");
        }
        List<WebElement> headanddesel = driver.findElements(By.xpath("//h1[text()='Online Support 24/7']/ancestor::div[2]/preceding::div[5]/child::*"));
        for(WebElement head:headanddesel){
            System.out.println(head.getText());
        }
        WebElement HeadingEl = driver.findElement(By.xpath("//h1[text()='Online Support 24/7']/ancestor::div[2]/preceding::div[5]/child::h1"));
        String expectedheading = "Our Services";
        String actualheading = HeadingEl.getText();
        WebElement descriptionEl = driver.findElement(By.xpath("//h1[text()='Online Support 24/7']/ancestor::div[2]/preceding::div[5]/child::p"));
        String expectedheading2 = "Most online stores offer lower prices. Online shopping makes price comparison simpler and quicker. It is very convenient to shop from where you are located. It saves you the cost of driving to stores, as well as parking fees.";
        String actualheading2 = descriptionEl.getText();
        if(actualheading.equals(expectedheading) && actualheading2.equals(expectedheading2)){
            System.out.println("Section Header Checked");
        }else{
            System.out.println("Mismatch Found in Section Header");
        }

    }
}
