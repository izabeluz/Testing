package pl.pawlak.allegro;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"File1.feature", "File2.feature"}
        plugin = {"pretty", "html:out"})
class AllegroTest {
}
