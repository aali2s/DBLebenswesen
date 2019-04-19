package app;
import java.util.Random;

import app.DB.DBFeldFixgen;
import app.DB.DBgen;
import app.Lebenswesen.Igel;
import app.Lebenswesen.Katze;
import app.Lebenswesen.Tier;



public class main {
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// TODO Auto-generated method stub
		Katze k = new Katze(15, 20);
//		Igel j = new Igel(125, 20);
//		Igel k = new Igel(153, 20);
		
//
//		a.appendLast(i);
//		a.appendLast(j);
//		a.appendLast(k);
//		a.get(1);
//		a.get(2);
//		a.get(3);

//		System.out.println(a.toString());
		
		
		
//		int dbSize = 1000000;
//		DBFeldFix a = new DBFeldFix(dbSize+1);
//		for(int f = 0; f<=dbSize;f++) {
//			Igel i = new Igel(randomInRange(10,45), randomInRange(20,2000));
//			a.appendLast(i);
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.println("time in mili seconds : " + (endTime - startTime) +"ms");
//		
		
		//DBgen<Katze> katzeDB = new DBFeldFixgen<Katze>(2);
		//katzeDB.appendLast(k);
		//katzeDB.get(1);
		Igel i = new Igel(12,16);
		
		
		
		//testing if Parent class type for DB Object works for both katze and Igel 
		// we have two different type of instance in the same DB
//		DBgen<Tier> tierDB = new DBFeldFixgen<Tier>(2);
//		tierDB.appendLast(i);
//		tierDB.appendLast(k);
//		
//		tierDB.get(1);
//		tierDB.get(2);
		
		//Aufgabe11 Testing  
		// zwei Igel
//		DBgen<Tier> tierDB = new DBFeldFixgen<Tier>(3);
//		Igel i1 = new Igel(12,4);
//		Igel i2 = new Igel(20,15);
//		
//		
//		tierDB.appendLast(i1);
//		tierDB.appendLast(i2);
//		
//		tierDB.appendLast(Tier.getLarger(i1, i2));
//		System.out.println(tierDB.get(1) instanceof Igel);
		
		
		
		
	
		// einen Igel und eine Katze
		// eine KAtze und einen Igel
		// einen String und ein Integer
		
		

	
		
		
		//  katzeDB.appendLast(i);  this does not accept Igel object beacause katzeDB is of Katze Type
		
		 
		System.out.println();

	}

	
	private static int randomInRange(int i, int j) {
		Random rand = new Random();
		int r = rand.nextInt((j - i) + 1) + i;
		return r;
	}

}
