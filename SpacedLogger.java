package week05_coding_assignment;

public class SpacedLogger implements Logger_interface {
	
//instantiation variables
	String str;
		
//constructor
	SpacedLogger(String str) {
		this.str = str;
	}
		

public void Log(){
	char[] array = str.toCharArray();
	for (char a : array) {
		System.out.print(a + " ");
	}
}


public void Error() {
	System.out.print("\nError: ");
	char[] array = str.toCharArray();
	for (char a : array) {
		System.out.print(a + " ");
	}
}
}


