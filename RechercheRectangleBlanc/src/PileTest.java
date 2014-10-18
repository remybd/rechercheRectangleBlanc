import java.io.IOException;
import java.util.Random;

import org.junit.Test;

import exceptions.ErrorInFileException;

public class PileTest {

	@Test(expected=RuntimeException.class)
	public void AjoutAvecPilePleine() throws IOException, ErrorInFileException {
		Pile pile = new Pile(10);
		Random r = new Random();
		
		for(int i=0;i<11;i++) {
			pile.push(r.nextInt());
		}
	}
	
	@Test(expected=RuntimeException.class)
	public void RetraitAvecPileVide() {
		Pile pile = new Pile(10);
		
		pile.pop();
	}
}