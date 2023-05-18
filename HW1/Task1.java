package HW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
close the browser
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Tony");
        driver.findElement(By.name("customer.lastName")).sendKeys("Stark");
        driver.findElement(By.id("customer.address.street")).sendKeys("10-8-80 Malibu Point");
        driver.findElement(By.name("customer.address.city")).sendKeys("Malibu");
        driver.findElement(By.id("customer.address.state")).sendKeys("CA");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("90265");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("212-970-4133");
        driver.findElement(By.id("customer.ssn")).sendKeys("987-65-4320");

        driver.findElement(By.name("customer.username")).sendKeys("STRK_TN");
        driver.findElement(By.id("customer.password")).sendKeys("02345STRK9876");
        driver.findElement(By.name("repeatedPassword")).sendKeys("02345STRK9876");
        Thread.sleep(3000);
        driver.close();


    }

}
