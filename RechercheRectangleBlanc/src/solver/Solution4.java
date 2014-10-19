package solver;

import paving.Paving;
import paving.Rectangle;
import paving.UnfinishedRectangle;
import slack.Slack;

public class Solution4 {
	
	private Rectangle solution;
	
	public Solution4() {
		this.solution = new Rectangle(0, 0, 0, 0);
	}
	
	public Rectangle getSolution(Paving paving){
		solve(paving);

		return this.solution;
	}

	private void solve(Paving paving) {
		boolean [][] pavingArray = paving.getPaving();
		int heightsArray[] = new int[paving.getNbColumn()];
		Slack slack = new Slack();
		
		initializeHeightsArray(paving, heightsArray);
		
		for (int i = 0; i < paving.getNbRow(); i++){
			int previousHeight = 0;
			
			for(int j = 0; j < paving.getNbColumn(); j++){
				
				updateHeight(pavingArray, heightsArray, i, j);
				
				if(previousHeight < heightsArray[j]) {
					addNewUnfinishedRectangle(heightsArray, slack, j);
				}
				else if(previousHeight > heightsArray[j]) {
					manageExistingRectangles(heightsArray, slack, i, j);
				}
				previousHeight = heightsArray[j];
			}

			manageLastRectangles(paving, slack, i);
		}	
	}

	private void manageLastRectangles(Paving paving, Slack slack, int i) {
		while(!slack.isEmpty()) {
			UnfinishedRectangle lastRect = (UnfinishedRectangle) slack.pop();
			int width = paving.getNbColumn()-lastRect.getStartColumn();
						
			if(isBiggerThanPrevious(lastRect, width)){
				this.solution = new Rectangle (i-lastRect.getHeight()+1,lastRect.getStartColumn(),lastRect.getHeight(),width);
			}
		}
	}

	private void manageExistingRectangles(int[] heightsArray, Slack slack, int i, int j) {
		UnfinishedRectangle lastRectangle = null;
		UnfinishedRectangle lastRectSoBig = null;
		if(!slack.isEmpty()){
			lastRectangle = (UnfinishedRectangle) slack.pop();
			
			closeAllRectanglesTooHigh(heightsArray, slack, i, j, lastRectangle,
					lastRectSoBig);
			
		}
	}

	private void closeAllRectanglesTooHigh(int[] heightsArray, Slack slack,
			int i, int j, UnfinishedRectangle lastRectangle,
			UnfinishedRectangle lastRectToBeReduced) {
		boolean emptyList = false;

		while(!emptyList && lastRectangle.getHeight() > heightsArray[j]) {
			int width = j-lastRectangle.getStartColumn();
			
			if(isBiggerThanPrevious(lastRectangle, width)){
				this.solution = new Rectangle (i-lastRectangle.getHeight()+1,lastRectangle.getStartColumn(),lastRectangle.getHeight(),width);
			}
			lastRectToBeReduced = lastRectangle;
										
			if(!slack.isEmpty()){
				lastRectangle = (UnfinishedRectangle) slack.pop();
			}
			else emptyList = true;
		}
		rectanglesToRepush(heightsArray, slack, j, lastRectangle, lastRectToBeReduced,
				emptyList);
	}

	private void rectanglesToRepush(int[] heightsArray, Slack slack, int j,
			UnfinishedRectangle lastRectangle, UnfinishedRectangle lastRectSoBig,
			boolean emptyList) {
		if(!emptyList){
			slack.push(lastRectangle);
			if(heightsArray[j] > 0 && lastRectangle.getHeight() < heightsArray[j]){
				slack.push(new UnfinishedRectangle(lastRectSoBig.getStartColumn(), heightsArray[j]));
			}
		}
		else if(heightsArray[j] > 0){
			slack.push(new UnfinishedRectangle(lastRectSoBig.getStartColumn(), heightsArray[j]));
		}
	}

	private boolean isBiggerThanPrevious(UnfinishedRectangle lastRectangle,
			int width) {
		return this.solution.getArea() < (lastRectangle.getHeight()*width);
	}

	private void addNewUnfinishedRectangle(int[] heightsArray, Slack slack, int j) {
		slack.push(new UnfinishedRectangle(j, heightsArray[j]));
	}

	private void updateHeight(boolean[][] pavingArray, int[] heightsArray,
			int i, int j) {
		if(pavingArray[i][j])
			heightsArray[j] ++;
		else
			heightsArray[j] = 0;
	}

	private void initializeHeightsArray(Paving paving, int[] heightsArray) {
		for(int j = 0; j < paving.getNbColumn(); j++){
			heightsArray[j] = 0;
		}
	}
}
