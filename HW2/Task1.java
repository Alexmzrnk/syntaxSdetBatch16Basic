package HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.*;

public class Task1 {
    /*
    HW  (only use XPATH)
navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser
Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking on Create new account
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tony");
        driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Stark");
        driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("212-970-4133");
        driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("02345STRK9876");
        driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Jul");
        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("4");
        driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1988");
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        Thread.sleep(1000);
        driver.quit();

    }
}
