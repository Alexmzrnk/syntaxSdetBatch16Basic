package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //send some text to email
        //find the elememt     . send some text
        driver.findElement(By.id("email")).sendKeys("alex.mzrnk@gmail.com");

        driver.findElement(By.name("pass")).sendKeys("qwertyuio");


        //print the url on console
        String url=driver.getCurrentUrl();
        System.out.println(url);

        //print the title on console
        String title=driver.getTitle();
        System.out.println(title);
        // confirm the titele is Facebook - log in or sign in
        if(title.equals("Facebook - log in or sign up")){
            System.out.println("the title is correct");
        }else{
            System.out.println("the title is incorrect");
        }

        // close
        driver.quit();



    }
}
