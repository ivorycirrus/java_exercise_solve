package basic.step2.ex04;

public class Main {

	public static void main(String[] args) {
		/*
		// example 1
		int[][] A = { { 1, 2, 3 }
				     ,{ 4, 5, 6 }
				     ,{ 7, 8, 9 } };
		*/ 
		
		// example 2
		int[][] A = { { 5, 6, 7, 8 }
				     ,{ 2, 3, 4, 0 }
				     ,{ 1, 9, 5, 3 }
				     ,{ 9, 7, 6, 5 } }; 
		
		int[][] arr = rotateArray(A);
		
		System.out.println(arrayFormat(arr));
	}
	
	public static String arrayFormat(int[][] arr) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				if(j>0) sb.append("\t");
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public static int[][] rotateArray(int[][] A) {
		//---------------------------------------
		// TODO : Write code here
		
		// Solve concept
		//   i-th row == reverse of i-th colulm
		
		int SIZE = A.length;
		int[][] R = new int[SIZE][SIZE];
		
		for(int i = 0 ; i < SIZE ; i++) {
			for (int j = 0; j < SIZE; j++) {
				R[i][j] = A[SIZE - 1 - j][i];
			}
		}
				
		return R;
		
		//---------------------------------------
	}

}
