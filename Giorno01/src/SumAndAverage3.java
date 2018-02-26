
public class SumAndAverage3 {

	public static void main(String[] args) {
		int lowerbound = 1;
		int upperbound = 100;
		
		int number = lowerbound;
		double sum = 0;
		do {
			sum += number;
			++number;
		}while(number <= upperbound);
		
		double average = sum / 100;
		System.out.println("The sum is " + sum + ", the average is " + average);
	}

}
