import javax.management.BadAttributeValueExpException;

import package2.BadGeomAttribute;
import package2.BadRaggio;

/* creare classe astratta BadGeomAttribute con i seguenti vincoli:
 * estende la classe BAEE
*	estensione del messaggio di default (getMessage())
*	serialVersioneUID = 156L
*	implementare costruttore che accetti in ingresso il nome del parametro errato (stringa) e il valore (double)
*	creare classe BadRaggio che estende BadGeomAttribute
*	creare classe InsuffRaggio che estende BadRaggio da langciare nel caso in cui dato il raggio,
*	l'area del cerchio sia inferiore a 0.1
*	creare classe HeavyRaggio che estende BadRaggio da langiare nel caso in cui, dato il raggio, l area del cerchio sia superiore a 100
*	creare classe BadLato che estende BadGeomAttribute
*	creare classi InsuffLati e HeavyLati che seguono la logica del cerchio applicata alla classe Rect
*
*	nel main:
*	istanziare 10 cerchi e 10 rettangoli
*	con parametri double ricavati random -1000 1000 e stampare a video un messaggio consistente con i risultati
*
*NB: in questo caso nessun costruttore try-cath è richiesto all interno delle classi, i controlli vanno fatti in fase di istanza (main)
*/

public class OopEx {

	static interface FormaGeom {						// forma geometrica generica
		
		public double getPerim();						// calcola perimetro
		public double getArea();						// calcola area
	}
	
	static abstract class Point {						// generico punto
		
		double x, y;									// cordinate punto
				
		public Point(double x, double y) {
			
			try {
			setX(x);
			setY(y);
			}catch(BadAttributeValueExpException e) {
				System.out.println("Control values!\n" + e.toString());
			}
		}
		
		public double getX() {
			return x;
		}
		public void setX(double x) throws BadAttributeValueExpException{
			if(x < 0) 
				throw new BadAttributeValueExpException("Invalid argue");
			this.x = x;
		}
		public double getY() {
			return y;
		}
		public void setY(double y) throws BadAttributeValueExpException{
			if(y < 0) 
				throw new BadAttributeValueExpException("Invalid argue");
			this.y = y;
		}

		public abstract double getOriginDist();			// calcola distanza dall'origine
	}
	static class Point2D extends Point{

		public Point2D(double x, double y) {

			super(x, y);
		}
		@Override
		public double getOriginDist() {

			return Math.pow(x - 0, 2) +
				   Math.pow(y - 0, 2);
		}		
	}
	static class Point3D extends Point{
		
		double z;
		
		public Point3D(double x, double y, double z) {
			
			super(x, y);
			try {
				setZ(z);
			}catch(BadAttributeValueExpException e) {
				System.out.println("Value!\n" + e.toString());
			}
		}

		public double getZ() {
			return z;
		}
		public void setZ(double z) throws BadAttributeValueExpException{
			if(z < 0)
				throw new BadAttributeValueExpException("Invalid argue");
			this.z = z;
		}

		@Override
		public double getOriginDist() {

			return Math.pow(x - 0, 2) +
				   Math.pow(y - 0, 2) +
				   Math.pow(z - 0, 2);
		}		
	}		
	
	static class Circle implements FormaGeom {			// forma cerchio con centro in c 
		
		private Point2D c;								// centro
		private double r;								// raggio
		
		private Circle() {}
		public Circle(Point2D c, double r) throws BadRaggio{
			
			setC(c);
			setR(r);
		}
		public Circle(double x, double y, double r) throws BadRaggio{
			
			this(new Point2D(x, y), r);
		}		

		public Point getC() {
			return c;
		}
		public void setC(Point2D c) {
			this.c = c;
		}
		public double getR() {
			return r;
		}
		public void setR(double r) throws BadRaggio {
			if (r < 0) {
				BadRaggio br = new BadRaggio(r);
				br.getMessage();
			}
			this.r = r;
		}
		
		@Override
		public double getPerim() {

			return 2 * r * Math.PI;
		}
		@Override
		public double getArea() {

			return Math.pow(r, 2) * Math.PI;
		}
		
		@Override
		public String toString() {

			return  "Circle\nx=" + c.getX() + " : y=" + c.getY() + " : r=" + getR() +
					"\norigin dist=" + c.getOriginDist();
		}
		
		// generare costruttore che accetti in ingresso due cordinate double
		// e un altro costruttore che accetti in ingresso un punto bidimensionale
		
		// HITN: distanza tra 2 punti bidimensionali:
		// 			dist = (x1-x2)^2+(y1-y2)^2
		
		// implementare metodo toString che esprima posizione, 
		// raggio e distanza dall'origine
	}
	static class Sphere extends Circle implements FormaGeom {	// sfera
		
		private Point3D c;										// centro			
		private double r;										// raggio
		
		private Sphere() {}
		public Sphere(Point3D c, double r) throws BadRaggio {
			
			setC(c);
			setR(r);
		}
		public Sphere(double x, double y, double z, double r) throws BadRaggio {
			
			this(new Point3D(x, y, z), r);
		}
		
		public Point3D getC() {
			return c;
		}
		public void setC(Point3D c) {
			this.c = c;
		}
		public double getR() {
			return r;
		}
		public void setR(double r) throws BadRaggio{
			if(r < 0) {
				BadRaggio br = new BadRaggio(r);
				br.getMessage();
				throw new BadRaggio(r);
			}
				
			this.r = r;
		}
		
		@Override
		public double getPerim() {

			return 2 * r * Math.PI;
		}
		@Override
		public double getArea() {

			return 4 * Math.PI * Math.pow(r, 2);
		}
		@Override
		public String toString() {

			return "Sphere\nx=" + c.getX() + " : y=" + c.getY() + " : z=" + c.getZ() + 
					" : r=" + getR() +
					"\norigin dist=" + c.getOriginDist();
		}
		
		// generare costruttore che accetti in ingresso tre cordinate double
		// e un altro costruttore che accetti in ingresso un punto tridimensionale
		
		// HITN: distanza tra 2 punti tridimensionali:
		// 			dist = (x1-x2)^2+(y1-y2)^2+(z1-z2)^2
		
		// implementare metodo toString che esprima posizione, 
		// raggio e distanza dall'origine
	}
	
	public static void main(String[] args) {
		
		Point2D p1 = null;
		Point3D p2 = null;
		Circle c1 = null, c2 = null;
		Sphere s1 = null, s2 = null;
		
		try {
			p1 = new Point2D(2d, 3d);
			p2 = new Point3D(2d, 3d, 4d);
			
			c1 = new Circle(2d, 3d, -10d);		// x, y, r
			c2 = new Circle(p1, 10d);			// point2D, r
			
			s1 = new Sphere(2d, 3d, 4d, 20d);	// x, y, z, r
			s2 = new Sphere(p2, 30d);			// point3D, r
		} catch (BadGeomAttribute e) {
			System.out.println("Bad clock value!\n" + e.toString());
		}
		
		if((p1 != null ) && (p2 != null) && (c1 != null) && (c2 != null) && (s1 != null) && (s2 != null)) {
			System.out.println(c1.toString());
			System.out.println(c2.toString());
			System.out.println(s1.toString());
			System.out.println(s2.toString());
		}
		else
			System.out.println("Program can't eseguite");
	}
}