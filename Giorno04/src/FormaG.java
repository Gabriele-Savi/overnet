
public class FormaG {
	
	// FormaGeometrica
	abstract static class FormaGeometrica {
		public abstract double getPerim();
		public abstract double getArea();
	}
	
	// Cerchio
	static class Cerchio extends FormaGeometrica{
		
		//rappresentare autonomamente la classe cerchio consistente con la realta analizzata
		
		//implementare inoltre una versione consistente dei metodi equals e tostring
		
		// implementare get e set tutte le variabili
		
		
		double r;
		
		public Cerchio(double r) {
			this.setR(r);
		}
	
		public double getR(){
			return r;
		}
		
		public void setR(double r) {
			if(r < 0) {
				r = 0;
				return;
			}
			this.r = r;
		}

		@Override
		public double getPerim() {
			return ((2 * this.getR()) * Math.PI);
		}


		@Override
		public double getArea() {
			return ((this.getR() * this.getR()) * Math.PI);
		}
		
		@Override
		public String toString() {
			return "per " + this.getPerim() + "\n area " + this.getArea();  
		}
	
		public boolean equals(Object obj) {
			if(obj instanceof Cerchio)
				return true;
			return false;
		}
	}
	
	// Rettangolo
	static class Rect extends FormaGeometrica{

		//rappresentare autonomamente la classe cerchio consistente con la realta analzzata
		
		//implementare inoltre una versione consistente dei metodi equals e tostring
		// implementare get e set tutte le variabili
		
		private double h;
		private double l;
		
		public Rect(double l, double h) {
			this.setH(h);
			this.setL(l);
		}
		
		public double getH() {
			return h;
		}
		
		public void setH(double h) {
			if(h < 0) {
				this.h = 0;
				return;
			}
			this.h = h;
		}
		
		public double getL() {
			return l;
		}
		
		public void setL(double l) {
			if(l < 0) {
				this.l = 0;
				return;
			}
			this.l = l;
		}

		@Override
		public double getPerim() {
			return ((this.getH() * 2) * (this.getL() * 2));
		}

		@Override
		public double getArea() {
			return (this.getH() * this.getL());
		}
		
		@Override
		public String toString() {
			return "per " + this.getPerim() + "\n area " + this.getArea();  
		}
	
		public boolean equals(Object obj) {
			if(obj instanceof Rect)
				return true;
			return false;
		}
	}
	
	
	//Function for FormaG
	static double sumPerim(FormaGeometrica f1, FormaGeometrica f2) {
		return (f1.getPerim() + f2.getPerim());
	}
	static double sumArea(FormaGeometrica f1, FormaGeometrica f2) {
		return (f1.getArea() + f2.getArea());
	}
	
	
	public static void main(String[] args) {
		
		Cerchio c1 = new Cerchio(3d),
				c2 = new Cerchio(4d);
		
		Rect r1 = new Rect(3d, 4d),
			 r2 = new Rect(7d, 8d);
		
		FormaGeometrica fc1 = new Cerchio(3d),
						fc2 = new Cerchio(5d),
						fr1 = new Rect(3d, 4d),
						fr2 = new Rect(10d, 20d);
		
		String sm = "Sum: ";
		System.out.println(sm + FormaG.sumPerim(c1, r1));
		System.out.println(sm + FormaG.sumPerim(c1, r2));
		System.out.println(sm + FormaG.sumPerim(fr1, fc2));
		System.out.println(sm + FormaG.sumPerim(fc2, fr2));
		System.out.println(r1.equals(c2));
	}
	
}
