package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/skeleton/examples.feature","src/test/resources/skeleton/Login.feature",
	"src/test/resources/skeleton/verify.feature","src/test/resources/skeleton/typematch.feature"},
		glue="skeleton",
		plugin="json:target/cucumber.jason"
)
public class RunCukesTest {
	
}
