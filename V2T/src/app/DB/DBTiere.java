package app.DB;

import app.Lebenswesen.*;

public class DBTiere<T extends Tier> extends DBFeldFixgen<T> {

	public DBTiere(T[] igelFeld) {
		super(igelFeld);
		// TODO Auto-generated constructor stub
	}

	private int totalWeight = 0;

	public int totalWeight() {

		for (T t : this.dBFeldFixgenArray) {
			Tier lb = (Tier) t;
			if (t != null)
				totalWeight += lb.weight();

		}

		return totalWeight;
	}
	
	



}
