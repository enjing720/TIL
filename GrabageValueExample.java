/* byte Ÿ�� ���� */
package kr.co.multicampus_2;

public class GrabageValueExample {
	
	public static void main(String[] args) {

		byte var1 = 125;
		int var2 = 125;
		
		for (int i = 0; i<5; i++) {
			var1++;
			var2++;
			
			System.out.println("var1 : " + var1 + "\t" + "var2 : " + var2);
			// byte ������ 127�� �Ѿ�� ���� �ּҰ��� -128���� �ٽ� ����Ǵ� ���� ���� �ְ�,
			// int Ÿ���� ������ ���������� 1�� ������ ���� ��� �����ϴ� ���� �� �� �ִ�. 
		}
	}
}
