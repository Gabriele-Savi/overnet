
public class Clock {

	// dare la possibilita di memorizzare lo stato del tempo in termini di HH:MM:s
	//fornire i seguenti metodi
	// void setTime(int, int, int)
	// String getTime()
	// long getTimeInMillis() <--- ritorna i ms a partire dalle 00:00.0
	// void tick() <--- incrementa i secondi di 1
	// boolean isAM()
	// boolean equals(obj)
	// string toString() <-- stampa l ora nel formato HH:MM.s    ES: 01:01:1      12:10:40     23:59:59
	
	
	//costruttori
	// default <-- Clock()
	// Clock(int, int, int)
	
	int h, m, s;
	
	private Clock() {
		setH(0);
		setM(0);
		setS(0);
	}
	public Clock(int h, int m, int s) {
		
		setTime(h, m, s);
		
	}

	public void setTime(int h, int m, int s) {
		
		setH(h);
		setM(m);
		setS(s);
	}
	public boolean isAm(int h) {
		if(h < 12) 
			return true;
		return false;
	}
	public String getTime() {
		return this.toString();
	}
	public String toString() {
		if((getH() <= 9) && (getM() <= 9))
			return "0" + getH() + ":" + "0" + getM() + "." + getS();
		else if((getH() > 9) && (getM() > 9))
			return  getH() + ":" + getM() + "." + getS();
		else if((getH() <= 9) && (getM() > 9))
			return  "0" + getH() + ":" + getM() + "." + getS();
		else 
			return getH() + ":" + getM() + "." + getS();
	}
	public void tick() {
		for(int a = 0; a <= 2; a++) {
			for(int i = 0; i <= 60; i++) {
				setS(i);
				System.out.println(this.toString());
			}
		}
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Clock) {
			Clock c = (Clock) obj;
				if((this.getH() == c.getH()) && (this.getM() == c.getM()) && (this.getS() == c.getS())) {
				return true;
			}
		}
		return false;
	}
	
	public int getH() {
		return h;
	}
	public void setH(int h) {
		if(h >= 24) {
			this.setTime(0, 0, 0);
		}
		else
			this.h = h;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		if(m >= 60) {
			int n = this.getH();
			n++;
			this.setH(n);
			this.setS(0);
		}
		else
			this.m = m;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		if(s >= 60) {
			int n = this.getM();
			n++;
			this.setM(n);
			this.setS(0);
		}
		else
			this.s = s;
	}
	
	
	public static void main(String[] args) {
		Clock c = new Clock(23, 59, 0);
		Clock c1 = new Clock(23, 59, 0);
		System.out.println("E' mattina?" + c.isAm(c.getH()) + "\nEquals? " + c.equals(c1));
		c.tick();
	}
	
}
