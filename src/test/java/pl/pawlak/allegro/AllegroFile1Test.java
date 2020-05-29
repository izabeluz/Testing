package pl.pawlak.allegro;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/BDD/Features/File1.feature",
        plugin = {"pretty", "html:out"})
public class AllegroFile1Test {

}
