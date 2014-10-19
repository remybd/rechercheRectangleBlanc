package solver;

import paving.Paving;
import paving.Rectangle;

public class Solution3 {
	
	private Rectangle solution;
	
	public Solution3() {
		this.solution = new Rectangle(0, 0, 0, 0);
	}
	
	public Rectangle getSolution(Paving paving){
		solve(paving);

		return this.solution;
	}

	private void solve(Paving paving) {
		boolean [][] pavingArray = paving.getPaving();
		
		int heightsArray[] = new int[paving.getNbColumn()];
		
		initializeHeightsArray(paving, heightsArray);
		
		for (int i = 0; i < paving.getNbRow(); i++) {
			evaluateHeights(paving, pavingArray, heightsArray, i);
			evaluatePossibleRectangles(paving, heightsArray, i);
		}
	}

	private void evaluatePossibleRectangles(Paving paving, int[] heightsArray,
			int i) {
		int minHeight;
		int width;
		minHeight = paving.getNbRow();
		
		for (int k = 0; k < paving.getNbColumn(); k++){
			for (int l = k; l < paving.getNbColumn(); l++){
				if(heightsArray[l] < minHeight )
					minHeight = heightsArray[l];
				
				width = l-k +1;
				
				if(isBiggerThanPrevious(minHeight, width))
					this.solution = new Rectangle(i-minHeight+1,k,minHeight,width);
			}
			minHeight = paving.getNbRow();
		}
	}

	private boolean isBiggerThanPrevious(int minHeight, int width) {
		return this.solution.getArea() < (minHeight*width);
	}

	private void evaluateHeights(Paving paving, boolean[][] pavingArray,
			int[] heightsArray, int i) {
		for(int j = 0; j < paving.getNbColumn(); j++){
			if(pavingArray[i][j])
				heightsArray[j] ++;
			else
				heightsArray[j] = 0;
		}
	}

	private void initializeHeightsArray(Paving paving, int[] heightsArray) {
		for(int j = 0; j < paving.getNbColumn(); j++){
			heightsArray[j] = 0;
		}
	}
}
