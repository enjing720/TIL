//String Ÿ���� Switch��
package kr.co.multicampus_2;

import java.util.Scanner;

public class SwitchStringExample {

	public static void main(String[] args) {
		//String position = "���";
		//String position = "�븮";
		String position = "��������";
		
		switch(position) {
		case "�������":
			System.out.println("���� 3500");
			//break;
		
		case "�����븮":
			System.out.println("���� 4500");
			break;
		
		case "��������":
			System.out.println("��������");
			System.out.printf("���� ����� �Է��ϼ���: ", '\n');
			Scanner sc = new Scanner(System.in);
			int careers = sc.nextInt();
			
			if (careers >= 5) {
				System.out.println("��� 5���� �̻�");
				System.out.println("200���� �λ�");
				
			} else if (careers >= 10) {
				System.out.println("��� 10���� �̻�");
				System.out.println("500���� �λ�");
				}
			}
	}
}
