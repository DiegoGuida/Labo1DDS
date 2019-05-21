package ar.utn.dds;

import org.junit.Assert;
import org.junit.Test;


public class AutoTest {
	
	@Test
	public void testEncendidoOk() throws Exception { //el exception es la mas general si tengo 14 tengo que declarar las 14
		Auto auto = new Auto();
		auto.setCombustible(13.986);

		auto.encender(); //lo extiendo de excepcion comun porque no me importa si se rompe el test

		//subo una linnea
		
		//el tercer parametro es la precicion esto lo pide por usar double
		Assert.assertTrue(auto.isEncendido());

	}
	
	@Test(expected=SinCombustibleException.class) 	//este test da positivo si y solo si arroja la excepcion
	public void testSinCombustible() throws Exception {
		Auto auto = new Auto();
		
		auto.encender();
		
		
	}
	
	
}
