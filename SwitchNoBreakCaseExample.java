// Break���� ���� case
package kr.co.multicampus_2;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time  = (int)(Math.random()*4) + 8;
		System.out.println("[����ð�: " + time + "��");
		
		switch(time) {
		case 8:
			System.out.println("���");
		case 9: 
			System.out.println("ȸ��");
		case 10:
			System.out.println("����");
		case 11: 
			System.out.println("�ܱ�");		
		}
	}
}
