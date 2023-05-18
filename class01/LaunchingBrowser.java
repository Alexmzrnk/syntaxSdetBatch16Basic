package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    //task navigate to google.com
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //   use.get(url) to navigatr to desure url
        driver.get("https://www.google.com");
        //maximize window
        driver.manage().window().maximize();
        //get Currentn Url
        String currentUrl = driver.getCurrentUrl();
        //print on the console
        System.out.println("current URL of the webside is:" + currentUrl);
        //get title of the page
        String title = driver.getTitle();
        System.out.println("the title of the page is:" + title);
        //open window for 5 sec
        Thread.sleep(5000);
        //close the webbrowser
        driver.quit();


    }
}
