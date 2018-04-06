package kr.co.multicampus_2;

import java.util.Scanner;

public class ScoreTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_STUDENT = 10; //Heap에 비어있는 10공간을 만듬
		
		Scanner sc = new Scanner( System.in );
		
		Student [] scoreTable = new Student[MAX_STUDENT];
		
		String name;
		int [] subjects = new int[Student.MAX_SUBJECT];
		int count = 0;
		
		System.out.printf( "Input Student[%2d] name ( \"end\" : end ) : ", count + 1 );
		name = sc.next();
		while ( !name.equals( "end" ) && count <= MAX_STUDENT ) { // equal 메소드는 정확하게 문자열 비교가 된다. (= = 등가비교 비 선호)
			for ( int i = 0; i < subjects.length; ++i ) {
				System.out.printf( "Input Student[%2d] score[%2d] : ", count + 1, i + 1 );
				subjects[i] = sc.nextInt(); //각 각의 성적 받아옴
			}
			scoreTable[count] = new Student( name, subjects ); //실제 성적인스터스가 입력이되면 테이블을 구성한다. 정보가 입력되지 않았는데 테이블에 넣을 내용이 없다.  
			//한명 들어오면 인스턴스 생성해서 배열에 등록한다. 성적 리스트를 출력하는 과정이 문제해결의 핵심이다. 
			//여기서 Student는 자료형으로 사용한 것이다. 완변한 자료구조는 아니고 class를 사용하여 표현한 것이다. 즉, 사용자 Data Type으로 사용한 것이다. 
			//count를 사용하여 배열전체 중에 입력한 값만 세서 표현했기에 나머지 null값이 잡히지 않아서 null exception이 발생하지 않는다. 
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
