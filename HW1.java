package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Yulia");
        driver.findElement(By.id("customer.lastName")).sendKeys("Melnikova");
        driver.findElement(By.id("customer.address.street")).sendKeys("5th Ave");
        driver.findElement(By.id("customer.address.city")).sendKeys("New York");
        driver.findElement(By.id("customer.address.state")).sendKeys("NY");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("10035");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("1234567");
        driver.findElement(By.id("customer.ssn")).sendKeys("999-99-9999");
        driver.findElement(By.id("customer.username")).sendKeys("blabla@me.com");
        driver.findElement(By.id("customer.password")).sendKeys("1234567");
        driver.findElement(By.id("repeatedPassword")).sendKeys("1234567");
        Thread.sleep(5000);
        driver.quit();
    }
}
