package MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromDriverr\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.tr/");
        driver.findElement(By.id("sp-cc-accept")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11");
        driver.findElement(By.id("nav-search-submit-button")).click();
        WebElement element =driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_2']//img[@src='https://m.media-amazon.com/images/I/71iO2R+CLjL._AC_UL320_.jpg']"));
       element.click();
//        WebElement element1=driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(element));
//        element1.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
