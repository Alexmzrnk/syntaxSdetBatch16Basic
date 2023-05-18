package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        //go to google.com
        driver.get("https://google.com");

        Thread.sleep(2000);
        //navigate to FB
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.navigate().refresh();

        Thread.sleep(1000);
        // go back to prevs page
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        //closing the browser
        //  driver.quit();
        //try fullscreen command
        driver.close();
    }

}
