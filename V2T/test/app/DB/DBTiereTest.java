/**
 * 
 */
package app.DB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import app.Lebenswesen.Amsel;
import app.Lebenswesen.Goldfisch;
import app.Lebenswesen.Igel;
import app.Lebenswesen.Katze;
import app.Lebenswesen.Lebenswesen;
import app.Lebenswesen.Tier;

/**
 * @author Ali
 *
 */
class DBTiereTest {

	/**
	 * Test method for {@link app.DB.DBTiere#totalWeight()}.
	 */
	@Test
	final void testTotalWeight() {
		Goldfisch gf = new Goldfisch(10, 15);
		
		Amsel a = new Amsel(10, 15);
		
		
		Katze k = new Katze(10, 15);
		Igel i1 = new Igel(10, 15);

		Lebenswesen[] igelFeld = new Tier[ 10 ];
		
		DBTiere<Lebenswesen> igelDB = new DBTiere<Lebenswesen>(igelFeld);

		igelDB.appendLast(a);
		igelDB.appendLast(k);
		igelDB.appendLast(i1);
		igelDB.appendLast(gf);
		
		
		
		assertEquals(60,igelDB.totalWeight());
		
		
		
		
//		System.out.println("Total Weight" + igelDB.totalWeight());
	}

}
