package classfile;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags={"@case"},plugin={"json:target/Report/reports.json"},features={"src/test/resources/features/case1.feature"})
public class Runner {

}
