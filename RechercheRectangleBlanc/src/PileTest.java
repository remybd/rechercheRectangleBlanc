import java.io.IOException;
import java.util.Random;

import org.junit.Test;

import exceptions.ErrorInFileException;

public class PileTest {

	@Test
	public void AjoutAvecPilePleine() throws IOException, ErrorInFileException {
		Pile pile = new Pile();
		Random r = new Random();
		
		for(int i=0;i<1000;i++) {
			pile.push(r.nextInt());
		}
	}
	
	@Test(expected=RuntimeException.class)
	public void RetraitAvecPileVide() {
		Pile pile = new Pile();
		
		pile.pop();
	}
}