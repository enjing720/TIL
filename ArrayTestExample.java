package kr.co.muticampus_2;

public class ArrayTestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < args.length; i++) {
			System.out.printf("args[%d] =%s\n", i, args[i]);
		}
		System.out.println();
		
		
		int [] array = {1, 2, 3, 4}; 
		//1) �ʱⰪ�� �����ؼ� �迭�� �����Ѵ�.
		//java�� �迭�� ��Ҹ� ���������ʴ´�. Heap�� �����Ǳ� �����̴�.
			
		String strarray[] = new String[] {"apple", "banana","melon"};
		//2) �迭�� ���� �����Ͽ� �����ϱ⵵ �Ѵ�.
		
		for (int i = 0; i< array.length; i++) {
			System.out.printf("array[%d] = %d\n", i, array[i]);
			//array[i]�� i�� �迭�� �ʱⰪ�� ���(��)
		}
		System.out.println();
		
		for(int i = 0; i< strarray.length; i++) {
			System.out.printf("strarray[%d] = %s\n", i, strarray[i]);
		}
	}
}
