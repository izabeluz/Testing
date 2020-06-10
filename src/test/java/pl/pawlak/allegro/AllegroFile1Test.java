package pl.pawlak.allegro;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/BDD/Features/FilterAuction.feature, src/BDD/Features/FilterBuyNow.feature",
        plugin = {"pretty", "html:out"})
public class AllegroTest {

}
