
public class ClasseA {

	private String campoA;
	
	public static String campoStatico;
	
	public static void metodoStatico() {
		System.out.println("Statico");
	}

	String getCampoA() {
		return campoA;
	}
	public void setCampoA(String campoA) {
		this.campoA = campoA;
	}
	
}
