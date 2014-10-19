import paving.Paving;
import paving.Rectangle;
import solver.Solution3;
import exceptions.PavingImportException;


public class mainSolution3 {

	public static void main(String[] args) {
		String pathToFile = args[0];

		try {
			Paving pavingToSolve = Paving.loadPavingFromFile(pathToFile);
			
			Solution3 solution = new Solution3();
			
			Rectangle rMax = solution.getSolution(pavingToSolve);
			
			System.out.println(rMax);
		} catch (PavingImportException e) {
			e.printStackTrace();
		}
	}
}
