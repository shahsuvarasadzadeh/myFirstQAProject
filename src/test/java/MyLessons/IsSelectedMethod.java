package MyLessons;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IsSelectedMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromDriverr\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[.='Create new account']")).click();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//input[@value='2']"));
        if (!element.isSelected()){
            element.click();
        }
        Thread.sleep(2000);
        driver.quit();
    }
}