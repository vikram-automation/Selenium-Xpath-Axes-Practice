import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathAxesTest3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qafeaturesect.ccbp.tech/");
        WebElement spanel = driver.findElement(By.xpath("//span[@class='interaction']"));
        System.out.println(spanel.getText());
        WebElement parentel = driver.findElement(By.xpath("//span[@class='interaction']/parent::p"));
        System.out.println(parentel.getText());
        List<WebElement> descriptionel = driver.findElements(By.xpath("//h1[text()='Interaction']/ancestor::div[2]/following-sibling::div//p"));
        for(WebElement text : descriptionel){
            System.out.println(text.getText());
        }
        List<WebElement> descriptionel2 = driver.findElements(By.xpath("//h1[text()='Interaction']/ancestor::div[2]/preceding-sibling::div//p"));
        for(WebElement text2 : descriptionel2){
            System.out.println(text2.getText());
        }
        driver.quit();
    }
}
