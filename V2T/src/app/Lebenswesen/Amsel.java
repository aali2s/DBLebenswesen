package app.Lebenswesen;
public class Amsel extends Tier {

	public Amsel(int size, int weight) {
		super(size, weight);
		if(size <10 ||size >30 || weight <10||weight >50) {
			throw new IllegalArgumentException("size or weight invalid");
			}
	}
	

}
