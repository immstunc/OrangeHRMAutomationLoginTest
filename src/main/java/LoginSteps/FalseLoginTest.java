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

public class FalseLoginTest {

    WebDriver driver = new ChromeDriver();

    @Given("the OrangeHRM login page is displayed")
    public void theOrangeHRMLoginPageIsDisplayed() {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }

    @When("invalid username is entered")
    public void invalidUsernameIsEntered() {

        WebElement userNameInput=driver.findElement(By.name("username"));
        userNameInput.sendKeys("ENTERED WRONGGG");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @And("invalid password is entered")
    public void invalidPasswordIsEntered() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement passwordInput=driver.findElement(By.name("password"));
        passwordInput.sendKeys("wrongPasswordhuheuehu");
    }


    @And("the login button is clicked by user")
    public void theLoginButtonIsClickedByUser() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
    }

    @Then("the {string} warning showed up")
    public void theWarningShowedUp(String arg0) {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));


    }
}
