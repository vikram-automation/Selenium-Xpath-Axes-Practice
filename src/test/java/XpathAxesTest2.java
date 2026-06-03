import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class XpathAxesTest2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qabloglist.ccbp.tech/");
        List<WebElement> blogtitlesel = driver.findElements(By.xpath("//h1[text()='My fifth post']/preceding::h1[@class='blog-title']"));
        for(WebElement el :blogtitlesel){
            String titles = el.getText();
            System.out.println(titles);
        }
        List<WebElement> linklist = driver.findElements(By.xpath("//a[text()='Home']/following::a"));
        WebElement firstlink = linklist.get(0);
        firstlink.click();
        String expectedurl = "https://qabloglist.ccbp.tech/about";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedurl));
        String currenturl = driver.getCurrentUrl();
        if(expectedurl.equals(currenturl)){
            System.out.println("Navigation to About Page Successful");
        }else{
            System.out.println("Navigation to About Page Failed  ");
        }
        WebElement secondlink = linklist.get(1);
        secondlink.click();
        String expectedurl2 = "https://qabloglist.ccbp.tech/contact";
        wait.until(ExpectedConditions.urlToBe(expectedurl2));
        String currenturl2 = driver.getCurrentUrl();
        if(expectedurl2.equals(currenturl2)){
            System.out.println("Navigation to Contact Page Successful");
        }else{
            System.out.println("Navigation to Contact Page Failed");
        }
     driver.quit();
    }
}
