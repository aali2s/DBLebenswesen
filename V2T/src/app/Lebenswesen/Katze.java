package app.Lebenswesen;

public class Katze extends Tier {

	public Katze(int size, int weight) {
		super(size, weight);

	}

	@Override
	public int compareTo(Tier o) {
		// TODO Auto-generated method stub

		if (this.size() < o.size()) {

			return 1;
		} else if (this.size() == o.size()) {
			return 0;
		} else {
			return -1;
		}

	}

}
