package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTests1 {


    @Test
    public void starvationTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator");
        driver.findElement(By.name("wg")).sendKeys("49");
        driver.findElement(By.name("ht")).sendKeys("180.8");
        driver.findElement(By.name("cc")).click();
        String starvationMessage = driver.findElement(By.name("desc")).getAttribute("value");
        driver.quit();
        Assert.assertEquals(starvationMessage, "Your category is Starvation");

    }

    @Test
    public void underweightTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator");
        driver.findElement(By.name("wg")).sendKeys("49.2");
        driver.findElement(By.name("ht")).sendKeys("181.1");
        driver.findElement(By.name("cc")).click();
        String starvationMessage = driver.findElement(By.name("desc")).getAttribute("value");
        driver.quit();
        Assert.assertEquals(starvationMessage, "Your category is Underweight");

    }

    @Test
    public void normalTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator");
        driver.findElement(By.name("wg")).sendKeys("70.55");
        driver.findElement(By.name("ht")).sendKeys("168");
        driver.findElement(By.name("cc")).click();
        String starvationMessage = driver.findElement(By.name("desc")).getAttribute("value");
        driver.quit();
        Assert.assertEquals(starvationMessage, "Your category is Normal");

    }

    @Test
    public void overweightTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator");
        driver.findElement(By.name("wg")).sendKeys("100.46");
        driver.findElement(By.name("ht")).sendKeys("183");
        driver.findElement(By.name("cc")).click();
        String starvationMessage = driver.findElement(By.name("desc")).getAttribute("value");
        driver.quit();
        Assert.assertEquals(starvationMessage, "Your category is Overweight");

    }

    @Test
    public void obeseTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator");
        driver.findElement(By.name("wg")).sendKeys("100.5");
        driver.findElement(By.name("ht")).sendKeys("183");
        driver.findElement(By.name("cc")).click();
        String starvationMessage = driver.findElement(By.name("desc")).getAttribute("value");
        driver.quit();
        Assert.assertEquals(starvationMessage, "Your category is Obese");

    }


}
