package Homework5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static Utils.CommonMethods.driver;
import static Utils.CommonMethods.openBrowserAndLaunchApplication;

public class task1 {
    public static void main(String[] args) {
        String URL="http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(URL, browser);
        WebElement btn = driver.findElement(By.xpath("//button[@id='startButton']"));
        btn.click();
        WebElement message=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElement(message,"Welcome Syntax Technologies"));
        String text= message.getText();
        System.out.println(text);
    }
}
