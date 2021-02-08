package exceptionAssignment;

public class CheckEligibility {
	
	public void check(int age) { 
		if(age<18) {
			throw new AgeException("You are not Eligible");
		}
		else {
			System.out.println("You are Eligible");
		}
	}

}
