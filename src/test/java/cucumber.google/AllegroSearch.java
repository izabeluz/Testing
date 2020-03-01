package cucumber.google;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    public void asAUserIOpenedPage(String websiteAddress) {
        setUp();
        driver.get(websiteAddress);
    }

    @When("^agreement window appears$")
    public void agreementWindowAppears() {
        Assert.assertNotNull(driver.findElement(By.xpath("//div[@aria-labelledby='dialog-title']")));
    }

    @Then("^close agreement window$")
    public void closeAgreementWindow() {
        driver.findElement(By.xpath("//div[@aria-labelledby='dialog-title']/button")).click();
    }

    @And("^choose department Elektronika$")
    public void chooseDepartmentElectronic() {
        driver.findElement(By.xpath("//div[@data-box-name='departments']/div/div[@data-group-id='departments_Elektronika']/a")).click();
    }

    @And("^choose category Komputery$")
    public void chooseCategoryKomputery() {
        driver.findElement(By.xpath("//div[@data-box-name='category - Elektronika']/a")).click();
    }

    @When("^choose categories for electronics$")
    public void chooseCategoriesForElectronics() {
        driver.get("https://allegro.pl/dzial/elektronika");


    }

    @And("^choose categories computers$")
    public void chooseCategoriesComputers() {
        driver.get("https://allegro.pl/kategoria/komputery?bmatch=baseline-cl-eyesa2-dict43-ele-1-4-0205");


    }

    @And("^choose printer categories and scanners$")
    public void choosePrinterCategoriesAndScanners() {
        driver.findElement(By.xpath("(//a[contains(text(),'Drukarki i skanery')])[2]")).click();


    }

    @Then("^click the first of the promoted offers$")
    public void clickTheFirstOfThePromotedOffers() {
        driver.findElement(By.linkText("Drukarka HP Deskjet 3720 tusz nr 304")).click();

    }

    @Then("^click buy now$")
    public void clickBuyNow() {
        driver.findElement(By.id("buy-now-button")).click();

    }

    @Then("^login page appears$")
    public void loginPageAppears() {

    }



}
