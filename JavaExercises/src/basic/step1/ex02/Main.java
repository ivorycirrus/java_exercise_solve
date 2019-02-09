package basic.step1.ex02;

public class Main {

	public static void main(String[] args) {
		int year = 2019;
		
		printYear(year);
	}
	
	public static void printYear(int year) {
		//---------------------------------------
		// TODO : Write code below
		
		if(year%400==0) {
			System.out.println(year+"년은 윤년입니다.");
		} else if(year%100==0) {
			System.out.println(year+"년은 평년입니다.");
		} else if(year%4==0) {
			System.out.println(year+"년은 윤년입니다.");
		} else {
			System.out.println(year+"년은 평년입니다.");
		}
		
		//---------------------------------------
	}

}
