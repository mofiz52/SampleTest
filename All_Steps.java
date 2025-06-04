package TestPackge;

import net.serenitybdd.annotations.Step;

public class All_Steps {
	
	@Step
	public void step1() {
		System.out.println("Step 1 executed");
	}
	@Step
	public void step2() {
		System.out.println("Step 2 executed");
	}
	@Step
	public void step3() {
		System.out.println("Step 3 executed");
		System.out.println("Testing Jenkins");
	}

}
