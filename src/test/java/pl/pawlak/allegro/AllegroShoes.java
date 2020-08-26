package pl.pawlak.allegro;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AllegroShoes {


  private WebDriver driver;
  private Random random = new Random();
  private Object Time;

  private void setUp() {
    System.setProperty("webdriver.chrome.driver",
        "src/main/resources/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }


  @Given("^I opened page \"([^\"]*)\"$")
  public void asAUserIOpenedPage(String websiteAddress) {
    setUp();
    driver.get(websiteAddress);

  }

  @When("^the message apperas$")
  public void theMessageApperas() {
    Assert.assertNotNull(driver.findElement(By.xpath("//div[@aria-labelledby='dialog-title']")));
  }

  @Then("^close message window$")
  public void closeMessageWindow() {
    driver.findElement(By.xpath("//div[@aria-labelledby='dialog-title']/button")).click();
  }

  @Then("^choose moda section$")
  public void chooseModaSection() {
    driver.findElement(By.xpath("//div[@data-box-name='departments']/div/div[2]/a")).click();

  }

  @Then("^choose ONA category$")
  public void chooseONACategory() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//div[@data-box-name='Pełna nawigacja']//a[contains(text(),'Ona')]")).click();
  }

  @And("^choose obuwie category$")
  public void chooseObuwieCategory() {
    driver.findElement(By.xpath("//div[@data-box-name='category - ona']//a[contains(text(),'Obuwie')]")).click();

  }

  @Then("^user choose sportowe$")
  public void userChooseSportowe() {
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//div[@data-role='Categories']//a[contains(text(),'Sportowe')]")).click();

  }

  @Then("^user choose nowe$")
  public void userChooseNowe() {
    driver.findElement(By.xpath("//div[@class='_3e3a8_2252v']//span[text()='nowe']")).click();


  }

  @And("^choose kup teraz$")
  public void chooseKupTeraz() {
    driver.findElement(By.xpath("//div[@class='_3e3a8_2252v']//span[text()= 'kup teraz']")).click();

  }


  @Then("^user choose price powyżej (\\d+)$")
  public void userChoosePricePowyżej(int arg) {
    driver.findElement(By.xpath("//div[@class='opbox-listing-filters']//fieldset[4]//li[5]")).click();
  }

  @Then("^user choose mark adidas$")
  public void userChooseMarkAdidas() {
    driver.findElement(By.xpath("//div[@class='_3e3a8_2252v']//span[text()= 'adidas'] ")).click();

  }


  @Then("^user choose size (\\d+)$")
  public void userChooseSize(int arg0) {
    driver.findElement(By.xpath("//div[@class='_3e3a8_2252v']//li[2]/label[span='38']")).click();

  }

  @And("^choose the color czarny$")
  public void chooseTheColorCzarny() {
    driver.findElement(By.xpath("//div[@class='_3e3a8_2252v']//li[2]/label[1][span='czarny']")).click();

  }

  @Then("^user click first produkt from the promoted list$")
  public void userClickFirstProduktFromThePromotedList() {
    driver.findElement(By.xpath("//div[@id='opbox-listing--gallery']/div/section/article[4]/div/div[1]/div[2]/a")).click();

  }

  @And("^then when user click the button little star in right corner on the product$")
  public void thenWhenUserClickTheButtonLittleStarInRightCornerOnTheProduct() {

  }


  @Then("^the user at this point is redirected to the login page$")
  public void theUserAtThisPointIsRedirectedToTheLoginPage() {
  }
}
