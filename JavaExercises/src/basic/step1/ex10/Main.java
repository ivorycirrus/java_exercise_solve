package basic.step1.ex10;

public class Main {
	
	public static final String[][] EDGE = {
		{"┌","┬","┐"},
		{"├","┼","┤"},
		{"└","┴","┘"}
	};
	
	public static void main(String[] args) {
		int rows = 4;
		int cols = 6;
		
		drawTable(rows, cols);
	}
	
	public static void drawTable(int rows, int cols) {
		//---------------------------------------
		// TODO : Write code below		
		
		for(int i = 0 ; i <= rows ; i++) {
			String line = "";
			for (int j = 0; j <= cols; j++) {
				int r,c;
				
				if( i == 0 ) r = 0; else if( i == rows ) r = 2; else r = 1;
				if( j == 0 ) c = 0; else if( j == cols ) c = 2; else c = 1;
				
				line += EDGE[r][c];
			}
			System.out.println(line);
		}
		
		//---------------------------------------
	}

}
