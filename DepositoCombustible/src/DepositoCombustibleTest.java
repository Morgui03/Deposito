import static org.junit.Assert.*;
import org.junit.Test;

public class DepositoCombustibleTest {
	
		DepositoCombustible depositoT = new DepositoCombustible(10.0,5.2);
		
	@Test
	public void testGetDepositoNivel() {
		assertEquals(5.2,depositoT.getDepositoNivel(),0);
	}

	@Test
	public void testGetDepositoMax() {
		assertEquals(10.0,depositoT.getDepositoMax(),0);
	}

	@Test
	public void testEstaVacio() {
		assertFalse(depositoT.estaVacio());
	}

	@Test
	public void testEstaLleno() {
		assertFalse(depositoT.estaLleno());
	}
}
