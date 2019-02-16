package basic.step3.ex01;

public class Main {

	public static void main(String[] args) {
		
		int N=4; // Num of players
		int S=1; // Seat

		call(N, S);
	}
	
	public static void call(int N, int S) {
		//---------------------------------------
		// TODO : Write code below
		
		for(int i = 0 ; i < 5 ; i++) {
			// call number at this turn
			int num = i * N + S;
			
			// find 3,6,9 from call number
			String X = "";
			for(int j = num ; j > 0 ; j /= 10) {
				// get one number by tail
				int tail = num%10;
				// check 3,6,9
				if(tail%3 == 0) X += "X";
			}
			
			// call number
			if("".contentEquals(X)){
				// 3,6,9 is not found
				System.out.println(num);
			} else {
				// call 'X' by 3,6,9
				System.out.println(X);
			}
		}
		
		//---------------------------------------
	}

}
