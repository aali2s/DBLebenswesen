package app.DB;

public class DBUtil {

	public static <T> T min(DBgen<T> db) {
		T t = db.get(1);

		for (T e : db) {
			if (db.compareTo(e) == 0 || db.compareTo(e) == -1) {
				continue;
			} else if (db.compareTo(e) == -1) {
				t = e;
			}
		}

		return t;
	}

}
