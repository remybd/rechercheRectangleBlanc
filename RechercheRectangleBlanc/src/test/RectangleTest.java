package test;
import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

import paving.Paving;
import paving.Rectangle;
import solver.Solution1;
import solver.Solution2;
import solver.Solution3;
import solver.Solution4;
import exceptions.PavingImportException;

public class RectangleTest {
	
	@Test
	public void fullBlack() throws PavingImportException {
		Paving paving = Paving.loadPavingFromFile("testFiles/fullBlack.txt");
		
		Solution1 solution1 = new Solution1();
		Solution2 solution2 = new Solution2();
		Solution3 solution3 = new Solution3();
		Solution4 solution4 = new Solution4();

		
		Rectangle rectSol = solution1.getSolution(paving);
		assertEquals(rectSol.getNumRow(),0);
		assertEquals(rectSol.getNumColumn(),0);
		assertEquals(rectSol.getHeight(),0);
		assertEquals(rectSol.getWidth(),0);
		assertEquals(rectSol.getArea(),0);
		
			
		Rectangle rectSo2 = solution2.getSolution(paving);
		assertEquals(rectSo2.getArea(),0);
		
		Rectangle rectSo3 = solution3.getSolution(paving);
		assertEquals(rectSo3.getArea(),0);
		
		Rectangle rectSo4 = solution4.getSolution(paving);
		assertEquals(rectSo4.getArea(),0);
	}
	
	@Test
	public void fullWhite() throws PavingImportException {
		Paving paving = Paving.loadPavingFromFile("testFiles/fullWhite.txt");
		
		Solution1 solution1 = new Solution1();
		Solution2 solution2 = new Solution2();
		Solution3 solution3 = new Solution3();
		Solution4 solution4 = new Solution4();

		
		Rectangle rectSol = solution1.getSolution(paving);
		assertEquals(rectSol.getNumRow(),0);
		assertEquals(rectSol.getNumColumn(),0);
		assertEquals(rectSol.getHeight(),4);
		assertEquals(rectSol.getWidth(),5);
		assertEquals(rectSol.getArea(),20);
		
			
		Rectangle rectSo2 = solution2.getSolution(paving);
		assertEquals(rectSo2.getArea(),20);
		
		Rectangle rectSo3 = solution3.getSolution(paving);
		assertEquals(rectSo3.getArea(),20);
		
		Rectangle rectSo4 = solution4.getSolution(paving);
		assertEquals(rectSo4.getArea(),20);
	}
	
	@Test
	public void middleBlack() throws PavingImportException {
		Paving paving = Paving.loadPavingFromFile("testFiles/middleBlack.txt");
		
		Solution1 solution1 = new Solution1();
		Solution2 solution2 = new Solution2();
		Solution3 solution3 = new Solution3();
		Solution4 solution4 = new Solution4();

		
		Rectangle rectSol = solution1.getSolution(paving);
		assertEquals(rectSol.getNumRow(),0);
		assertEquals(rectSol.getNumColumn(),0);
		assertEquals(rectSol.getHeight(),3);
		assertEquals(rectSol.getWidth(),5);
		assertEquals(rectSol.getArea(),15);
		
			
		Rectangle rectSo2 = solution2.getSolution(paving);
		assertEquals(rectSo2.getArea(),15);
		
		Rectangle rectSo3 = solution3.getSolution(paving);
		assertEquals(rectSo3.getArea(),15);
		
		Rectangle rectSo4 = solution4.getSolution(paving);
		assertEquals(rectSo4.getArea(),15);
	}
	
	@Test
	public void middleWhite() throws PavingImportException {
		Paving paving = Paving.loadPavingFromFile("testFiles/middleWhite.txt");
		
		Solution1 solution1 = new Solution1();
		Solution2 solution2 = new Solution2();
		Solution3 solution3 = new Solution3();
		Solution4 solution4 = new Solution4();

		
		Rectangle rectSol = solution1.getSolution(paving);
		assertEquals(rectSol.getNumRow(),3);
		assertEquals(rectSol.getNumColumn(),2);
		assertEquals(rectSol.getHeight(),1);
		assertEquals(rectSol.getWidth(),1);
		assertEquals(rectSol.getArea(),1);
		
			
		Rectangle rectSo2 = solution2.getSolution(paving);
		assertEquals(rectSo2.getArea(),1);
		
		Rectangle rectSo3 = solution3.getSolution(paving);
		assertEquals(rectSo3.getArea(),1);
		
		Rectangle rectSo4 = solution4.getSolution(paving);
		assertEquals(rectSo4.getArea(),1);
	}
	
