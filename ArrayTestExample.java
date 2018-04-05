package kr.co.muticampus_2;

public class ArrayTestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < args.length; i++) {
			System.out.printf("args[%d] =%s\n", i, args[i]);
		}
		System.out.println();
		
		
		int [] array = {1, 2, 3, 4}; 
		//1) 초기값을 설정해서 배열을 지정한다.
		//java는 배열의 요소를 지정하지않는다. Heap에 지정되기 때문이다.
			
		String strarray[] = new String[] {"apple", "banana","melon"};
		//2) 배열의 값을 지정하여 설정하기도 한다.
		
		for (int i = 0; i< array.length; i++) {
			System.out.printf("array[%d] = %d\n", i, array[i]);
			//array[i]의 i는 배열의 초기값의 요소(값)
		}
		System.out.println();
		
		for(int i = 0; i< strarray.length; i++) {
			System.out.printf("strarray[%d] = %s\n", i, strarray[i]);
		}
	}
}
