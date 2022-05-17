package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest
{
    @Test
    public void shouldAnswerWithTrue() throws Exception {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        Thread.sleep(3000);

        driver.quit();
    }
}
