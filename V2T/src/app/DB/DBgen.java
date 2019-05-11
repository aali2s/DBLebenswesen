package app.DB;

import app.Interface.DBIFgen;

public abstract class DBgen<T> implements DBIFgen<T>, Iterable<T> {

	protected int size;
	private int anfangIt =1;
	private int endIt ;
	public void setAnfangIt(int i) {
		this.anfangIt = i;
	}
	public void setEndIt(int i) {
		this.endIt = i;
	}
	public int getAnfangIt() {
		return this.anfangIt;
	}
	public int getEndIt() {
		return this.endIt;
	}
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

}
