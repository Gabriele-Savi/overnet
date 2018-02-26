
public class Principale {

	public static void main(String[] args) {
		Cerchio c1 = new Cerchio(3);
		Cerchio c2 = new Cerchio(3);
		System.out.println(c1.toString());
		
		System.out.println(c1.equals(c2));
	
		System.out.println("Somma perimetro " + MathCerchio.getSumPer(c1, c2) + "\nSomma area " + MathCerchio.getSumArea(c1, c2));
	}

}
