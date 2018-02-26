import java.util.Random;

public class maxNumber {

	public static void main(String[] args) {
		int min = -100;
		
		for(int i = 0; i < 10; i++) {
			int buff = (int) (Math.random() * 100 * -1);
			
			if(buff > min) {
				min = buff;
			}
			
			//max = Math.max(buff, max);
			
			System.out.println(buff);
		}
		System.out.println("\n" + min);

		

		
	}

}
