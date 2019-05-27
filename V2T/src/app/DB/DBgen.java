package app.DB;

import java.util.Comparator;

import app.Interface.DBIFgen;
import app.Lebenswesen.Tier;

public abstract class DBgen<T> implements DBIFgen<T>, Comparable<T> {

	protected int size;

//	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (this.size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	public String toString() {
		return "is DB empty?  " + isEmpty() + " size is " + size;
	}

	public abstract void sort(Comparator<Tier> c);



	

}
