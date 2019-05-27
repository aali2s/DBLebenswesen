package app.DB;

import java.util.Comparator;
import java.util.Iterator;

import app.Lebenswesen.Tier;

public class DbIterator<T extends Tier> extends DBFeldFixgen<T> implements Iterator<T> {

	private int startIndex;
	private int lastIndex;

	public DbIterator(T[] igelFeld, int startIndex, int lastIndex) {
		this(igelFeld);
		this.startIndex = startIndex;
		this.lastIndex = lastIndex;

	}

	public DbIterator(T[] igelFeld, int startIndex) {
		this(igelFeld);
		this.startIndex = startIndex;
		this.lastIndex = this.size();

	}

	public DbIterator(T[] igelFeld) {
		super(igelFeld);
		this.startIndex = 1;
		this.lastIndex = this.size();

	}

	// private int current =1;

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub

		if (this.startIndex < this.lastIndex) {

			return true;
		}

		return false;
	}

	@Override
	public T next() {

		if(lastIndex>startIndex) {
			T t;
		t = this.get(startIndex);
		this.startIndex++;
		return t;
		}else {
			return(reverse());
		}

	}
	public T reverse() {

		T t;
		t = this.get(this.startIndex);
		this.startIndex--;
		return t;

	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sort(Comparator<T> c) {
		// TODO Auto-generated method stub
		
	}

}
