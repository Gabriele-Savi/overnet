
public class Cerchio {

	double value;
	
	public Cerchio(double value) {
		this.value = value;
	}
	
	public double getPerim() {
		return ((2*Math.PI) * value);
	}
	
	public double getArea() {
		return (Math.PI * (value * value));
	}
	
	public boolean isSameRad(double value) {
		return this.value == value;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Cerchio)
		return false;
		
		Cerchio cer = (Cerchio) obj;
		System.out.println(this.value +","+cer.value);
		return this.isSameRad(cer.value);
	}

	public String toString() {
		return "Area " + this.getArea() + "\nPermimetro: " + this.getPerim() + "\nRaggio:" + this.value;
	}
}
