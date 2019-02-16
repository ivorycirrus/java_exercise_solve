package basic.step2.ex01;

public class Main {

	public static void main(String[] args) {
		int[][] N = {
				{1,3,5},
				{2,5,7},
				{6,3,9}
		};
		
		int sum = findSum(N);
		System.out.println("sum : "+sum);
	}
	
	public static int findSum(int[][] N) {
		//---------------------------------------
		// TODO : Write code below
		
		int sum = 0;
		
		for(int i = 0 ; i < N.length ; i++) {
			for(int j = 0 ; j < N[i].length ; j++) {
				sum += N[i][j];
			}
		}
		
		return sum;
		
		//---------------------------------------
	}

}
