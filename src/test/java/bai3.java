import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class bai3 {
    ChromeDriver chromeDriver;

    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void testDN() {
        chromeDriver.get("https://anupdamoda.github.io/AceOnlineShoePortal/SignIn.html");

        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));

        WebElement user = chromeDriver.findElement(By.xpath("//input[@id='usr']"));
       user.sendKeys("sa");


        WebElement mk = wait.until(ExpectedConditions.elementToBeClickable(chromeDriver.findElement(By.xpath("//input[@id='pwd']"))));
        mk.sendKeys("sa");

        WebElement btn = chromeDriver.findElement(By.xpath("//input[@value='Login']"));
        btn.click();
    }
}
