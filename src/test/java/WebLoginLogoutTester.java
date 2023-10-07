import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLoginLogoutTester {
    public static void main(String[] args) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.bin", "C:\\Program Files\\chrome-win32\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        // Navigate to the web application
        driver.get("https://monopoly-one.com/auth");
        // Locate the username and password fields using simple locators
        WebElement usernameField = driver.findElement(By.id("auth-form-email"));
        WebElement passwordField = driver.findElement(By.id("auth-form-password"));
        // Enter login credentials
        usernameField.sendKeys("Your Login");
        passwordField.sendKeys("Your password");
        // Locate the login button using CSS selector
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"auth-form\"]/div[3]/input"));
        // Click the login button
        loginButton.click();
        // Locate the logout button using XPath
        WebElement logoutButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[3]"));
        // Click the logout button
        logoutButton.click();
        // Close the WebDriver
        driver.quit();
    }
}
