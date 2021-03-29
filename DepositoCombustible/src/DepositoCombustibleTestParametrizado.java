import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Test;

public class DepositoCombustibleTestParametrizado {
	
	DepositoCombustible depositoT = new DepositoCombustible(10.0,5.2);
	
	@Test
	public void testFill1() {
		depositoT.fill(1);
			assertEquals(6.2, depositoT.getDepositoNivel(),0);
	}
	@Test
	public void testFill2() {
		depositoT.fill(14);
			assertEquals(10.0, depositoT.getDepositoNivel(),0);
	}
	@Test
	public void testFill3() {
		depositoT.fill(-1);
			assertEquals(5.2, depositoT.getDepositoNivel(),0);
	}
	@Test
	public void testConsumir1() {
		depositoT.consumir(3);
			assertEquals(2.2, depositoT.getDepositoNivel(),0);
		depositoT.consumir(-3);
			assertEquals(5.2, depositoT.getDepositoNivel(),0);
	}
	@Test
	public void testConsumir2() {
		depositoT.consumir(6);
			assertEquals(0, depositoT.getDepositoNivel(),0);
	}
	@Test
	public void testConsumir3() {
		depositoT.consumir(-3);
			assertEquals(5.2, depositoT.getDepositoNivel(),0);
	}

}
