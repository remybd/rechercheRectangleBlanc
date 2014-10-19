import exceptions.PavingImportException;
import paving.Paving;
import paving.Rectangle;
import solver.Solution1;


public class mainSolution1 {

	public static void main(String[] args) {
		String pathToFile = args[0];

		try {
			Paving pavingToSolve = Paving.loadPavingFromFile(pathToFile);
			
			Solution1 solution = new Solution1();
			
			Rectangle rMax = solution.getSolution(pavingToSolve);
			
			System.out.println(rMax);
		} catch (PavingImportException e) {
			e.printStackTrace();
		}
	}
}
