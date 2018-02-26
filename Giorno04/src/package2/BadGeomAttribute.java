package package2;

import javax.management.BadAttributeValueExpException;

public abstract class BadGeomAttribute extends BadAttributeValueExpException{

	private static final long serialVersionUID = 156L;
	protected String[] name;
	protected double[] value;
	
	public BadGeomAttribute(String[] name, double[] value) {
		super(null);
		
		this.name = name;
		this.value = value;
	}
	
	
	@Override
	public abstract String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	

	
	
	
}
