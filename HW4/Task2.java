package HW4;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
goto facebook.com
 click on create account
and select the your  date of birth using select class
 */
public class Task2 extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {

        String url= "https://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApp(url,browser);

       WebElement createNewAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createNewAccount.click();

        Thread.sleep(3000);

        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select m=new Select(month);
        m.selectByValue("9");

        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select d=new Select(day);
        d.selectByVisibleText("9");

        WebElement year =  driver.findElement(By.xpath("//select[@id='year']"));
        Select y=new Select(year);
        y.selectByVisibleText("1999");


    }
}
