package app.Lebenswesen;
public class Goldfisch extends Tier{

	public Goldfisch(int size, int weight) {
		super(size, weight);
		if ( size < 5 || size > 10|| weight < 5 || weight > 15 )
			throw new IllegalArgumentException( 
					"Goldfisch size oder weight invalid" );
	}

}
