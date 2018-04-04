/* 산술 연산 전에 오버플로우를 탐지 */ 
package kr.co.multicampus_2;

public class checkOverFlowExample {

	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없다.");
		}
	}
	public static int safeAdd( int left, int right ) {
		if((right > 0 )) {
			if ((left >(Integer.MAX_VALUE - right))) {
				throw new ArithmeticException(" Error: Overflow ");
			}
		} else {
			if (left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException(" Error: Underflow");
			}
		}
		return left + right;
	}
}
