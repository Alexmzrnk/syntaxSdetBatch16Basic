package HW5;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
goto https://chercher.tech/practice/frames

click on check box
then select bay cat from drop down
then enter text in text box

 */
public class Task2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url = "https://chercher.tech/practice/frames";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);

        Thread.sleep(2000);
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
       WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
       checkBox.click();

       driver.switchTo().defaultContent();
       driver.switchTo().frame(1);

       WebElement DD=driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(DD);
        sel.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);

        WebElement textBox=driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Selenium");











    }

}
