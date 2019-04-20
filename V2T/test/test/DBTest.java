package test;
import app.DB.*;
import app.Lebenswesen.*;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DBTest {
	
	
	


	@Test
	void katzeInIgelTest() {
	
		//Aufgabe 8.2 
		
		@SuppressWarnings("unused")
		Goldfisch gf = new Goldfisch(10,15);
		@SuppressWarnings("unused")
		Amsel a = new Amsel(10,15);
		@SuppressWarnings("unused")
		Katze k = new Katze(10, 15);
		Igel i1 = new Igel(10,15);
		
		Igel[] igelFeld = new Igel[ 10 ];
		
		DBFeldFixgen<Igel> igelDB = new DBFeldFixgen<Igel>(igelFeld);
		
		
		
		
		igelDB.appendLast(i1);
		
		 //igelDB.appendLast(k);
		// beim Katze einfügen haben wir Fehler meldung die schlägt igelDB typ typ auf KAtze DB umzuWandeln 
		//oder beim Implementation statt T Katze zu deklarieren
		
	}

	@Test
	void testAsTierDB() {
		//Aufgabe 8.3 and 8.4
		Goldfisch gf = new Goldfisch(10,15);
		@SuppressWarnings("unused")
		Amsel a = new Amsel(10,15);
		Katze k = new Katze(10, 15);
		Igel i1 = new Igel(10,15);
		
		
		Tier[] igelFeld = new Tier[ 10 ];
		
		DBFeldFixgen<Tier> igelDB = new DBFeldFixgen<Tier>(igelFeld);
		igelDB.appendLast(gf);
		igelDB.appendLast(k);
		igelDB.appendLast(i1);
		assertEquals(3, igelDB.size());
		assertEquals(k,igelDB.get(2));
		assertEquals(gf,igelDB.get(1));
		
		//removing one element from db 
		igelDB.removeLast();
		assertEquals(2, igelDB.size());
	}
	
	@SuppressWarnings("static-access")
	void testGetLargerReturnType() {
		
		Tier t = new Tier();
		@SuppressWarnings("unused")
		Goldfisch gf = new Goldfisch(10,15);
		@SuppressWarnings("unused")
		Amsel a = new Amsel(10,15);
		Katze k = new Katze(10, 15);
		Igel i1 = new Igel(10,15);
		@SuppressWarnings("unused")
		Igel i2 = new Igel(11,112);
		
		//testing if by putting 2 Igels we get first igel
		assertEquals(i1, t.getLarger(i1, i1));
		
		//testing if by putting igel and cat we get igel
		assertEquals(i1, t.getLarger(i1, k));
		
		//testing if by putting cat and igel we get cat
		assertEquals(k, t.getLarger(k, i1));
		
		
		//testing if by putting string and Int we get String
		assertEquals("lol", t.getLarger("lol", 4.));
		
		
	}
	
	 
	
	

	
}
