/* ��ȯ���� ���� ������ �ս��� �߻����� �ʵ��� �Ѵ�. */
package kr.co.multicampus_2;

public class checkValueBefoeCasting {

	public static void main(String[] args) {
		//int i = 128;
		int i = 126;
		//Byte.MAX_VALUE = 127
		
		if ((i< Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) {
			System.out.println("byte type���� ��ȯ�� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ���� �ּ���");
		
		} else {
			byte b= (byte) i ;
			System.out.println(b);
		}
	}
}
