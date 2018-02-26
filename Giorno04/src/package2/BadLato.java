package package2;

public class BadLato extends BadGeomAttribute{

	public BadLato(Object val) {
		super(val);
		// TODO Auto-generated constructor stub
	}
	
	public BadLato(double val) {
		this(null);
		this.val[0] = val;
	}
	
	@Override
	public String getMessage() {
		return "Il lato inserito ha dei problemi" + val;
	}

}
