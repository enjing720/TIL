/* ���� Ÿ�� ��ȭ*/
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
// ���� ����ȯ���� ������ ���� ����ڷκ��� �Է¹��� ���� ��ȯ�� ���� �ս��� �߻��ϸ�
//�ȵȴٴ� ���̴�. ����Ÿ�� ��ȯ�� �ϱ������� �����ϰ� ���� ������ �� �ֵ��� �˻��ؾ��Ѵ�.
