package week05_coding_assignment;

public class App {
	
	public static void main(String[] args){
		
		//set the variables to use
		AsteriskLogger test1 = new AsteriskLogger("Incongruous");
		SpacedLogger test2 = new SpacedLogger("Incongruous");

		
		//try implementing the asterisklogger class:
		test1.Log();
		test1.Error();
		
		//try implementing the spacedlogger class:
		test2.Log();
		test2.Error();
	}

}
