package cucumber.google;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AllegroSearch {

    private WebDriver driver;
    private Random random = new Random();

    private void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Given("^as a user I opened page \"([^\"]*)\"$")
    public void asAUserIOpenedPage(String websiteAdress) {
        setUp();
        driver.get(websiteAdress);

    }

    @When("^choose categories for electronics$")
    public void chooseCategoriesForElectronics(){
        driver.get("https://allegro.pl/dzial/elektronika");


    }

    @And("^choose categories computers$")
    public void chooseCategoriesComputers() {
        driver.findElement(By.xpath("(//a[contains(text(),'Komputery')])[3]")).click();


    }

    @And("^choose printer categories and scanners$")
    public void choosePrinterCategoriesAndScanners() {


    }

    @Then("^click the first of the promoted offers$")
    public void clickTheFirstOfThePromotedOffers() {

    }

    @Then("^click buy now$")
    public void clickBuyNow() {
    }

    @Then("^login page appears$")
    public void loginPageAppears() {
    }



}
