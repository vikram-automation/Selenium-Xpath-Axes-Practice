import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathAxesTest7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaquestion.ccbp.tech/");
        WebElement childel = driver.findElement(By.xpath("//form[@id='questionsForm']/child::h1"));
        String expectedtext = "What is the capital of India?";
        if (expectedtext.equals(childel.getText())) {
            System.out.println("Question Checked");
        } else {
            System.out.println("Mismatch Found in Question");
        }
        WebElement buttonel = driver.findElement(By.xpath("//form[@id='questionsForm']/child::div[2]/button"));
        buttonel.click();
        WebElement messegeel = driver.findElement(By.xpath("//form[@id='questionsForm']/child::div[2]/p"));
        String expectedmessege = "Please select the City!";
        if (expectedmessege.equals(messegeel.getText())) {
            System.out.println("Missing Option Case Checked");
        } else {
            System.out.println("Error Occured for Missing Option Case");
        }
        List<WebElement> radiobtnel = driver.findElements(By.xpath("//form[@id='questionsForm']/descendant::div/input"));
        List<WebElement> labelel = driver.findElements(By.xpath("//form[@id='questionsForm']/descendant::div/label"));
        boolean errorOccured = false;
        for (int i = 0; i < radiobtnel.size(); i++) {
            WebElement radioButton = radiobtnel.get(i);
            WebElement label = labelel.get(i);
            String optionText = label.getText();
            radioButton.click();
            buttonel = driver.findElement(By.xpath("//form[@id='questionsForm']/child::div[2]/button"));
            buttonel.click();
            messegeel = driver.findElement(By.xpath("//form[@id='questionsForm']/child::div[2]/p"));
            String actualResult = messegeel.getText();
            if (optionText.equals("Delhi")) {
                if (!actualResult.equals("Correct Answer!")) {
                    System.out.println("error occured in delhi Case");
                    errorOccured = true;
                }
            } else {
                if (!actualResult.equals("Wrong Answer!")) {
                    System.out.println("error occure" + optionText + "Case");
                    errorOccured = true;
                }
            }
        }
        if (!errorOccured) {
            System.out.println("Question Page Working as Expected");
        } else {
            System.out.println("Unexpected Behaviour");
        }
        driver.quit();
    }
}