package MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\ChromDriverr\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com.tr/");
        driver.findElement(By.xpath("//input[@class='a-button-input celwidget']")).click();
        driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Iphone 11", Keys.ENTER);
        String text = driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span)[1]")).getText();
        System.out.println(text);
        driver.findElement(By.cssSelector("img[class=\"s-image\"]")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
