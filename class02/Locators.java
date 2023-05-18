package class02;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        //declare the instance
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        //max screen
        driver.manage().window().maximize();
        // find teh element username box
        WebElement userNameTextBox=driver.findElement(By.id("txtUsername"));
        userNameTextBox.sendKeys("Admin");
        //the both are the sam
       // driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        //slow dowm
       Thread.sleep(2000);

        //after sending the username to the text box claer the text box
        userNameTextBox.clear();

        userNameTextBox.sendKeys("Admin");

        //find the password

        WebElement pass=driver.findElement(By.name("txtPassword"));
        pass.sendKeys("Hum@nhrm123");

        WebElement loginBtn=driver.findElement(By.className("button"));
        loginBtn.click();

        //get the welcom messadge
       WebElement message = driver.findElement(By.linkText("Welcome Admin"));
       String text = message.getText();
        System.out.println(text);

        driver.findElement(By.partialLinkText("Recru")).click();








    }
}
