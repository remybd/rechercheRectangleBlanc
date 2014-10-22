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
		int heightCase = 0;
		
		initializeHeightsArray(paving, heightsArray);
		
		for (int i = 0; i < paving.getNbRow(); i++){
			int previousHeight = 0;
			
			for(int j = 0; j < paving.getNbColumn(); j++){
				
				updateHeight(pavingArray, heightsArray, i, j);
				
				heightCase = heightsArray[j];
				
				if(previousHeight < heightCase) {
					addNewUnfinishedRectangle(heightCase, slack, j);
				}
				else if(previousHeight > heightCase) {
					manageExistingRectangles(heightCase, slack, i, j);
				}
				previousHeight = heightCase;
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

	private void manageExistingRectangles(int heightCase, Slack slack, int i, int j) {
		UnfinishedRectangle lastRectangle = null;
		UnfinishedRectangle lastRectSoBig = null;
		if(!slack.isEmpty()){
			lastRectangle = (UnfinishedRectangle) slack.pop();
			
			closeAllRectanglesTooHigh(heightCase, slack, i, j, lastRectangle,
					lastRectSoBig);
			
		}
	}

	private void closeAllRectanglesTooHigh(int heightCase, Slack slack,
			int i, int j, UnfinishedRectangle lastRectangle,
			UnfinishedRectangle lastRectToBeReduced) {
		boolean emptyList = false;

		while(!emptyList && lastRectangle.getHeight() > heightCase) {
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
		rectanglesToRepush(heightCase, slack, lastRectangle, lastRectToBeReduced,
				emptyList);
	}

	private void rectanglesToRepush(int heightCase, Slack slack,
			UnfinishedRectangle lastRectangle, UnfinishedRectangle lastRectSoBig,
			boolean emptyList) {
		if(!emptyList){
			slack.push(lastRectangle);
			if(heightCase > 0 && lastRectangle.getHeight() < heightCase){
				slack.push(new UnfinishedRectangle(lastRectSoBig.getStartColumn(), heightCase));
			}
		}
		else if(heightCase > 0){
			slack.push(new UnfinishedRectangle(lastRectSoBig.getStartColumn(), heightCase));
		}
	}

	private boolean isBiggerThanPrevious(UnfinishedRectangle lastRectangle,
			int width) {
		return this.solution.getArea() < (lastRectangle.getHeight()*width);
	}

	private void addNewUnfinishedRectangle(int heightCase, Slack slack, int j) {
		slack.push(new UnfinishedRectangle(j, heightCase));
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
