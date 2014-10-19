package solver;

import paving.Paving;
import paving.Rectangle;

public class Solution2 {
	
	private Rectangle solution;
	
	public Solution2() {
		this.solution = new Rectangle(0, 0, 0, 0);
	}
	
	public Rectangle getSolution(Paving paving){
				
		solve(paving);

		return this.solution;
	}

	private void solve(Paving paving) {
		boolean [][] pavingArray = paving.getPaving();
		
		for (int i = 0; i < paving.getNbRow(); i++) {
			for(int j = 0; j < paving.getNbColumn(); j++){
				findBiggestRectangle(paving, pavingArray, i, j);
			}
		}
	}

	private void findBiggestRectangle(Paving paving, boolean[][] pavingArray,
			int i, int j) {
		int x;
		int y;
		int width;
		int height;
		int limColumn;
		y = j;
		x = i;
		height = 1;
		limColumn = paving.getNbColumn();

		while (x < paving.getNbRow() && pavingArray[x][y]) {
			y = calculateWidth(pavingArray, x, y, limColumn);
			
			if(hasFoundBlackCell(limColumn, y)){
				limColumn = y;
			}
			width = resizeWidth(j, y);
			
			if(isBiggerThanPrevious(width, height))
				this.solution = new Rectangle (i,j,height,width);
			
			height ++;
			y = j;
			x++;
		}
	}

	private int calculateWidth(boolean[][] pavingArray, int x, int y,
			int limiteColonne) {
		while (y < limiteColonne && pavingArray[x][y])
			y++;
		return y;
	}

	private int resizeWidth(int j, int y) {
		int largeur;
		largeur = y-j ;
		return largeur;
	}

	private boolean isBiggerThanPrevious(int largeur, int hauteur) {
		return this.solution.getArea() < (hauteur*largeur);
	}

	private boolean hasFoundBlackCell(int limiteColonne, int y) {
		return limiteColonne > y;
	}
}