	@Test
	public void lastBlack() throws PavingImportException {
		Paving paving = Paving.loadPavingFromFile("testFiles/lastBlack.txt");
		
		Solution1 solution1 = new Solution1();
		Solution2 solution2 = new Solution2();
		Solution3 solution3 = new Solution3();
		Solution4 solution4 = new Solution4();

		
		Rectangle rectSol = solution1.getSolution(paving);
		assertEquals(rectSol.getNumRow(),0);
		assertEquals(rectSol.getNumColumn(),0);
		assertEquals(rectSol.getHeight(),6);
		assertEquals(rectSol.getWidth(),5);
		assertEquals(rectSol.getArea(),30);
		
			
		Rectangle rectSo2 = solution2.getSolution(paving);
		assertEquals(rectSo2.getArea(),30);
		
		Rectangle rectSo3 = solution3.getSolution(paving);
		assertEquals(rectSo3.getArea(),30);
		
		Rectangle rectSo4 = solution4.getSolution(paving);
		assertEquals(rectSo4.getArea(),30);
	}
	
	@Test
	public void lastWhite() throws PavingImportException {
		Paving paving = Paving.loadPavingFromFile("testFiles/lastWhite.txt");
		
		Solution1 solution1 = new Solution1();
		Solution2 solution2 = new Solution2();
		Solution3 solution3 = new Solution3();
		Solution4 solution4 = new Solution4();

		
		Rectangle rectSol = solution1.getSolution(paving);
		assertEquals(rectSol.getNumRow(),6);
		assertEquals(rectSol.getNumColumn(),4);
		assertEquals(rectSol.getHeight(),1);
		assertEquals(rectSol.getWidth(),1);
		assertEquals(rectSol.getArea(),1);
		
			
		Rectangle rectSo2 = solution2.getSolution(paving);
		assertEquals(rectSo2.getArea(),1);
		
		Rectangle rectSo3 = solution3.getSolution(paving);
		assertEquals(rectSo3.getArea(),1);
		
		Rectangle rectSo4 = solution4.getSolution(paving);
		assertEquals(rectSo4.getArea(),1);
	}
	
	@Test
	public void firstBlack() throws PavingImportException {
		Paving paving = Paving.loadPavingFromFile("testFiles/firstBlack.txt");
		
		Solution1 solution1 = new Solution1();
		Solution2 solution2 = new Solution2();
		Solution3 solution3 = new Solution3();
		Solution4 solution4 = new Solution4();

		
		Rectangle rectSol = solution1.getSolution(paving);
		assertEquals(rectSol.getNumRow(),1);
		assertEquals(rectSol.getNumColumn(),0);
		assertEquals(rectSol.getHeight(),6);
		assertEquals(rectSol.getWidth(),5);
		assertEquals(rectSol.getArea(),30);
		
			
		Rectangle rectSo2 = solution2.getSolution(paving);
		assertEquals(rectSo2.getArea(),30);
		
		Rectangle rectSo3 = solution3.getSolution(paving);
		assertEquals(rectSo3.getArea(),30);
		
		Rectangle rectSo4 = solution4.getSolution(paving);
		assertEquals(rectSo4.getArea(),30);
	}
	
	@Test
	public void firstWhite() throws PavingImportException {
		Paving paving = Paving.loadPavingFromFile("testFiles/firstWhite.txt");
		
		Solution1 solution1 = new Solution1();
		Solution2 solution2 = new Solution2();
		Solution3 solution3 = new Solution3();
		Solution4 solution4 = new Solution4();

		
		Rectangle rectSol = solution1.getSolution(paving);
		assertEquals(rectSol.getNumRow(),0);
		assertEquals(rectSol.getNumColumn(),0);
		assertEquals(rectSol.getHeight(),1);
		assertEquals(rectSol.getWidth(),1);
		assertEquals(rectSol.getArea(),1);
		
			
		Rectangle rectSo2 = solution2.getSolution(paving);
		assertEquals(rectSo2.getArea(),1);
		
		Rectangle rectSo3 = solution3.getSolution(paving);
		assertEquals(rectSo3.getArea(),1);
		
		Rectangle rectSo4 = solution4.getSolution(paving);
		assertEquals(rectSo4.getArea(),1);
	}
	
