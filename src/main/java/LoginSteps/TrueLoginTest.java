package LoginSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TrueLoginTest {

    WebDriver driver = new ChromeDriver();

    @Given("the OrangeHRM login page is displayed successfully")
    public void theOrangeHRMLoginPageIsDisplayedSuccessfully() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }

    @When("the username {string} is entered")
    public void theUsernameIsEntered(String arg0) {

        WebElement userNameInput=driver.findElement(By.name("username"));
        userNameInput.sendKeys("Admin");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement dynamicElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input[placeholder='Username']")));


    }

    @And("the password {string} is entered")
    public void thePasswordIsEntered(String arg0) {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement passwordInput=driver.findElement(By.name("password"));
        passwordInput.sendKeys("admin123");
    }

    @And("the login button is clicked")
    public void theLoginButtonIsClicked() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
    }

    @Then("the dashboard page should be visible")
    public void theDashboardPageShouldBeVisible() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
}
