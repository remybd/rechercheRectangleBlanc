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
		int nbAcces = 0;
		int nbAccesTab = 0;
		int pourcentage = 0; 
		long startTime;
		long endTime;
		
		float sommeTime1;
		float sommeTime2;
		float sommeTime3;
		float sommeTime4;
		
		long somme1;
		long somme2;
		long somme3;
		long somme4;
		
		System.out.println("	time1		time2		time3		time4		somme1	somme2	somme3	somme4");
		for(int i=0; i<25; i++) {
			 sommeTime1 = 0;
			 sommeTime2 = 0;
			 sommeTime3 = 0;
			 sommeTime4 = 0;
			 
			 somme1 = 0;
			 somme2 = 0;
			 somme3 = 0;
			 somme4 = 0;

			for(int j = 0; j <= 100; j++){
	
				Dallage d = new Dallage(i,i, j);
				
				Rectangle rectSol1 = null;
				startTime = System.currentTimeMillis();	
				for(int k = 0; k < 50; k++){
					rectSol1 = main.solution1(d);
				}
				endTime = System.currentTimeMillis();
				
				sommeTime1 += ((endTime-startTime));
				somme1 += (d.getNbreAcces()/50);
				nbAccesTab = d.getNbreAccesTab()+ nbAcces;
				
				d.setNbreAcces(0);
				d.setNbreAccesTab(0);
				
				
				
				
				Rectangle rectSol2 = null;;
				startTime = System.currentTimeMillis();	
				for(int k = 0; k < 500; k++){
					rectSol2 = main.solution2(d);
				}
				endTime = System.currentTimeMillis();
				
				sommeTime2 += ((endTime-startTime));
				somme2 += (d.getNbreAcces()/500);
				nbAccesTab = d.getNbreAccesTab()+ nbAcces;
				
				d.setNbreAcces(0);
				d.setNbreAccesTab(0);
				
				
				
				
				Rectangle rectSol3 = null;;
				startTime = System.currentTimeMillis();	
				for(int k = 0; k < 500; k++){
					rectSol3 = main.solution3(d);
				}
				endTime = System.currentTimeMillis();
				
				sommeTime3 += ((endTime-startTime));
				somme3 += ((d.getNbreAcces() + d.getNbreAccesTab())/500);
				nbAccesTab = d.getNbreAccesTab()+ nbAcces;
				
				d.setNbreAcces(0);
				d.setNbreAccesTab(0);
				
				
				
				
				Rectangle rectSol4 = null;
				startTime = System.currentTimeMillis();	
				for(int k = 0; k < 500; k++){
					rectSol4 = main.solution4(d);
				}
				endTime = System.currentTimeMillis();
				
				sommeTime4 += ((endTime-startTime));
				somme4 += ((d.getNbreAcces() + d.getNbreAccesTab())/500);
				nbAccesTab = d.getNbreAccesTab()+ nbAcces;
				
				d.setNbreAcces(0);
				d.setNbreAccesTab(0);
				
				
	
				assertEquals(rectSol1.getAire(), rectSol2.getAire());
				assertEquals(rectSol1.getAire(), rectSol3.getAire());
				assertEquals(rectSol1.getAire(), rectSol4.getAire());
			}
			
			System.out.println(i + "	" + (sommeTime1/101) + "	" + (sommeTime2/101) + "	" +	(sommeTime3/101) + "	" + (sommeTime4/101) + "	" + (somme1/101) + "	" + (somme2/101) + "	" + (somme3/101) + "	" + (somme4/101));
			
			
		}
	}
	
	@Test
	public void AllVersionsRandomTest1() {
		Random randomGenerator = new Random();
		int lignes = 0;
		int colonnes = 0;
		int pourcentage = 0; 
		
		for(int i=200; i<300; i++) {
			pourcentage = 70;
			Dallage d = new Dallage(i, i, pourcentage);
			
			long startTime = System.currentTimeMillis();
			Rectangle rectSol1 = main.solution1(d);
			long endTime = System.currentTimeMillis();
			
			System.out.println(endTime-startTime);
			assertEquals(rectSol1.getAire(), rectSol1.getAire());
		}
	}
	
	@Test
	public void AllVersionsRandomTest2() {
		Random randomGenerator = new Random();
		int lignes = 0;
		int colonnes = 0;
		int pourcentage = 0; 
		
		for(int i=1000; i<1050; i++) {
			pourcentage = randomGenerator.nextInt(100);
			Dallage d = new Dallage(i, i, 99);
			
			long startTime = System.currentTimeMillis();
			Rectangle rectSol2 = main.solution2(d);
			long endTime = System.currentTimeMillis();
			
			System.out.println(endTime-startTime);
			assertEquals(rectSol2.getAire(), rectSol2.getAire());
		}
	}
	
	
	@Test
	public void AllVersionsRandomTest3() {
		Random randomGenerator = new Random();
		int lignes = 0;
		int colonnes = 0;
		int pourcentage = 0; 
		
		for(int i=1000; i<1100; i++) {
			pourcentage = randomGenerator.nextInt(100);
			Dallage d = new Dallage(i,i, 99);
			
			long startTime = System.currentTimeMillis();
			Rectangle rectSol3 = main.solution3(d);
			long endTime = System.currentTimeMillis();
			
			System.out.println(endTime-startTime);
			assertEquals(rectSol3.getAire(), rectSol3.getAire());
		}
	}
	
	
	@Test
	public void AllVersionsRandomTest4() {
		Random randomGenerator = new Random();
		int lignes = 0;
		int colonnes = 0;
		int pourcentage = 0; 
		
		for(int i=3500; i<3600; i++) {
			lignes = randomGenerator.nextInt(20000)+1;
			pourcentage = randomGenerator.nextInt(100);
			Dallage d = new Dallage(i, i, 70);
			
			long startTime = System.currentTimeMillis();
			Rectangle rectSol4 = main.solution4(d);
			long endTime = System.currentTimeMillis();
			
			System.out.println(endTime-startTime);

			assertEquals(rectSol4.getAire(), rectSol4.getAire());
		}
	}
}
