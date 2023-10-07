import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSearchAutomator {
    public static void main(String[] args) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.bin", "C:\\Program Files\\chrome-win32\\chrome.exe");
        WebDriver driver = new ChromeDriver();

        // Navigate to the web application
        driver.get("https://shikimori.me/");

        // Locate the search input field using CSS selector
        WebElement searchField = driver.findElement(By.cssSelector("input[type='text'][placeholder='Поиск...']"));

        // Clear the search input field (очистить поле ввода)
        searchField.clear();

        // Enter a search query
        searchField.sendKeys("hunter");

        // Close the WebDriver
        driver.quit();
    }
}
