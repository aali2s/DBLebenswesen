package app.Lebenswesen;

public class Tier extends Lebenswesen implements Comparable<Tier> {
	private int size;
	private int weight;

	public Tier(int size, int weight) {
		this.size = size;
		this.weight = weight;
	}

	public Tier() {
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public int weight() {
		return this.weight;
	}

	public <T extends Tier> T getLarger(T t1, T t2) {
		return t1;
	}

	public String toString() {
		return "this Tier has size: " + this.size() + " and weight: " + this.weight();
	}

	@Override
	public int compareTo(Tier o) {
		// TODO Auto-generated method stub
		if (this.size < o.size) {
			return 1;
		} else if (this.size == o.size) {
			return 0;
		} else {
			return -1;
		}

	}

}
