import javax.management.BadAttributeValueExpException;

public class Clock2 {

	
	int h, m, s;
	
	public Clock2() {
		h = m = s = 0;
	}
	
	public Clock2(int h, int m, int s) throws BadAttributeValueExpException{
		setTime(h, m, s);
	}
	
	public void setTime(int h, int m, int s) throws BadAttributeValueExpException{
		if ((h < 0) || (h > 23) || (m < 0) || (m > 23) || (s < 0) || (s > 60))
			throw new BadAttributeValueExpException("Invalid argue");
		
		this.h = h;
		this.m = m;
		this.s = s;
	}
	
	private String getZeroValue(int val) {
		return (val < 10 ? "0" : "") + val;
	}
	
	public void tick() {
		s++;
		if(s > 59) {
			s = 0;
			m++;
		}
		if(m > 59) {
			m = 0;
			h++;
		}
		if(h > 23)
			h = 0;
	}
	
	public boolean isAM() {
		return h < 12;
	}
	
	public String getTime() {
		return getZeroValue(h) + ":" + getZeroValue(m) + ":" + s;
	}
	
	public long getTimeInMillis() {
		return  (s + (m * 60) + (h * 3600)) * 1000;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Clock)) {
			return false;
		}
		Clock c = (Clock) obj;
		
		return h == c.getH() && 
			   m == c.getM() &&
			   s == c.getS();
	}
	
	@Override
	public String toString() {
		return getTime();
	}

	public static void main(String[] args) {
		
		Clock2 c1 = null, c2 = null;
		
		try {
			c1 = new Clock2();
			c2 = new Clock2(10, 20, 70);
		} catch (BadAttributeValueExpException e) {
			System.out.println("Bad clock value!\n" + e.toString());
		}
		
		if(c1 != null && c2 != null) {
		
			for(int x = 0; x < 1000; x++) {
				System.out.println(c2.toString());
				c2.tick();
				}
			}
		else
			System.out.println("Impossible good exe");
		}
		

}
