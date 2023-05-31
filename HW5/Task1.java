package HW5;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*
http://practice.syntaxtechs.net/javascript-alert-box-demo.php
click on the last alert
send keys and accept it

Note: dont worry if the text u send doesnt appears up in the textbox
 */

public class Task1 extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url,browser);

        WebElement btn3=driver.findElement(By.xpath("//button[text()=\"Click for Prompt Box\"]"));

        btn3.click();
        Thread.sleep(3000);
        Alert confirmationAlertBtn3=driver.switchTo().alert();
        confirmationAlertBtn3.sendKeys("sssssss");
        confirmationAlertBtn3.accept();




    }
}
