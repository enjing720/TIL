/* 강제 타입 변화*/
package kr.co.multicampus_2;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue =  (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);		
	}
}
// 강제 형변환에서 주의할 점의 사용자로부터 입력받은 값을 변환시 값의 손실이 발생하면
//안된다는 것이다. 강제타입 변환을 하기전에는 안전하게 값이 보존될 수 있도록 검사해야한다.
