package package2;

public class BadRaggio extends BadGeomAttribute{
	
	
	private static final long serialVersioneIUD = 156L;

	public BadRaggio(double value) {
		super(new String[] {"raggio"}, new double[] {value});
	}
	
	@Override
	public String getMessage() {
		return "Bad raggio " + value[0];
	}

}
