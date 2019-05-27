package app.Lebenswesen;
public class Goldfisch extends Tier{

	public Goldfisch(int size, int weight) {
		super(size, weight);
		if ( size < 5 || size > 10|| weight < 5 || weight > 15 )
			throw new IllegalArgumentException( 
					"Goldfisch size oder weight invalid" );
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
