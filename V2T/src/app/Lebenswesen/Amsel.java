package app.Lebenswesen;
public class Amsel extends Tier {

	public Amsel(int size, int weight) {
		super(size, weight);
		if(size <10 ||size >30 || weight <10||weight >50) {
			throw new IllegalArgumentException("size or weight invalid");
			}
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
