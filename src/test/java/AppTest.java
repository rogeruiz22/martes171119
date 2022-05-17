import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest
{
    @Test
    public void prueba() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com");

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));

        username.sendKeys("incubatorteam@oktana.com");
        password.sendKeys("incubator2022");
        loginButton.click();

        Thread.sleep(20000);

        String title = driver.getTitle();
        Assert.assertEquals(title, "Home | Salesforce");

        WebElement appLauncher = driver.findElement(By.xpath("//div[@class='navexSetupNav']//div//div/button"));
        appLauncher.click();

        Thread.sleep(3000);

        WebElement appLauncherSearchBox = driver.findElement(By.xpath("//one-app-launcher-search-bar//div//input"));
        appLauncherSearchBox.sendKeys("Contacts");

        driver.quit();
    }
}
