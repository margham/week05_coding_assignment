package week05_coding_assignment;

public class AsteriskLogger implements Logger_interface {
	//instantiation variables
	String str;
	
	//constructor
	AsteriskLogger(String str) {
		this.str = str;
	}
	
	//method 1
	public void Error(){
		System.out.println("************************");
		System.out.println("***" + "Error: " + str + "***");
		System.out.println("************************");
	}
	
	//method 2
	public void Log() {
		System.out.println("******************");
		System.out.println("***" + str + "***");
		System.out.println("******************");
		}

	}
