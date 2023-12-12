package MyLessons;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromDriverr\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.tr/");
        driver.findElement(By.id("sp-cc-accept")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11");
        driver.findElement(By.id("nav-search-submit-button")).click();
        String text = driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span)[1]")).getText() +
                driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span)[3]")).getText();
        System.out.println(text);
        if (text.contains("iphone 11")){
            System.out.println("good job");
        }
        else {
            System.out.println("bad job");
        }
        String ilkUrun=driver.findElement(By.xpath("(//a[@class=\"a-link-normal s-no-hover s-underline-text s-underline-link-text s-link-style a-text-normal\"]/span)[1]")).getText();
        System.out.println(ilkUrun);
        Thread.sleep(2000);
        driver.close();
    }
}
