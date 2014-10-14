import java.io.IOException;

import exceptions.ErrorInFileException;

import static org.junit.Assert.*;

import org.junit.Test;

public class TabTest {

	@Test
	public void testFullBlanc() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/fullBlanc.txt");
		
		Rectangle rectSol = mainClass.solution1(d1);
		assertEquals(rectSol.getNumLigne(),0);
		assertEquals(rectSol.getNumColonne(),0);
		assertEquals(rectSol.getHauteur(),4);
		assertEquals(rectSol.getLargeur(),5);
		assertEquals(rectSol.getAire(),20);
	}
	
	@Test
	public void testFullNoir() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/fullNoir.txt");
		
		Rectangle rectSol = mainClass.solution1(d1);
		assertEquals(rectSol.getNumLigne(),0);
		assertEquals(rectSol.getNumColonne(),0);
		assertEquals(rectSol.getHauteur(),0);
		assertEquals(rectSol.getLargeur(),0);
		assertEquals(rectSol.getAire(),0);
	}
	
	@Test
	public void testNoirCentre() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/noirCentre.txt");
		
		Rectangle rectSol = mainClass.solution1(d1);
		assertEquals(rectSol.getNumLigne(),0);
		assertEquals(rectSol.getNumColonne(),0);
		assertEquals(rectSol.getHauteur(),3);
		assertEquals(rectSol.getLargeur(),5);
		assertEquals(rectSol.getAire(),15);
	}
	
	@Test
	public void testBlancCentre() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/blancCentre.txt");
		
		Rectangle rectSol = mainClass.solution1(d1);
		assertEquals(rectSol.getNumLigne(),3);
		assertEquals(rectSol.getNumColonne(),2);
		assertEquals(rectSol.getHauteur(),1);
		assertEquals(rectSol.getLargeur(),1);
		assertEquals(rectSol.getAire(),1);
	}
	
	@Test
	public void testNoirDernier() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/noirDernier.txt");
		
		Rectangle rectSol = mainClass.solution1(d1);
		assertEquals(rectSol.getNumLigne(),0);
		assertEquals(rectSol.getNumColonne(),0);
		assertEquals(rectSol.getHauteur(),6);
		assertEquals(rectSol.getLargeur(),5);
		assertEquals(rectSol.getAire(),30);
	}
	
	@Test
	public void testBlancDernier() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/blancDernier.txt");
		
		Rectangle rectSol = mainClass.solution1(d1);
		assertEquals(rectSol.getNumLigne(),6);
		assertEquals(rectSol.getNumColonne(),4);
		assertEquals(rectSol.getHauteur(),1);
		assertEquals(rectSol.getLargeur(),1);
		assertEquals(rectSol.getAire(),1);
	}
	
	@Test
	public void testNoirPremier() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/noirPremier.txt");
		
		Rectangle rectSol = mainClass.solution1(d1);
		assertEquals(rectSol.getNumLigne(),1);
		assertEquals(rectSol.getNumColonne(),0);
		assertEquals(rectSol.getHauteur(),6);
		assertEquals(rectSol.getLargeur(),5);
		assertEquals(rectSol.getAire(),30);
	}
	
	@Test
	public void testBlancPremier() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/blancPremier.txt");
		
		Rectangle rectSol = mainClass.solution1(d1);
		assertEquals(rectSol.getNumLigne(),0);
		assertEquals(rectSol.getNumColonne(),0);
		assertEquals(rectSol.getHauteur(),1);
		assertEquals(rectSol.getLargeur(),1);
		assertEquals(rectSol.getAire(),1);
	}
	
	@Test
	public void testNoirDiagonale() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/noirDiagonale.txt");
		
		Rectangle rectSol = mainClass.solution1(d1);
		assertEquals(rectSol.getNumLigne(),0);
		assertEquals(rectSol.getNumColonne(),2);
		assertEquals(rectSol.getHauteur(),2);
		assertEquals(rectSol.getLargeur(),3);
		assertEquals(rectSol.getAire(),6);
	}
	
	@Test
	public void testBlancDiagonale() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/blancDiagonale.txt");
		
		Rectangle rectSol = mainClass.solution1(d1);
		assertEquals(rectSol.getNumLigne(),0);
		assertEquals(rectSol.getNumColonne(),0);
		assertEquals(rectSol.getHauteur(),1);
		assertEquals(rectSol.getLargeur(),1);
		assertEquals(rectSol.getAire(),1);
	}
	
	@Test
	public void testNoirDoubleDiagonale() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/noirDoubleDiagonale.txt");
		
		Rectangle rectSol = mainClass.solution1(d1);
		assertEquals(rectSol.getNumLigne(),0);
		assertEquals(rectSol.getNumColonne(),1);
		assertEquals(rectSol.getHauteur(),1);
		assertEquals(rectSol.getLargeur(),3);
		assertEquals(rectSol.getAire(),3);
	}
	
	@Test
	public void testBlancDoubleDiagonale() throws IOException, ErrorInFileException {
		Dallage d1 = new Dallage("fichiersTest/blancDoubleDiagonale.txt");
		
		Rectangle rectSol = mainClass.solution1(d1);
		assertEquals(rectSol.getNumLigne(),0);
		assertEquals(rectSol.getNumColonne(),0);
		assertEquals(rectSol.getHauteur(),1);
		assertEquals(rectSol.getLargeur(),1);
		assertEquals(rectSol.getAire(),1);
	}
}
