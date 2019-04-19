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
		
		DBFeldFixgen<Lebenswesen> igelDB = new DBFeldFixgen<Lebenswesen>(igelFeld);

		igelDB.appendLast(gf);
		igelDB.appendLast(k);
		igelDB.appendLast(i1);
		assertEquals(3, igelDB.size());
		assertEquals(k, igelDB.get(2));
		assertEquals(gf, igelDB.get(1));

		// removing one element from db
		igelDB.removeLast();
		assertEquals(2, igelDB.size());
		
		
		
//		System.out.println("Total Weight" + igelDB.totalWeight());
	}

}
