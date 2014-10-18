import java.io.IOException;
import java.util.Random;

import exceptions.ErrorInFileException;
import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testFullBlanc() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/fullBlanc.txt");
		
		Rectangle rectSol = main.solution1(d1);
		assertEquals(rectSol.getNumLigne(),0);
		assertEquals(rectSol.getNumColonne(),0);
		assertEquals(rectSol.getHauteur(),4);
		assertEquals(rectSol.getLargeur(),5);
		assertEquals(rectSol.getAire(),20);
		
		Rectangle rectSo2 = main.solution2(d1);
		assertEquals(rectSo2.getAire(),20);
		
		Rectangle rectSo3 = main.solution3(d1);
		assertEquals(rectSo3.getAire(),20);
		
		Rectangle rectSo4 = main.solution4(d1);
		assertEquals(rectSo4.getAire(),20);
	}
	
	@Test
	public void testFullNoir() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/fullNoir.txt");
		
		Rectangle rectSol = main.solution1(d1);
		assertEquals(rectSol.getNumLigne(),0);
		assertEquals(rectSol.getNumColonne(),0);
		assertEquals(rectSol.getHauteur(),0);
		assertEquals(rectSol.getLargeur(),0);
		assertEquals(rectSol.getAire(),0);
		
		Rectangle rectSo2 = main.solution2(d1);
		assertEquals(rectSo2.getAire(),0);
		
		Rectangle rectSo3 = main.solution3(d1);
		assertEquals(rectSo3.getAire(),0);
		
		Rectangle rectSo4 = main.solution4(d1);
		assertEquals(rectSo4.getAire(),0);
		
		
	}
	
	@Test
	public void testNoirCentre() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/noirCentre.txt");
		
		Rectangle rectSol = main.solution1(d1);
		assertEquals(rectSol.getNumLigne(),0);
		assertEquals(rectSol.getNumColonne(),0);
		assertEquals(rectSol.getHauteur(),3);
		assertEquals(rectSol.getLargeur(),5);
		assertEquals(rectSol.getAire(),15);
		
		Rectangle rectSo2 = main.solution2(d1);
		assertEquals(rectSo2.getAire(),15);
		
		Rectangle rectSo3 = main.solution3(d1);
		assertEquals(rectSo3.getAire(),15);
		
		Rectangle rectSo4 = main.solution4(d1);
		assertEquals(rectSo4.getAire(),15);
	}
	
	@Test
	public void testBlancCentre() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/blancCentre.txt");
		
		Rectangle rectSol = main.solution1(d1);
		assertEquals(rectSol.getNumLigne(),3);
		assertEquals(rectSol.getNumColonne(),2);
		assertEquals(rectSol.getHauteur(),1);
		assertEquals(rectSol.getLargeur(),1);
		assertEquals(rectSol.getAire(),1);
		
		Rectangle rectSo2 = main.solution2(d1);
		assertEquals(rectSo2.getAire(),1);
		
		Rectangle rectSo3 = main.solution3(d1);
		assertEquals(rectSo3.getAire(),1);
		
		Rectangle rectSo4 = main.solution4(d1);
		assertEquals(rectSo4.getAire(),1);
	}
	
	@Test
	public void testNoirDernier() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/noirDernier.txt");
		
		Rectangle rectSol = main.solution1(d1);
		assertEquals(rectSol.getNumLigne(),0);
		assertEquals(rectSol.getNumColonne(),0);
		assertEquals(rectSol.getHauteur(),6);
		assertEquals(rectSol.getLargeur(),5);
		assertEquals(rectSol.getAire(),30);
		
		Rectangle rectSo2 = main.solution2(d1);
		assertEquals(rectSo2.getAire(),30);
		
		Rectangle rectSo3 = main.solution3(d1);
		assertEquals(rectSo3.getAire(),30);
		
		Rectangle rectSo4 = main.solution4(d1);
		assertEquals(rectSo4.getAire(),30);
	}
	
	@Test
	public void testBlancDernier() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/blancDernier.txt");
		
		Rectangle rectSol = main.solution1(d1);
		assertEquals(rectSol.getNumLigne(),6);
		assertEquals(rectSol.getNumColonne(),4);
		assertEquals(rectSol.getHauteur(),1);
		assertEquals(rectSol.getLargeur(),1);
		assertEquals(rectSol.getAire(),1);
		
		Rectangle rectSo2 = main.solution2(d1);
		assertEquals(rectSo2.getAire(),1);
		
		Rectangle rectSo3 = main.solution3(d1);
		assertEquals(rectSo3.getAire(),1);
		
		Rectangle rectSo4 = main.solution4(d1);
		assertEquals(rectSo4.getAire(),1);
	}
	
	@Test
	public void testNoirPremier() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/noirPremier.txt");
		
		Rectangle rectSol = main.solution1(d1);
		assertEquals(rectSol.getNumLigne(),1);
		assertEquals(rectSol.getNumColonne(),0);
		assertEquals(rectSol.getHauteur(),6);
		assertEquals(rectSol.getLargeur(),5);
		assertEquals(rectSol.getAire(),30);
		
		Rectangle rectSo2 = main.solution2(d1);
		assertEquals(rectSo2.getAire(),30);
		
		Rectangle rectSo3 = main.solution3(d1);
		assertEquals(rectSo3.getAire(),30);
		
		Rectangle rectSo4 = main.solution4(d1);
		assertEquals(rectSo4.getAire(),30);
	}
	
	@Test
	public void testBlancPremier() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/blancPremier.txt");
		
		Rectangle rectSol = main.solution1(d1);
		assertEquals(rectSol.getNumLigne(),0);
		assertEquals(rectSol.getNumColonne(),0);
		assertEquals(rectSol.getHauteur(),1);
		assertEquals(rectSol.getLargeur(),1);
		assertEquals(rectSol.getAire(),1);
		
		Rectangle rectSo2 = main.solution2(d1);
		assertEquals(rectSo2.getAire(),1);
		
		Rectangle rectSo3 = main.solution3(d1);
		assertEquals(rectSo3.getAire(),1);
		
		Rectangle rectSo4 = main.solution4(d1);
		assertEquals(rectSo4.getAire(),1);
	}
	
	@Test
	public void testNoirDiagonale() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/noirDiagonale.txt");
		
		Rectangle rectSol = main.solution1(d1);
		assertEquals(rectSol.getNumLigne(),0);
		assertEquals(rectSol.getNumColonne(),2);
		assertEquals(rectSol.getHauteur(),2);
		assertEquals(rectSol.getLargeur(),3);
		assertEquals(rectSol.getAire(),6);
		
		Rectangle rectSo2 = main.solution2(d1);
		assertEquals(rectSo2.getAire(),6);
		
		Rectangle rectSo3 = main.solution3(d1);
		assertEquals(rectSo3.getAire(),6);
		
		Rectangle rectSo4 = main.solution4(d1);
		assertEquals(rectSo4.getAire(),6);
	}
	
	@Test
	public void testBlancDiagonale() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/blancDiagonale.txt");
		
		Rectangle rectSol = main.solution1(d1);
		assertEquals(rectSol.getNumLigne(),0);
		assertEquals(rectSol.getNumColonne(),0);
		assertEquals(rectSol.getHauteur(),1);
		assertEquals(rectSol.getLargeur(),1);
		assertEquals(rectSol.getAire(),1);
		
		Rectangle rectSo2 = main.solution2(d1);
		assertEquals(rectSo2.getAire(),1);
		
		Rectangle rectSo3 = main.solution3(d1);
		assertEquals(rectSo3.getAire(),1);
		
		Rectangle rectSo4 = main.solution4(d1);
		assertEquals(rectSo4.getAire(),1);
	}
	
	@Test
	public void testNoirDoubleDiagonale() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/noirDoubleDiagonale.txt");
		
		Rectangle rectSol = main.solution1(d1);
		assertEquals(rectSol.getNumLigne(),0);
		assertEquals(rectSol.getNumColonne(),1);
		assertEquals(rectSol.getHauteur(),1);
		assertEquals(rectSol.getLargeur(),3);
		assertEquals(rectSol.getAire(),3);
		
		Rectangle rectSo2 = main.solution2(d1);
		assertEquals(rectSo2.getAire(),3);
		
		Rectangle rectSo3 = main.solution3(d1);
		assertEquals(rectSo3.getAire(),3);
		
		Rectangle rectSo4 = main.solution4(d1);
		assertEquals(rectSo4.getAire(),3);
	}
	
	@Test
	public void testBlancDoubleDiagonale() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/blancDoubleDiagonale.txt");
		
		Rectangle rectSol = main.solution1(d1);
		assertEquals(rectSol.getNumLigne(),0);
		assertEquals(rectSol.getNumColonne(),0);
		assertEquals(rectSol.getHauteur(),1);
		assertEquals(rectSol.getLargeur(),1);
		assertEquals(rectSol.getAire(),1);
		
		Rectangle rectSo2 = main.solution2(d1);
		assertEquals(rectSo2.getAire(),1);
		
		Rectangle rectSo3 = main.solution3(d1);
		assertEquals(rectSo3.getAire(),1);
		
		Rectangle rectSo4 = main.solution4(d1);
		assertEquals(rectSo4.getAire(),1);
	}
	
	@Test
	public void AllVersionsRandomTest() {
		Random randomGenerator = new Random();
		int lignes = 0;
		int colonnes = 0;
		int pourcentage = 0; 
		
		for(int i=0; i<20; i++) {
			lignes = randomGenerator.nextInt(10) + 1;
			colonnes = randomGenerator.nextInt(10) + 1;
			pourcentage = randomGenerator.nextInt(100);
			System.out.println("Nombre de lignes : " + lignes);
			System.out.println("Nombre de colonnes : " + colonnes);
			System.out.println("Pourcentage : " + pourcentage);

			Dallage d = new Dallage(lignes, colonnes, pourcentage);
			
			Rectangle rectSol1 = main.solution1(d);
			Rectangle rectSol2 = main.solution2(d);
			Rectangle rectSol3 = main.solution3(d);
			Rectangle rectSol4 = main.solution4(d);

			assertEquals(rectSol1.getAire(), rectSol2.getAire());
			assertEquals(rectSol1.getAire(), rectSol3.getAire());
			
			if(rectSol1.getAire()!= rectSol4.getAire()){
				System.out.println(rectSol1.getAire() + "   " +  rectSol4.getAire() + "    " + rectSol4.getNumLigne() + "  " + rectSol4.getNumColonne() + "   " + rectSol4.getHauteur() + "   " + rectSol4.getLargeur() );
				System.out.println(d.toString());
			}
			assertEquals(rectSol1.getAire(), rectSol4.getAire());
			
			
		}
	}
	
	//@Test
	public void AllVersionsRandomTest1() {
		Random randomGenerator = new Random();
		int lignes = 0;
		int colonnes = 0;
		int pourcentage = 0; 
		
		for(int i=0; i<10; i++) {
			lignes = randomGenerator.nextInt(50);
			colonnes = randomGenerator.nextInt(50);
			pourcentage = randomGenerator.nextInt(100);
			Dallage d = new Dallage(200, 200, 50);
			
			Rectangle rectSol1 = main.solution1(d);

			assertEquals(rectSol1.getAire(), rectSol1.getAire());
		}
	}
	
	//@Test
	public void AllVersionsRandomTest2() {
		Random randomGenerator = new Random();
		int lignes = 0;
		int colonnes = 0;
		int pourcentage = 0; 
		
		for(int i=0; i<10; i++) {
			lignes = randomGenerator.nextInt(50);
			colonnes = randomGenerator.nextInt(50);
			pourcentage = randomGenerator.nextInt(100);
			Dallage d = new Dallage(200, 200, 99);
			
			Rectangle rectSol2 = main.solution2(d);

			assertEquals(rectSol2.getAire(), rectSol2.getAire());
		}
	}
	
	
	//@Test
	public void AllVersionsRandomTest3() {
		Random randomGenerator = new Random();
		int lignes = 0;
		int colonnes = 0;
		int pourcentage = 0; 
		
		for(int i=0; i<10; i++) {
			lignes = randomGenerator.nextInt(50);
			colonnes = randomGenerator.nextInt(50);
			pourcentage = randomGenerator.nextInt(100);
			Dallage d = new Dallage(200, 200, 99);
			
			Rectangle rectSol3 = main.solution3(d);

			assertEquals(rectSol3.getAire(), rectSol3.getAire());
		}
	}
}
