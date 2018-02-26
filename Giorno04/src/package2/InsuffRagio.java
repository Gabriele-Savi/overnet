package package2;

import javax.management.BadAttributeValueExpException;

public class InsuffRagio extends BadRaggio{

	private static final long serialVersioneIUD = 156L;

	
	public InsuffRagio(double value) {
		super(value);
	}
	
	@Override
	public String getMessage() {
		return "Bad area (insuff) = " + value[0];
	}

}
