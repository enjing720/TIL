package kr.co.muticampus_2;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		//int [][] array = new int[2][5];
		
		//array[0] = new int[5];
		//array[1] = new int[10];
		
		String [][] array = {{"apple","banana"},
				{"melon", "mango"}};
		
		for (int i = 0; i < array.length; ++i) {
			for (int j = 0; j < array[i].length;  j++) {
				System.out.printf("%-8s", array[i][j]);
			}
			System.out.println();
		}
		for( int i = 0; i<array.length; ++i) {
			for ( String column : array[i]) {
				System.out.printf("%-8s", column);
			}
			System.out.println();
		}
	}
}
		//String[][] strarray = array;
		// 이렇게 하면 단순레퍼런스 밖에 안됨. 즉 Heap내용의 배열을 복사하지 못한다.
		//그래서 배열을 복사하는 함수를 사용한다.
		

