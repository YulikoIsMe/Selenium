package Homework4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Utils.CommonMethods.driver;
import static Utils.CommonMethods.openBrowserAndLaunchApplication;

public class task2 {
   /* hw2:
            goto facebook.com
    click on create account
    and select your  date of birth using select class*/
   public static void main(String[] args) throws InterruptedException {

       String URL = "http://facebook.com";
       String browser = "chrome";
       openBrowserAndLaunchApplication(URL, browser);

       WebElement createNewAccount = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
       createNewAccount.click();

       Thread.sleep(2000);

       WebElement days=driver.findElement(By.xpath("//select[@id='day']"));

       Select sel=new Select(days);

       sel.selectByVisibleText("25");
Thread.sleep(2000);
       sel.selectByValue("25");
       Thread.sleep(2000);
       sel.selectByIndex(24);
       Thread.sleep(2000);
       driver.quit();
   }
}
