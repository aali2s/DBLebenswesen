package app.DB;

import app.Lebenswesen.Tier;

public class DBUtil {

	public static <T> Tier min(DBFeldFixgen<Tier> db) {

		// takes first element of db
		Tier t = db.get(1);

		for (Tier e : db) {
			/*
			 * if current element is equal or greater than element stored in t continues to
			 * next round
			 */
			if (t.compareTo(e) == 0 || t.compareTo(e) == 1) {
				continue;
			} else if (t.compareTo(e) == -1) {
				/* if current element if less than element stored in t. store e in t */
				t = e;
			}
		}

		return t;
	}

}
