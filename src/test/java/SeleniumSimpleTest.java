import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumSimpleTest {

    @Test
    public void googleTest() throws Exception {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        driver.findElement
                (By.xpath("//*[@class='gLFyf gsfi']"))
                .sendKeys("погода в харькове");
        driver.findElement
                (By.xpath("//*[@class='gLFyf gsfi']"))
                .sendKeys(Keys.ENTER);
        Assert.assertTrue(driver.getCurrentUrl().contains("/search?"));
        driver.quit();
    }
}