	@Test
	public void blackDiagonal() throws PavingImportException {
		Paving paving = Paving.loadPavingFromFile("testFiles/blackDiagonal.txt");
		
		Solution1 solution1 = new Solution1();
		Solution2 solution2 = new Solution2();
		Solution3 solution3 = new Solution3();
		Solution4 solution4 = new Solution4();

		
		Rectangle rectSol = solution1.getSolution(paving);
		assertEquals(rectSol.getNumRow(),0);
		assertEquals(rectSol.getNumColumn(),2);
		assertEquals(rectSol.getHeight(),2);
		assertEquals(rectSol.getWidth(),3);
		assertEquals(rectSol.getArea(),6);
		
			
		Rectangle rectSo2 = solution2.getSolution(paving);
		assertEquals(rectSo2.getArea(),6);
		
		Rectangle rectSo3 = solution3.getSolution(paving);
		assertEquals(rectSo3.getArea(),6);
		
		Rectangle rectSo4 = solution4.getSolution(paving);
		assertEquals(rectSo4.getArea(),6);
	}
	
	@Test
	public void whiteDiagonal() throws PavingImportException {
		Paving paving = Paving.loadPavingFromFile("testFiles/whiteDiagonal.txt");
		
		Solution1 solution1 = new Solution1();
		Solution2 solution2 = new Solution2();
		Solution3 solution3 = new Solution3();
		Solution4 solution4 = new Solution4();

		
		Rectangle rectSol = solution1.getSolution(paving);
		assertEquals(rectSol.getNumRow(),0);
		assertEquals(rectSol.getNumColumn(),0);
		assertEquals(rectSol.getHeight(),1);
		assertEquals(rectSol.getWidth(),1);
		assertEquals(rectSol.getArea(),1);
		
			
		Rectangle rectSo2 = solution2.getSolution(paving);
		assertEquals(rectSo2.getArea(),1);
		
		Rectangle rectSo3 = solution3.getSolution(paving);
		assertEquals(rectSo3.getArea(),1);
		
		Rectangle rectSo4 = solution4.getSolution(paving);
		assertEquals(rectSo4.getArea(),1);
	}
	
	@Test
	public void doubleBlackDiagonal() throws PavingImportException {
		Paving paving = Paving.loadPavingFromFile("testFiles/doubleBlackDiagonal.txt");
		
		Solution1 solution1 = new Solution1();
		Solution2 solution2 = new Solution2();
		Solution3 solution3 = new Solution3();
		Solution4 solution4 = new Solution4();

		
		Rectangle rectSol = solution1.getSolution(paving);
		assertEquals(rectSol.getNumRow(),0);
		assertEquals(rectSol.getNumColumn(),1);
		assertEquals(rectSol.getHeight(),1);
		assertEquals(rectSol.getWidth(),3);
		assertEquals(rectSol.getArea(),3);
		
			
		Rectangle rectSo2 = solution2.getSolution(paving);
		assertEquals(rectSo2.getArea(),3);
		
		Rectangle rectSo3 = solution3.getSolution(paving);
		assertEquals(rectSo3.getArea(),3);
		
		Rectangle rectSo4 = solution4.getSolution(paving);
		assertEquals(rectSo4.getArea(),3);
	}
	
