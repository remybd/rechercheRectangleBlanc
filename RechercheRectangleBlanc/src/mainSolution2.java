import paving.Paving;
import paving.Rectangle;
import solver.Solution2;
import exceptions.PavingImportException;


public class mainSolution2 {

	public static void main(String[] args) {
		String pathToFile = args[0];

		try {
			Paving pavingToSolve = Paving.loadPavingFromFile(pathToFile);
			
			Solution2 solution = new Solution2();
			
			Rectangle rMax = solution.getSolution(pavingToSolve);
			
			System.out.println(rMax);
		} catch (PavingImportException e) {
			e.printStackTrace();
		}
	}
}
