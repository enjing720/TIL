//���ڿ� ��
package kr.co.muticampus_2;
public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 ="���ö";
		String strVar2 = "���ö";
		
		if(strVar1 == strVar2) {
			System.out.println("strVal1�� strVal2�� ������ ����.");
		} else {
			System.out.println("strVal1�� strVal2�� ������ �ٸ���.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar�� ���ڿ��� ����.");
		}
		
		String strVar3 = new String("���ö");
		String strVar4 = new String("���ö");
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����.");
		} else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ���.");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����.");
		}
		strVar1 = null;
		strVar2 = null;
		strVar3 = null;
		strVar4 = null;
		System.out.println(strVar1);

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����.");
		}
		
	}
}