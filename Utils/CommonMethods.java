package Utils;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {

    public static WebDriver driver;
    public static void openBrowserAndLaunchApp(String url, String browser){
        switch (browser){
            case "chrome":
                driver=new ChromeDriver();
                break;

            case "firefox":
                driver=new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.get(url);
    }
    public static void closeBrowser(){
        if(driver!=null) {
            driver.quit();
        }
    }
    public static void sendText(String text, WebElement element){
        element.clear();
        element.sendKeys(text);

    }

    public static void singleSlctDD(WebElement element, String text){
        Select sel=new Select(element);
        sel.selectByVisibleText(text);
    }
}
