package app.DB;

import java.util.Iterator;

import app.Lebenswesen.Tier;

public class DbIterator<T extends Tier> extends DBFeldFixgen<T> implements Iterator<T> {

	public DbIterator(T[] igelFeld) {
		super(igelFeld);
		// TODO Auto-generated constructor stub
	}

	private int current = 1;

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub

		if (current < this.size()) {
			
			return true;
		}

		return false;
	}

	@Override
	public T next() {
		try {
			
			T t;
			t = this.get(current);
			this.current++;
			return t;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new IndexOutOfBoundsException();
		}

	}

}
