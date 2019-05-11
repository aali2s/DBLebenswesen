package test;

import app.DB.*;
import app.Lebenswesen.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class DBTest {

	@Ignore
	void katzeInIgelTest() {

		// Aufgabe 8.2

		@SuppressWarnings("unused")
		Goldfisch gf = new Goldfisch(10, 15);
		@SuppressWarnings("unused")
		Amsel a = new Amsel(10, 15);
		@SuppressWarnings("unused")
		Katze k = new Katze(10, 15);
		Igel i1 = new Igel(10, 15);

		Igel[] igelFeld = new Igel[10];

		DBFeldFixgen<Igel> igelDB = new DBFeldFixgen<Igel>(igelFeld);

		igelDB.appendLast(i1);

		// igelDB.appendLast(k);
		// beim Katze einfügen haben wir Fehler meldung die schlägt igelDB typ typ auf
		// KAtze DB umzuWandeln
		// oder beim Implementation statt T Katze zu deklarieren

	}

	@Ignore
	void testAsTierDB() {
		// Aufgabe 8.3 and 8.4
		Goldfisch gf = new Goldfisch(10, 15);
		@SuppressWarnings("unused")
		Amsel a = new Amsel(10, 15);
		Katze k = new Katze(10, 15);
		Igel i1 = new Igel(10, 15);

		Tier[] igelFeld = new Tier[10];

		DBFeldFixgen<Tier> igelDB = new DBFeldFixgen<Tier>(igelFeld);
		igelDB.appendLast(gf);
		igelDB.appendLast(k);
		igelDB.appendLast(i1);
		assertEquals(3, igelDB.size());
		assertEquals(k, igelDB.get(2));
		assertEquals(gf, igelDB.get(1));

		// removing one element from db
		igelDB.removeLast();
		assertEquals(2, igelDB.size());
	}

	@Ignore
	void testGetLargerReturnType() {

		Tier t = new Tier();
		@SuppressWarnings("unused")
		Goldfisch gf = new Goldfisch(10, 15);
		@SuppressWarnings("unused")
		Amsel a = new Amsel(10, 15);
		Katze k = new Katze(10, 15);
		Igel i1 = new Igel(10, 15);
		@SuppressWarnings("unused")
		Igel i2 = new Igel(11, 112);

		// testing if by putting 2 Igels we get first igel
		assertEquals(i1, t.getLarger(i1, i1));

		// testing if by putting igel and cat we get igel
		assertEquals(i1, t.getLarger(i1, k));

		// testing if by putting cat and igel we get cat
		assertEquals(k, t.getLarger(k, i1));

		// testing if by putting string and Int we get String
		// assertEquals("lol", t.getLarger("lol", 4.));

	}

	@Test
	void testMaxWeightnonit() {

		Igel i1 = new Igel(11, 15);
		Igel i2 = new Igel(12, 18);
		Igel i3 = new Igel(13, 19);
		Igel i4 = new Igel(14, 20);

		Tier[] igelFeld = new Tier[4];

		DBFeldFixgen<Tier> dB = new DBFeldFixgen<Tier>(igelFeld);

		dB.appendLast(i1);
		dB.appendLast(i2);
		dB.appendLast(i3);
		dB.appendLast(i4);
		Iterator<Tier> I = dB.iterator();
		
		
		
		
		
		// System.out.println(dB.maxWeightnonit());
		assertEquals(i4.weight(), dB.maxWeightnonit().weight());
		assertEquals(dB.get(1), i1);
		assertEquals(dB.get(2), i2);
		assertEquals(dB.get(3), i3);
		assertEquals(i4, dB.get(4));
		
		Tier t1 = I.next();
		Tier t2 = I.next();
		Tier t3 = I.next();
		Tier t4 = I.next();
		System.out.println(" size is : " + t1.size() + " weight is : " + t1.weight());
		System.out.println(" size is : " + t2.size() + " weight is : " + t2.weight());
		System.out.println(" size is : " + t3.size() + " weight is : " + t3.weight());
		System.out.println(" size is : " + t4.size() + " weight is : " + t4.weight());
		assertEquals(i1, t1);
		assertEquals(i2, t2);
		assertEquals(i3, t3);
		assertEquals(i4, t4);

	
	}
	@Test
	void cutomIteratorTest() {
		
		Igel i1 = new Igel(11, 15);
		Igel i2 = new Igel(12, 18);
		Igel i3 = new Igel(13, 19);
		Igel i4 = new Igel(14, 20);
		Igel i5 = new Igel(15, 21);
		Igel i6 = new Igel(16, 22);

		Tier[] igelFeld = new Tier[6];

		DBFeldFixgen<Tier> dB = new DBFeldFixgen<Tier>(igelFeld);

		dB.appendLast(i1);
		dB.appendLast(i2);
		dB.appendLast(i3);
		dB.appendLast(i4);
		dB.appendLast(i5);
		dB.appendLast(i6);
		
		Iterator<Tier> I2 = dB.iterator(3, 5);
		Tier t3 = I2.next();
		Tier t4 = I2.next();
		Tier t5 = I2.next();
		
		assertEquals(i3, t3);
		assertEquals(i4, t4);
		assertEquals(i5, t5);
		
		
	}

}
