package app.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import app.DB.DBFeldFixgen;
import app.DB.DBUtil;
import app.Lebenswesen.Igel;
import app.Lebenswesen.Tier;

class DBUtilTest {

	@Test
	final void testMin() {
		
		
		
//		Igel i1 = new Igel(11, 15);
//		Igel i2 = new Igel(12, 18);
//		Igel i3 = new Igel(13, 19);
//		Igel i4 = new Igel(14, 20);
//
//		Tier[] igelFeld = new Tier[4];
//
//		DBFeldFixgen<Tier> dB = new DBFeldFixgen<Tier>(igelFeld);
//
//		dB.appendLast(i1);
//		dB.appendLast(i2);
//		dB.appendLast(i3);
//		dB.appendLast(i4);
//		
//		Tier t = DBUtil.min(dB);
//		assertEquals(i1, t);
		
		
		
		Tier[] igelFeld = new Tier[500];

		for (int i = 0; i <= 499; i++) {
			Igel i1 = new Igel(randomInRange(6, 10), randomInRange(10, 20));
			if (i1.weight() == 10) {
				System.out.println("True");
			}
			igelFeld[i] = i1;
		}
		DBFeldFixgen<Tier> dB = new DBFeldFixgen<Tier>(igelFeld);
		
		Tier t = DBUtil.min(dB);
		assertEquals(10, t.weight());

	}

	private static int randomInRange(int i, int j) {
		Random rand = new Random();
		int r = rand.nextInt((j - i) + 1) + i;
		return r;
	}

}
