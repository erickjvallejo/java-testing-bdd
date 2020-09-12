package simpletest.defs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleTestDefs {

    /*
    https://www.selenium.dev/documentation/es/guidelines_and_recommendations/
    https://sites.google.com/a/chromium.org/chromedriver/getting-started
    */

    WebDriver driver;
    private final Logger log = LoggerFactory.getLogger(SimpleTestDefs.class);

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        log.info("Created the ChromeDriver");
    }

    @Given("I have a Google page  browser")
    public void iHaveAGooglePageBrowser() throws InterruptedException {
        log.info("Opening Google Page");
        driver.get("https://www.google.com.co");
        driver.manage().window().fullscreen();
        Thread.sleep(500);  // Let the user actually see something!
    }

    @When("I refresh it {int} times")
    public void iRefreshItTimes(int times) throws InterruptedException {
        for (int i = 0; i < times ; i++) {
            driver.navigate().refresh();
            log.info("Fresh Number: {} ", i);
            Thread.sleep(400);
        }
    }

    @Then("I want to close it")
    public void iWantToCloseIt() {
        log.info("Closing window ");
         driver.close();
    }

    public void iSearchSomething() throws InterruptedException {

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(1000);  // Let the user actually see something!
    }

    @After
    private void tearDown() {
        driver.quit();
        driver = null;
        log.info("Bye webDriver");
    }


}
