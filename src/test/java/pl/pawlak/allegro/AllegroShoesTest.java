package pl.pawlak.allegro;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/BDD/Features/FilterShoes.feature",
    plugin = {"pretty", "html:out"})
public class AllegroShoesTest{

    }