	@Test
	public void doubleWhiteDiagonal() throws PavingImportException {
		Paving paving = Paving.loadPavingFromFile("testFiles/doubleWhiteDiagonal.txt");
		
		Solution1 solution1 = new Solution1();
		Solution2 solution2 = new Solution2();
		Solution3 solution3 = new Solution3();
		Solution4 solution4 = new Solution4();

		
		Rectangle rectSol = solution1.getSolution(paving);
		assertEquals(rectSol.getNumRow(),0);
		assertEquals(rectSol.getNumColumn(),0);
		assertEquals(rectSol.getHeight(),1);
		assertEquals(rectSol.getWidth(),1);
		assertEquals(rectSol.getArea(),1);
		
			
		Rectangle rectSo2 = solution2.getSolution(paving);
		assertEquals(rectSo2.getArea(),1);
		
		Rectangle rectSo3 = solution3.getSolution(paving);
		assertEquals(rectSo3.getArea(),1);
		
		Rectangle rectSo4 = solution4.getSolution(paving);
		assertEquals(rectSo4.getArea(),1);
	}
	
	@Test
	public void custom() throws PavingImportException {
		Paving paving = Paving.loadPavingFromFile("testFiles/custom.txt");
		
		Solution1 solution1 = new Solution1();
		Solution2 solution2 = new Solution2();
		Solution3 solution3 = new Solution3();
		Solution4 solution4 = new Solution4();

		
		Rectangle rectSol = solution1.getSolution(paving);
		assertEquals(rectSol.getNumRow(),1);
		assertEquals(rectSol.getNumColumn(),0);
		assertEquals(rectSol.getHeight(),7);
		assertEquals(rectSol.getWidth(),2);
		assertEquals(rectSol.getArea(),14);
		
			
		Rectangle rectSo2 = solution2.getSolution(paving);
		assertEquals(rectSo2.getArea(),14);
		
		Rectangle rectSo3 = solution3.getSolution(paving);
		assertEquals(rectSo3.getArea(),14);
		
		Rectangle rectSo4 = solution4.getSolution(paving);
		assertEquals(rectSo4.getArea(),14);
	}
	
	@Test
	public void customBis() throws PavingImportException {
		Paving paving = Paving.loadPavingFromFile("testFiles/customBis.txt");
		
		Solution1 solution1 = new Solution1();
		Solution2 solution2 = new Solution2();
		Solution3 solution3 = new Solution3();
		Solution4 solution4 = new Solution4();

		
		Rectangle rectSol = solution1.getSolution(paving);
		assertEquals(rectSol.getNumRow(),1);
		assertEquals(rectSol.getNumColumn(),0);
		assertEquals(rectSol.getHeight(),2);
		assertEquals(rectSol.getWidth(),8);
		assertEquals(rectSol.getArea(),16);
		
			
		Rectangle rectSo2 = solution2.getSolution(paving);
		assertEquals(rectSo2.getArea(),16);
		
		Rectangle rectSo3 = solution3.getSolution(paving);
		assertEquals(rectSo3.getArea(),16);
		
		Rectangle rectSo4 = solution4.getSolution(paving);
		assertEquals(rectSo4.getArea(),16);
	}
	
	@Test
	public void AllVersionsRandomTest() {
		Random randomGenerator = new Random();
		int lignes = 0;
		int colonnes = 0;
		int pourcentage = 0; 
		
		for(int i=0; i<20000; i++) {
			lignes = randomGenerator.nextInt(10) + 1;
			colonnes = randomGenerator.nextInt(10) + 1;
			
			lignes = randomGenerator.nextInt(10) + 1;
			colonnes = randomGenerator.nextInt(10) + 1;
			pourcentage = randomGenerator.nextInt(100);
			System.out.println("Nombre de lignes : " + lignes);
			System.out.println("Nombre de colonnes : " + colonnes);
			System.out.println("Pourcentage : " + pourcentage);

			Paving d = Paving.newRandomPaving(lignes, colonnes, pourcentage);
			
			Solution1 solution1 = new Solution1();
			Rectangle rectSol1 = solution1.getSolution(d);
			Solution2 solution2 = new Solution2();
			Rectangle rectSol2 = solution2.getSolution(d);
			Solution3 solution3 = new Solution3();
			Rectangle rectSol3 = solution3.getSolution(d);
			Solution4 solution4 = new Solution4();
			Rectangle rectSol4 = solution4.getSolution(d);
			
			assertEquals(rectSol1.getArea(), rectSol2.getArea());
			assertEquals(rectSol1.getArea(), rectSol3.getArea());
			assertEquals(rectSol1.getArea(), rectSol4.getArea());
		}
	}
}
