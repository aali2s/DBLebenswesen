package app.Lebenswesen;
public abstract class Lebenswesen {

	@SuppressWarnings("unused")
	private static int maxId;
	@SuppressWarnings("unused")
	private int id;
	
	abstract public int size();
	abstract public int weight();
	public int compareTo(Lebenswesen o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
		
	
}
