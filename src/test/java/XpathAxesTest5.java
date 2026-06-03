import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesTest5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaadditiongame.ccbp.tech/");
        boolean  successcase= false;
        boolean  failurecase= false;
        WebElement randomnum1 = driver.findElement(By.xpath("//input[@id='userInput']/preceding-sibling::*[4]"));
        WebElement randomnum2 = driver.findElement(By.xpath("//input[@id='userInput']/preceding-sibling::*[2]"));
        String textnum1 = randomnum1.getText();
        String textnum2 = randomnum2.getText();
        int num1 = Integer.parseInt(textnum1);
        int num2 = Integer.parseInt(textnum2);
        int totalsum = num1 + num2;
        WebElement userinputel = driver.findElement(By.xpath("//input[@id='userInput']"));
        userinputel.sendKeys(String.valueOf(totalsum));
        WebElement checkbtnel = driver.findElement(By.xpath("//input[@id='userInput']/following::div/button[1]"));
        checkbtnel.click();
        WebElement descriptionel = driver.findElement(By.xpath("//input[@id='userInput']/following-sibling::p"));
        String expectedstatus1 = "Congratulations! You got it right.";
        String actualstatus1 = descriptionel.getText();
        if (expectedstatus1.equals(actualstatus1)) {
            System.out.println("Success Case Checked");
            successcase = true;
        } else {
            System.out.println("Error at Success Case");
        }
        WebElement restartbtnel = driver.findElement(By.xpath("//input[@id='userInput']/following::div/button[2]"));
        restartbtnel.click();
        WebElement randomnum3 = driver.findElement(By.xpath("//input[@id='userInput']/preceding-sibling::*[4]"));
        WebElement randomnum4 = driver.findElement(By.xpath("//input[@id='userInput']/preceding-sibling::*[2]"));
        String textnum3 = randomnum3.getText();
        String textnum4 = randomnum4.getText();
        int num3 = Integer.parseInt(textnum4);
        int num4 = Integer.parseInt(textnum4);
        int totaldiff = num3 - num4;
        userinputel.sendKeys(String.valueOf(totaldiff));
        checkbtnel.click();
        WebElement descriptionel2 = driver.findElement(By.xpath("//input[@id='userInput']/following-sibling::p"));
        String expectedstatus2 = "Please Try Again!";
        String actualstatus2 = descriptionel2.getText();
        if (expectedstatus2.equals(actualstatus2)) {
            System.out.println("Failure Case Checked");
            failurecase = true;

        } else {
            System.out.println("Error at Failure Case");

        }
        if(successcase && failurecase){
            System.out.println("Addition Game Working as Expected");
        }else{
            System.out.println("Unexpected Behaviour");
        }
        driver.quit();
    }
}