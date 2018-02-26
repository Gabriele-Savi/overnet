
public class Principale {

	static class ArrEs {
		
		int [] intArr = { 3, 5, 10, 100, 48000, 17 };

		void setAllZero() {
			for(int i = 0; i < intArr.length; i++) {
				intArr[i] = 0;
			}
		}
		
		void es1() {
			System.out.println("Hello");
		}
		
		void es2() {			
			for(int x = 0; x < intArr.length; x++) {
				System.out.println(x + ": " + intArr[x]);
			}
			
			System.out.println("End of method and return");
			return;
			
		}
		
		void es3() {
			
			for(int val : intArr)
				System.out.println(val);
			return;
			
		}

		public int [] getIntArr() {
			return intArr;
		}
		
		
		
		public void sayHello() {
			System.out.println("Hello");
		}
		
		public ArrEs() {
			es2();
			setAllZero();
			es2();
		}
		
		public ArrEs(String a) {
			System.out.println(a);
		}
	}
	
	
	static class MathArray{
		int[] buff;
		
		public MathArray() {
			int[] b = {1, 2, 3, 4, 5};
			buff = b;
		}
		
		public int getSum() {
			int a = 0;
			for(int num : buff) {
				a = a + num;
			}
			return a;
		}
		
		public int getAvg() {
			return getSum() / buff.length;
		}
		
		public boolean theIsNegVal() {
			for(int num : buff) {
				if(num < 0) 
					return true;
			}
			return false;
		}
		
		public void reverseArr() {
		
			int[] temp = new int[buff.length];
			for(int i = 0 ; i < buff.length; i++) {
				temp[buff.length - i -1] = buff[i];
			}

			buff = temp;
		}
		
		public void printArr() {
			for(int i = 0; i < buff.length; i++) {
				System.out.println("Index " + i + " valore " + buff[i]);
			}
		}
	}
	
	static class ArrayManipulation{
		
		int[] myInt = {3, 4, 5, 10};
		
		static int getMax(int[] arr) {
			int maxN = 0;
			if(arr == null) return -1;
			else {
					for(int i = 0; i < arr.length; i++) {
						maxN = Math.max(maxN, arr[i]);
					}
				return maxN;
			}
		}
	
		
		public static Integer findElem(int[] arr, int elem) {
			// Verifica che l arrey non sia null 
			// trova l indice associato all elemento ricercato
			// -1 altrimenti
			if(arr == null) return null;
			for(int i = 0; i < arr.length; i ++) {
				if(arr[i] == elem) {
					return new Integer(i + 1);
				}
			}
			return -1;
			
		}
		
		public static int[] conc(int[] arr1, int[] arr2) {
			// no null
			// restituire un array dimensione arr1 + arr2
			// con tutti gli elementi
			
			if((arr1 == null) && (arr2 == null)) return null;
			
			int[] arr3 = null;
			arr3 = new int[arr1.length + arr2.length];
			
			for(int i = 0; i < arr1.length; i++) {
				arr3[i] = arr1[i];
			}
			for(int i = 0; i < arr2.length; i++) {
				arr3[i + arr1.length] = arr2[i];
			}
			
			return arr3;
		}
		
		public static int [] minusArr(int[] arr1, int[] arr2) {
			// se imp p emtrambi gli array sono null o se non hanno
			// la stessa lunghezza ritornare null
			// altrimenti rito
			int[] arr3 = null;
			arr3 = new int[10];
			
			if(arr1.length == arr2.length) return null;
			for(int i = 0; i < arr1.length; i++) {
				arr3[i] = arr1[i] - arr2[i];
			}
			return arr3;
		}
		
		public boolean isSameArray(int[] arr) {
			//no null
			// restuisce true se e' identico myInt
			// else false
			if((arr == null))
				return null != null;
			if(arr == myInt)
				return true;
			else
				return false;
		}
		
		public Integer getMulSum(int mul) {
			int sum = 0;
			for(int i = 0; i < myInt.length; i++) {
				sum = (myInt[i] * mul) + sum;
			}
			return new Integer(sum);
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) {

		
		int[] arr1 = {3, 5, 10, 20, 50},
			  arr2 = {7, 7, 7, 7, 10, 1},
			  arr3 = {4, 5};

		
		ArrayManipulation am = new ArrayManipulation();
		System.out.println(am.getMax(arr2));
		
		System.out.println("--------------------");
		System.out.println(am.findElem(arr2, 10));
		
		int[] newArr = am.conc(arr1, arr2);
		for(int i = 0; i < newArr.length; i++)
			System.out.println(newArr[i]);
		
		System.out.println("--------------------");
		
		int[] newArr2 = am.minusArr(arr1, arr2);
		for(int i = 0; i < 5; i++)
			System.out.println(newArr2[i]);
		
		System.out.println("--------------------");
		System.out.println(am.isSameArray(arr1));
	
		System.out.println("--------------------");
		
		System.out.println(am.getMulSum(1));
		
	}

}
