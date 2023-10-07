import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;

public class FlightBookingCheckpoint {
    public static void main(String[] args) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.bin", "C:\\Program Files\\chrome-win32\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        // Navigate to the web application
        driver.get("https://www.aviasales.kz/");
        // from city
        WebElement from = driver.findElement(By.id("origin"));
        // Enter a search query
        from.sendKeys("Астана");
        // To city
        WebElement to = driver.findElement(By.id("destination"));
        // Enter a search query
        to.sendKeys("Алматы");
        // date
        WebElement date = driver.findElement(By.cssSelector("input[data-test-id='departure-date-input']"));
        // Enter a search query
        date.sendKeys("2023/11/30");
        //button
        WebElement button = driver.findElement(By.cssSelector("button[data-test-id='form-submit']"));
        button.click();
        // Close the WebDriver
        driver.quit();
    }
}
