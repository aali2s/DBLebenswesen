package app;
import java.util.Random;

import app.DB.DBFeldFixgen;
import app.DB.DBUtil;
import app.Lebenswesen.Igel;
import app.Lebenswesen.Tier;



public class main {
	
	public static void main1(String[] args) {
		Igel i1 = new Igel(11, 15);
		Igel i2 = new Igel(12, 18);
		Igel i3 = new Igel(13, 19);
		Igel i4 = new Igel(14, 20);

		Tier[] igelFeld = new Tier[4];
		
		
		igelFeld[1] = i1;
		igelFeld[0] = i2;
		igelFeld[2] = i3;
		igelFeld[3] = i4;

		DBFeldFixgen<Tier> dB = new DBFeldFixgen<Tier>(igelFeld);

		


		
		Tier t = DBUtil.min(dB);
		System.out.println(t.size());
		

	}

	
	@SuppressWarnings("unused")
	private static int randomInRange(int i, int j) {
		Random rand = new Random();
		int r = rand.nextInt((j - i) + 1) + i;
		return r;
	}

}
