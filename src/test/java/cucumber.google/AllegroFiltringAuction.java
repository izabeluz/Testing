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


    public class AllegroFiltringAuction {

        private WebDriver driver;
        private Random random = new Random();

        private void setUp() {
            System.setProperty("webdriver.chrome.driver",
                    "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }


        @Given("^as a user I open the page \"([^\"]*)\"$")
        public void asAUserIOpenThePage(String websiteAddress) {
            setUp();
            driver.get(websiteAddress);
        }


        @When("^the consent window appears$")
        public void theConsentWindowAppears() {
            Assert.assertNotNull(driver.findElement(By.xpath("//div[@aria-labelledby='dialog-title']")));
        }

        @Then("^close consent window$")
        public void closeConsentWindow() {
            driver.findElement(By.xpath("//div[@aria-labelledby='dialog-title']/button")).click();
        }

        @And("^choose departments Elektronika$")
        public void chooseDepartmentsElektronika() {
            driver.findElement(By.xpath("//div[@data-box-name='departments']/div/div[@data-group-id='departments_Elektronika']/a")).click();
        }

        @And("^choose categories Komputery$")
        public void chooseCategoriesKomputery() {
            driver.findElement(By.xpath("//div[@data-box-name='category - Elektronika']/div/ul/li[2]/a")).click();
        }

        @And("^choose printer and scaners categories$")
        public void choosePrinterAndScanersCategories() {
            closePreviousTab();
            driver.findElement(By.xpath("//div[@data-box-name='Categories']//a[text()='Drukarki i skanery']")).click();
        }

        @And("^selects filter auction$")
        public void selectsFilterAuction() {
            driver.findElement(By.xpath("//div[@id='opbox-listing-filters']//a/span[text()='licytacje']")).click();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }

        @And("^close kurier information if is invisile$")
        public void closeKurierInformationIfIsInvisile() {

            final WebElement element = driver.findElement(By.xpath("//div[@id='opbox-listing-filters']//button[text()='zamknij']"));
            if (element != null)
                element.click();
        }

        @And("^click the first of the offers$")
        public void clickTheFirstOfTheOffers() {
            driver.findElement(By.xpath("//div[@id='opbox-listing--base']/div/section[2]/section/article[1]")).click();
        }


        @Then("^button kup teraz is not visible$")
        public void buttonKupTerazIsVisible() {
            final WebElement element = (driver.findElement(By.xpath("//div[@data-role='app-container']//button[@id='buy-now-button']")));
            if (element !=null)
                element.click();

        }


        private void closePreviousTab() {
            final ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            tabs.stream().forEach(System.out::println);
            driver.switchTo().window(tabs.get(0));
            driver.close();
            driver.switchTo().window(tabs.get(1));
        }
    }










