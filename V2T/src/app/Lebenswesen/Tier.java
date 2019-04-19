package app.Lebenswesen;

public class Tier extends Lebenswesen {
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

	public static <T> T getLarger(T t1, T t2) {
		return t1;
	}

	public String toString() {
		return "this Tier has size: " + this.size() + " and weight: " + this.weight();
	}

}
