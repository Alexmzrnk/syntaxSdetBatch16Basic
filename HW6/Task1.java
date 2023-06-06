package HW6;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
HW1:
goto  http://practice.syntaxtechs.net/dynamic-elements-loading.php
click on start
print the text  "welcome syntax technologies "on console

 */
public class Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url= "http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url,browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement strtBtn=driver.findElement(By.xpath("//button[@id='startButton']"));
        strtBtn.click();
        WebElement text=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[text()='Welcome Syntax Technologies']")));
        System.out.println(text.getText());
        driver.close();






    }
}
