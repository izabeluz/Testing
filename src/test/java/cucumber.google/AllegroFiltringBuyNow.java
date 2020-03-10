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

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AllegroFiltringBuyNow {

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
        driver.findElement(By.xpath("//div[@data-box-name='category - Elektronika']/div/ul/li[2]/a")).click();
    }


    @And("^choose printer categories and scanners$")
    public void choosePrinterCategoriesAndScanners() {
        closePreviousTab();
        driver.findElement(By.xpath("//div[@data-box-name='Categories']//a[text()='Drukarki i skanery']")).click();
    }


    @And("^selects filter kup teraz$")
    public void selectsFilterKupTeraz() {
        driver.findElement(By.xpath("//div[@id='opbox-listing-filters']//a/span[text()='kup teraz']")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


    }

    @And("^click the first of the promoted offers$")
    public void clickTheFirstOfThePromotedOffers() {
        driver.findElement(By.xpath("//div[@id='opbox-listing--base']/div/section[2]/section/article[1]")).click();
    }


    @Then("^button Kup teraz is visible$")
    public void buttonKupTerazIsVisible() {
       Assert.assertNotNull(driver.findElement(By.xpath("//div[@data-role='app-container']//button[@id='buy-now-button']")));

    }
    private void closePreviousTab() {
        final ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        tabs.stream().forEach(System.out::println);
        driver.switchTo().window(tabs.get(0));
        driver.close();
        driver.switchTo().window(tabs.get(1));
    }


}
