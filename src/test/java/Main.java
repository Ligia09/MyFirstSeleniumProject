
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main (String [] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.close();
    }
       public static void loginTest(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/");

        WebElement accountlink = driver.findElement(By.cssSelector("#header> div > div.skip-links> div > a >span.label"));
        accountlink.click();

           driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
           driver.findElement(By.cssSelector("#email")).sendKeys(...keysToSend: "ligia_babos@yahoo.com");
           driver.findElement(By.cssSelector("#pass")).sendKeys(...keysToSend:"Manuela909");
           driver.findElement(By.cssSelector("#send2")).click();

        driver.close();

    }
}
