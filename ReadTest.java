package kr.co.multicampus_2;
import java.io.IOException;


public class ReadTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("�Է� : ");
		int anum = System.in.read();
		System.out.println("��� : " + anum);
		
		System.in.read();
		System.in.read(); // \r\n�� ���� ���ذ�
		//System.in.read()-48 or '0'; == ����
		System.out.print("�Է� : ");
		int num =  System.in.read() - 48;
		//int num = System.in.read() - 0;
		System.out.println("���: " + num);
		
		System.in.read();
		System.in.read(); // �ѹ��� �ϳ� �ۿ� �� �о� �´�. 	
		//(char)System.in.read(); == ����
		System.out.print("�Է� : ");
		char ch = (char)System.in.read(); //�׳� ������ int���̴ϱ� casting���� ���� ����ȯ�����Ѿ���
		//(int)num = System.in.read() -'0';
		System.out.println("��� : " + ch);
	}
}
