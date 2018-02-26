
public class Programma {

	public static void main(String[] args) {
		ClasseA obj1 = new ClasseA();
		ClasseA obj2 = new ClasseA();

		obj1.setCampoA("Valore in obj1");
		obj2.setCampoA("Valore in obj2");
		
		System.out.println(obj1.getCampoA());
		System.out.println(obj2.getCampoA());
		
		obj1.campoStatico = "statico in obj1";
		obj2.campoStatico = "statico in obj2";
		
		System.out.println(obj1.campoStatico);
		System.out.println(obj2.campoStatico);
	}

}
