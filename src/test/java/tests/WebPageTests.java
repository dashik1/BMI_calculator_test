package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebPageTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }


    @Test
    public void welcomeMessageTest() {
        driver.get(Urls.PATH);
        WebElement welcomeMessage = driver.findElement(By.name("h1"));
        boolean isWelcomeDisplayed = welcomeMessage.isDisplayed();
        Assert.assertTrue(isWelcomeDisplayed, "Welcome message is not displayed");

    }

    @Test
    public void musicListTest() {
        driver.get(Urls.PATH);
        WebElement musicList = driver.findElement(By.name("music_list"));
        boolean isMusicListDisplayed = musicList.isDisplayed();
        Assert.assertTrue(isMusicListDisplayed, "Music dropdown is not displayed");

    }

    @Test
    public void buttonTest() {
        driver.get(Urls.PATH);
        WebElement button = driver.findElement(By.name("button"));
        boolean isButtonDisplayed = button.isDisplayed();
        Assert.assertTrue(isButtonDisplayed, "Click here button is not displayed");

    }

    @Test
    public void nameTest() {
        driver.get(Urls.PATH);
        WebElement name = driver.findElement(By.name("my_name"));
        String myName = name.getText();
        boolean isNameDisplayed = myName.contains("Dasha");
        Assert.assertTrue(isNameDisplayed, "My name is not displayed");

    }

    @Test
    public void linkTest() {
        driver.get(Urls.PATH);
        driver.findElement(By.linkText("link")).click();
        String url = driver.getCurrentUrl();
        boolean isLinkYandex = url.contains("https://yandex.ru/");
        Assert.assertTrue(isLinkYandex, "User is navigated to incorrect url");

    }

    @Test
    public void imgTextTest() {
        driver.get(Urls.PATH);
        WebElement img = driver.findElement(By.id("img_oops"));
        String imgText = img.getAttribute("alt");
        boolean isImgTextDisplayed = imgText.contains("oops, you found it");
        Assert.assertTrue(isImgTextDisplayed, "Alternative text for img is not displayed");

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}