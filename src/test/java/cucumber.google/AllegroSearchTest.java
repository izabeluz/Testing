package cucumber.google;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/BDD/Features/allegro.feature",
        plugin = {"pretty", "html:out"})
public class AllegroSearchTest {
}
