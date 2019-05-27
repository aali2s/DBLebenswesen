package app.Lebenswesen;

import java.util.Comparator;

public class ComparatorGewicht implements Comparator<Tier> {

	@Override
	public int compare(Tier o1, Tier o2) {
		// TODO Auto-generated method stub
		if (o1.weight() < o2.weight()) {
			return -1;
		} else if (o1.weight() > o2.weight()) {
			return 1;
		}
		return 0;
	}

}
