import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class RegistrationFormTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testRegistration() {
        // Open the web page
        driver.get("http://13.235.2.90:8080");

        // Fill in the form fields
        WebElement nameField = driver.findElement(By.id("Name"));
        nameField.sendKeys("John Doe");

        WebElement mobileField = driver.findElement(By.id("mobile"));
        mobileField.sendKeys("1234567890");

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("test@example.com");

        WebElement locationField = driver.findElement(By.id("Location"));
        locationField.sendKeys("New York");

        WebElement passwordField = driver.findElement(By.id("psw"));
        passwordField.sendKeys("password");

        WebElement confirmPasswordField = driver.findElement(By.id("psw-repeat"));
        confirmPasswordField.sendKeys("password");

        // Submit the form
        WebElement registerButton = driver.findElement(By.cssSelector(".registerbtn"));
        registerButton.click();

        // Add assertion to verify the registration is successful (check for success message, redirect, etc.)
    }

    @After
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}

