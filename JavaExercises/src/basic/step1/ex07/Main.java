package basic.step1.ex07;

public class Main {

	public static void main(String[] args) {
		int N = 3;
		
		printStar(N);
	}
	
	public static void printStar(int N) {
		//---------------------------------------
		// TODO : Write code below
		
		// index of edge
		int edge = N-1;
		
		for(int i = 0 ; i < N ; i++) {
			String line = "";
			for(int j = 0 ; j < N ; j++) {
				if( i % edge == 0 || j % edge == 0) {
					// draw border
					line += "*";
				} else {
					// empty inside of square
					line += " ";
				}
			}
			System.out.println(line);
		}
		
		//---------------------------------------
	}

}
