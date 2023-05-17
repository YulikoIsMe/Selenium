package Homework;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("Test");
        String title=driver.getTitle();
        if(title.equals("Web Orders Login")){
            System.out.println("Title confirmed");
        }else{
            System.out.println("Title is incorrect");
        }Thread.sleep(3000);
        driver.quit();
    }
}
