package kr.co.multicampus_2;

public class PrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("System.out.print()"); //���뺯����� �ٹٲ� 
												//���� ���� �׳� print()
			
		System.out.println(); 
		System.out.println("System.out.println()"); // �ٹٲ��� �����ϴ� println()
		
		int number = 10;
		char ch = 'A';
		double dnumber = 19.7;
		String str = "apple"; 
		
		//������ format�� �����ϴ� printf()
		System.out.printf("%d %o %x %.2f %e %g %s %c", 
				number, number, number, 
				dnumber, dnumber, dnumber, str, ch );
	}
}
