package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement createAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccount.click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Yulia");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Melnikova");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("email");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123fhhfhf");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();

        Thread.sleep(3000);


        driver.close();

    }
}
