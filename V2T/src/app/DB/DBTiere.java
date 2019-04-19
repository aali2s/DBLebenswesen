package app.DB;

import app.Lebenswesen.Tier;

public class DBTiere<T> extends DBFeldFixgen<T> {

	public DBTiere(T[] igelFeld) {
		super(igelFeld);
		// TODO Auto-generated constructor stub
	}



	private int totalWeight = 0;



	public int totalWeight() {

		T[] listOfTier = getdBFeldFixgenArray();
		for (T t : listOfTier) {
			Tier lb = (Tier) t;
			totalWeight += lb.size();

		}
		return totalWeight;
	}

}
