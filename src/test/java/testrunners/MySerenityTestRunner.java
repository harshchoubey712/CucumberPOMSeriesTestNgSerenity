package testrunners;



import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		
	
		plugin = {"pretty"},
		glue = {"parallel"},
		features= {"src/test/resources/parallel/Loginpage.feature"}
							
		         
		
		)

public class MySerenityTestRunner {

}
