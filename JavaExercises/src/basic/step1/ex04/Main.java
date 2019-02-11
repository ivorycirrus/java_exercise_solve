package basic.step1.ex04;

public class Main {

	public static void main(String[] args) {
		int N = 3;
		
		printStar(N);
	}
	
	public static void printStar(int N) {
		//---------------------------------------
		// TODO : Write code below
		
		for(int i = N ; i > 0 ; i--) {
			String line = "";
			for(int j = 0 ; j < i ; j++) {
				line += "*";
			}
			System.out.println(line);
		}
		
		//---------------------------------------
	}

}
