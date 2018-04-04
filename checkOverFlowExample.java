/* ��� ���� ���� �����÷ο츦 Ž�� */ 
package kr.co.multicampus_2;

public class checkOverFlowExample {

	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����.");
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
