package exceptionAssignment;

public class AgeException extends RuntimeException {

	public AgeException(String msg) {
		
		super(msg);
		System.out.println("You are in AgeException Class");
	}
}


