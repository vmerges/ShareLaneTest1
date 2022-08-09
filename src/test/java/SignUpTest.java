import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SignUpTest {
    @Test
    public void zipCode4Digits () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get ("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        boolean isOpened = driver.findElement(By.cssSelector("[value_Register")).isDisplayed();
        assertTrue(isOpened, "Sign up page was not opened");
//        String error = driver.findElement(By.cssSelector("[class=error_message]")).getText();
//        assertEquals(error, "Oops, error on page. ZIP code should have 5 digits", "Zip code error massage is not correct");
        driver.quit();
    }
}
