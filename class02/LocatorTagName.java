package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorTagName {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));

        //treverse

        for(WebElement link:allLinks){
            String linkOfWebsite=link.getAttribute("href");
            System.out.println(linkOfWebsite);


        }

    }
}
