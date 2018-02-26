
public class SumAndAverage2 {

	public static void main(String[] args) {
		int lowerbound = 1;
		int upperbound = 100;
		double average;
		
		int number = lowerbound;
		double sum = 0;
		while(number <= upperbound) {
			sum += number;
			++number;
		}
		average = sum / 100;
		System.out.println("The sum is " + sum + ", the average is " + average);

	}

}
