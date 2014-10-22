package solver;

import paving.Paving;
import paving.Rectangle;

public class Solution1 {

	private Rectangle solution;
	
	public Solution1() {
		this.solution = new Rectangle(0, 0, 0, 0);
	}
	
	public Rectangle getSolution(Paving paving){
		solve(paving);

		return this.solution;
	}

	private void solve(Paving paving) {
		for (int i = 0; i < paving.getNbRow(); i++) {
			for(int j = 0; j < paving.getNbColumn(); j++){
				TestAllRectangles(paving, i, j);
			}
		}
	}

	private void TestAllRectangles(Paving paving, int i, int j) {
		
		int hMax = paving.getNbRow() - i;
		int lMax = paving.getNbColumn() - j;
		
		for(int h = 1; h <= hMax; h++ ){
			for (int l = 1; l <= lMax; l++){
				TryASpecificRectangle(paving, i, j, h, l);
			}
		}
	}

	private void TryASpecificRectangle(Paving paving, int i, int j, int h, int l) {
		Rectangle r;
		r = new Rectangle(i,j,h,l);
		
		if(isFullWhite(paving.getPaving(), r) && IsBiggerThanPrevious(h, l))
			this.solution = r;
	}

	private boolean IsBiggerThanPrevious(int h, int l) {
		return this.solution.getArea() < h*l;
	}
		
	public boolean isFullWhite(boolean paving[][], Rectangle r) {
		
		int i = r.getNumRow();
		int j ;
		
		int limiteHauteur = r.getNumRow() + r.getHeight();
		int limiteLargeur = r.getNumColumn() + r.getWidth();
		
		boolean fullWhite = true;

		while (fullWhite && i < limiteHauteur) {
			j = r.getNumColumn();
			fullWhite = CheckColumnsFullWhiteForASpecificLine(paving, i, j, limiteLargeur,
					fullWhite);	
			i++;
		}
		return fullWhite;
	}

	private boolean CheckColumnsFullWhiteForASpecificLine(boolean[][] paving, int i, int j,
			int limiteLargeur, boolean fullWhite) {
		
		while ( fullWhite && j < limiteLargeur) {
			fullWhite = paving[i][j];
			j++;
		}
		
		return fullWhite;
	}
}
