/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author iaw39443990
 *
 */
public class MacBookAirTest {
	MacBookAir mac;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	//Insertamos el tipo, creamos un new MacBookAir, insertamos marca,modelo,velocidad.
	@Before
	public void setUp() throws Exception {
		mac = new MacBookAir("mac", "air", 100);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		mac = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.thirdassignmenttopic.MacBookAir#overclock()}.
	 */
	//Realizamos un assertEquals con el resultado de 100(setUP)*1.5(DeviceImpl/overclock), donde tiene que encontrar el overclock y los decimales.
	//PREGUNTAR AL PROFE PORQUE DA RESULTADO 0.0
	@Test
	public final void testOverclock() throws Exception {
		assertEquals(150.0, mac.overclock(),1.0e-4);
	}

}
