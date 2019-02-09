package basic.step1.ex01;

public class Main {

	public static void main(String[] args) {
		int from = 1;
		int to = 20;
		
		int sum = findSum(from, to);

		System.out.println("Sum : "+sum);
	}
	
	public static int findSum(int from, int to) {
		int sum = 0;
		//---------------------------------------
		// TODO : Write code below
		/* normal way - using for */
		for(int i = from ; i <= to ; i++) {
			if( i%3 == 0 || i%5 == 0 ) sum = sum + i;
		}
		
		/* [the other solution - using while]
		int num = from;
		do {
			if( num%3 == 0 || num%5 == 0 ) sum += num;
		}while(num++ < to);
		*/
		//---------------------------------------
		return sum;
	}

}
