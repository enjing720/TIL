/* long type 변수 */
package kr.co.multicampus_2;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000;  //compile Error
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		//System.out.println(var3);
		System.out.println(var4);
	}
}
//정밀도 테스트: var3에서 오루가 나는 이유는 
//int type의 저장 범위를 넘어서는 정수 리터럴에 L을 붙이지 않았기 때문