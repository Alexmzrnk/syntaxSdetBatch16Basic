package HW8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*
hw:
goto syntax hrms
login
click on recruitment
select a date on the calanader
Selected date 05-21-2021
 */
public class Task1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement login = driver.findElement(By.xpath("//input[contains(@id,'Login')]"));
        login.click();
        WebElement recurTab = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recurTab.click();

        WebElement clndBtn=driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"));
        clndBtn.click();
        WebElement ddMnth=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select selM=new Select(ddMnth);
        selM.selectByVisibleText("May");

        WebElement ddYear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selY=new Select(ddYear);
        selY.selectByValue("2021");

        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[5]")).click();

    }
}
