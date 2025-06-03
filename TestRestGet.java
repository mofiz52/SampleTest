package TestPackge;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
public class TestRestGet {
	@Steps	
	All_Steps allSteps = new All_Steps();
	
	//hello 
	@Test
	public void testRestGet() {
		// Simulating a REST GET request
		System.out.println("Executing REST GET request");

		allSteps.step1();
		allSteps.step2();
	}

}
