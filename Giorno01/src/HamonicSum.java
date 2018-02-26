
public class HamonicSum {

	public static void main(String[] args) {
		
		double sumL2R = 0.0;
		double sumR2L = 0.0;
		int maxDenominator = 50000;
		int minDenominator = 1;
		
		for(int denominator = minDenominator; denominator <= maxDenominator; ++denominator) {
			sumL2R += 1 / (double)denominator; 
		}
		
		for(int denominator = maxDenominator; denominator >= minDenominator; --denominator)
			sumR2L = 1 / (double)denominator;
			
		
		System.out.println("The sum from left-to-right is: " + sumL2R);
		System.out.println("The sum from left-to-right is: " + sumR2L);

	}

}
