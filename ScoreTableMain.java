package kr.co.multicampus_2;

import java.util.Scanner;

public class ScoreTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_STUDENT = 10; //Heap�� ����ִ� 10������ ����
		
		Scanner sc = new Scanner( System.in );
		
		Student [] scoreTable = new Student[MAX_STUDENT];
		
		String name;
		int [] subjects = new int[Student.MAX_SUBJECT];
		int count = 0;
		
		System.out.printf( "Input Student[%2d] name ( \"end\" : end ) : ", count + 1 );
		name = sc.next();
		while ( !name.equals( "end" ) && count <= MAX_STUDENT ) { // equal �޼ҵ�� ��Ȯ�ϰ� ���ڿ� �񱳰� �ȴ�. (= = ��� �� ��ȣ)
			for ( int i = 0; i < subjects.length; ++i ) {
				System.out.printf( "Input Student[%2d] score[%2d] : ", count + 1, i + 1 );
				subjects[i] = sc.nextInt(); //�� ���� ���� �޾ƿ�
			}
			scoreTable[count] = new Student( name, subjects ); //���� �����ν��ͽ��� �Է��̵Ǹ� ���̺��� �����Ѵ�. ������ �Էµ��� �ʾҴµ� ���̺� ���� ������ ����.  
			//�Ѹ� ������ �ν��Ͻ� �����ؼ� �迭�� ����Ѵ�. ���� ����Ʈ�� ����ϴ� ������ �����ذ��� �ٽ��̴�. 
			//���⼭ Student�� �ڷ������� ����� ���̴�. �Ϻ��� �ڷᱸ���� �ƴϰ� class�� ����Ͽ� ǥ���� ���̴�. ��, ����� Data Type���� ����� ���̴�. 
			//count�� ����Ͽ� �迭��ü �߿� �Է��� ���� ���� ǥ���߱⿡ ������ null���� ������ �ʾƼ� null exception�� �߻����� �ʴ´�. 
			++count;
			
			System.out.printf( "Input Student[%2d] name ( \"end\" : end ) : ", count + 1 );
			name = sc.next();
		}
		
		System.out.println();
		for ( int i = 0; i < count; ++i ) {
			scoreTable[i].printStudent();
		}
		
		sc.close();
	}
}
