package package2;

public class HeavyRaggio extends BadRaggio{

	private static final long serialVersioneIUD = 156L;
	
	public HeavyRaggio(double value) {
		super(value);
	}
	
	@Override
	public String getMessage() {
		return "Bad area (heavyraggio) = " + value[0];
	}
	

}
