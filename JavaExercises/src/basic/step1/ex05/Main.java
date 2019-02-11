package basic.step1.ex05;

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
			for(int j = N ; j > 0 ; j--) {
				if(j <= i) {
					line += "*";
				} else {
					line += " ";
				}
			}
			System.out.println(line);
		}
		
		//---------------------------------------
	}

}
