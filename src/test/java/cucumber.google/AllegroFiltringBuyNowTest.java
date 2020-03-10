package cucumber.google;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/BDD/Features/filtring_buy_now_allegro.feature",
        plugin = {"pretty", "html:out"})
public class AllegroFiltringBuyNowTest {
}
