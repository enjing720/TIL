/* �ڵ� Ÿ�� ��ȭ */
package kr.co.multicampus_2;

public class PromotionExample {
	public static void main(String[] args) {
	byte byteValue = 10;
	int intValue = byteValue;
	System.out.println(intValue);
	
	char charValue = '��';
	intValue = charValue; // 2byte�� char�� 4byte�� int�� ��ȯ�Ѵ�.
	System.out.println("���� �����ڵ� = "+ intValue);
	
	intValue = 500;
	long longValue =  intValue;
	System.out.println(longValue);
	//������ �ս��� �Ͼ�� �ʴ� �Ͻ��� ����ȯ
	/*������ ũ�Ⱑ ũ�� �۳ķ� �����µ� ��� ������ ���������� ū ������ 
	�Űܰ��� ���� �Ͻ��� ����ȯ, �ݴ�� ū������ ���������� ���� ���� �ڵ����� 
	���� �ʰ� ©������ϴ°��� ����� ����ȯ�̴�.*/
	intValue = 200;
	double doubleValue = intValue;
	System.out.println(doubleValue);
	}
}