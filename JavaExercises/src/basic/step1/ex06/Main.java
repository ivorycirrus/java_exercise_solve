package basic.step1.ex06;

public class Main {

	public static void main(String[] args) {
		int N = 3;
		
		printStar(N);
	}
	
	public static void printStar(int N) {
		//---------------------------------------
		// TODO : Write code below
		
		for(int i = 1 ; i <= N ; i++) {
			String line = "";
			
			// Insert white-space before heading
			int indent = N-i;
			for(int j = 0 ; j < indent ; j++) line+=" ";
			
			// Mark stars
			int stars = 2*i-1;
			for(int j = 0 ; j < stars ; j++) line+="*";
			
			// Print
			System.out.println(line);
		}
		
		//---------------------------------------
	}

}
