package basic.step1.ex08;

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
			
			// Insert white-space before left heading
			int indent = N-i;
			for(int j = 0 ; j < indent ; j++) line+=" ";
			
			// Mark stars
			int stars = 2*i-1;
			for(int j = 0 ; j < stars ; j++) {
				if(j==0 || j == stars-1 || i == N) {
					// edge
					line+="*";
				} else {
					// inside of triangle
					line+=" ";
				}
			}
			
			// Print
			System.out.println(line);
		}
		
		//---------------------------------------
	}

}
