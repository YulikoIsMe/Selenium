package Homework4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Utils.CommonMethods.driver;
import static Utils.CommonMethods.openBrowserAndLaunchApplication;

public class task1 {
    /*HW1:
goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
select , tuesday, thursday and friday one by one*/
    public static void main(String[] args) throws InterruptedException {


        String URL = "http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(URL, browser);
        WebElement days=driver.findElement(By.xpath("//*[@id=\"select-demo\"]"));
        Select sel=new Select(days);
        sel.selectByIndex(3);
        Thread.sleep(3000);
        sel.selectByVisibleText("Thursday");
        Thread.sleep(3000);
        sel.selectByIndex(6);
        Thread.sleep(3000);
        driver.quit();
    }
}