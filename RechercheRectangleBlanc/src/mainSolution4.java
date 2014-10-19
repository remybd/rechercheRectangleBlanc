import paving.Paving;
import paving.Rectangle;
import solver.Solution4;
import exceptions.PavingImportException;


public class mainSolution4 {

	public static void main(String[] args) {
		String pathToFile = args[0];

		try {
			Paving pavingToSolve = Paving.loadPavingFromFile(pathToFile);
			
			Solution4 solution = new Solution4();
			
			Rectangle rMax = solution.getSolution(pavingToSolve);
			
			System.out.println(rMax);
		} catch (PavingImportException e) {
			e.printStackTrace();
		}
	}
}
