package HW4;
/*
HW1:
goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
select , tuesday, thursday and friday one by one
 */

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url,browser);

        WebElement days=driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select day=new Select(days);


        day.selectByValue("Tuesday");

        Thread.sleep(2000);

        day.selectByVisibleText("Thursday");

        Thread.sleep(2000);

        day.selectByVisibleText("Friday");






    }

}
