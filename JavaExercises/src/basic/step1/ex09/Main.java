package basic.step1.ex09;

public class Main {

	public static void main(String[] args) {
		int N = 10;
		
		printStar(N);
	}
	
	public static void printStar(int N) {
		//---------------------------------------
		// TODO : Write code below
		
		// The figure is symmetric horizontally and vertically.
		// 1. horizontal 
		//    - Draw half of line, and append right which mirrored its left side
		//    - If line length is odd, add intersection once.
		// 2. vertical
		//    - Draw upside of figure, and append bottom side which mirrored its top side
		//    - If line length is odd, also add intersection once.
		
		// number of layers
		int layers = (N-1) % 4;
		
		// half length of line (for using duplicate)
		int half = (N+1)/2;
		
		// make figure
		StringBuffer figure = new StringBuffer();
		StringBuffer lastLine = null;
		int currentLayer = 0;
		for(int i = 1 ; i <= half ; i++) {
			StringBuffer line = new StringBuffer();
			
			// draw layer before created
			for(int cl = 0 ; cl < currentLayer ; cl++) {
				line.append("* ");
			}
			
			// layer works
			if(i%2==1) {
				// make a layer
				for(int j = currentLayer*2 ; j < half ; j++) {
					line.append("*");
				}
				// mark layer added
				currentLayer++;
			} else {
				// mark blank
				for(int j = currentLayer*2 ; j < half ; j++) {
					line.append(" ");
				}
			}
			
			// mirror line for mark right part of line
			if(N%2 == 0) {
				// EVEN : simple duplicate and append horizontally
				line.append(new StringBuffer(line).reverse());
			} else {
				// ODD : remove intersection (center)
				line.append(new StringBuffer(line).reverse().substring(1));
			}
			
			// append line to output figure
			if(i < half ) {
				figure.append(line).append("\n");
			} else {
				lastLine = line;
			}
		}
		
		// make half of bottom
		StringBuffer bottom = new StringBuffer(figure).reverse();
		if(N%2==0) {
			// EVEN : simple duplicate vertically
			figure.append(lastLine).append("\n");
		}
		figure.append(lastLine);
		figure.append(bottom);
		
		// print
		System.out.println(figure.toString());
		
		//---------------------------------------
	}

}
