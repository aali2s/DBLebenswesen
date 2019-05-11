package app.DB;

import java.util.Iterator;

import app.Lebenswesen.Tier;

public class DbIterator<T extends Tier> extends DBFeldFixgen<T> implements Iterator<T> {

	public DbIterator(T[] igelFeld) {
		super(igelFeld);
		
	}

	//private int current =1;
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub

		if (this.getAnfangIt() < this.getEndIt()) {
			
			return true;
		}

		return false;
	}

	@Override
	public T next() {
		try {
			
			T t;
			int tmp;
			tmp = this.getAnfangIt();
			t = this.get(tmp);
			this.setAnfangIt(tmp+1);
			return t;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new IndexOutOfBoundsException();
		}

	}

}
