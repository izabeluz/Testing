package pl.pawlak.allegro;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class AllegroShoes {


  private WebDriver driver;
  private Random random = new Random();

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
    driver.findElement(By.xpath("//div[@data-box-name='Pełna nawigacja']/nav/div/div/ul/li/a")).click();
  }

  @And("^choose obuwie category$")
  public void chooseObuwieCategory() {
    driver.findElement(By.xpath("//div[@data-box-name='category ona']/div/div/div/div/ul/li[3]a")).click();
  }

  @Then("^user choose sportowe$")
  public void userChooseSportowe() {
  }

  @Then("^choose cena powyżej (\\d+)$")
  public void chooseCenaPowyżej(int arg0) {
  }

  @And("^choose rozmiar (\\d+)$")
  public void chooseRozmiar(int arg0) {
  }

  @And("^choose kolor czarny$")
  public void chooseKolorCzarny() {
  }

  @And("^choose marka adidas$")
  public void chooseMarkaAdidas() {
  }

  @And("^choose stan nowe$")
  public void chooseStanNowe() {
  }

  @Then("^user select filter popularność:największa$")
  public void userSelectFilterPopularnośćNajwiększa() {
  }


}
