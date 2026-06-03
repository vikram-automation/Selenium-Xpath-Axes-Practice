import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class XpathAxesTest4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qamobilespecs.ccbp.tech/");
        List<WebElement> specificationlist = driver.findElements(By.xpath("//li[text()='3 GB RAM']/following-sibling::li"));
        ArrayList<String> specificationtextlist = new ArrayList<String>();
        for(WebElement text:specificationlist){
            String option = text.getText();
            specificationtextlist.add(option);
        }
        String[] expectedorder = {"5.80 Super Retina HD OLED Display","Front Camera 7MP","Rear Camera 12MP + 12MP","Apple A11 Bionic Processor","Battery Capacity 2716mAH" };
        int i = 0;
        for(i=0;i<5;i++){
            if(!expectedorder[i].equals(specificationtextlist.get(i))){
                System.out.println("Mismatch Found in Specifications");
                break;
            }
        }
        if(i==5){
            System.out.println("Verified Specifications");
        }
        WebElement headingel = driver.findElement(By.xpath("//li[text()='3 GB RAM']/parent::ul/preceding-sibling::h1"));
        String expectedheading = "Specifications:";
        String actualheading = headingel.getText();
        if(actualheading.equals(expectedheading)){
            System.out.println("Verified Heading");
        }else{
            System.out.println("Mismatch Found in Heading");
        }
        WebElement buynowbtnel = driver.findElement(By.xpath("//li[text()='3 GB RAM']/parent::ul/following::button[text()='Buy Now']"));
        buynowbtnel.click();
        System.out.println("button clicked");


    }
}
