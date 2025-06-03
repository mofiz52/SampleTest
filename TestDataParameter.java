package TestPackge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class TestDataParameter {
	
	
	@ParameterizedTest
	@CsvFileSource(resources="TestData.csv", numLinesToSkip=1)
	public void testDataParameter(String firstName, String lastName) {
		// Simulating a test with data parameters
		System.out.println("Executing test with data parameters");

		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
	}
}
