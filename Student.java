package kr.co.multicampus_2;

public class Student {
	public static final int MAX_SUBJECT = 3;
	public static final int EXCELLENT = 90;
	public static final int FAIL = 60;
	
	private String name;
	private int [] subjects;
	private int total;
	private double average;
	private String grade;
	
	static {
		
	} //static 블럭 생성(p.239)
	
	
	// 생성자의 수가 해당하는 클래스의 역할과 사용방법을 정의할 수있다.
	public Student() {  //인수가 없다.
		subjects = new int[MAX_SUBJECT];
	}
	
	public Student( String name, int [] subjects ) { //인수가 2개 있는 일반 인스턴스
		this.subjects = new int[MAX_SUBJECT]; //인수와 필드를 구분하기 위해 필드는 [this.필드] 앞에 붙이면 된다.
		                                     // 해당하는 인스터턴스의 자신을 불러오는 것이다. 
		this.recordScore( name, subjects ); //중복되는 생성자를 만들지 않는것이 유지보스에 좋다.
	}
// class 외부에서 접근: Interface용 method (public)
// class 내부에서 접근: 내부 method (private), 외부 접근을 불허한다. 
// method 설계시 여기서만 사용할 것 뿐 아니라 사용되어질 요소를 미리 만들어 준다.	
	private void calc() { // calc()는 내부호출이다. 외부에서 호출할 수 없다. 과목성적이 있어야 실행할 수 있다. 
		for ( int subject : subjects ) { //계산이라는 것이 학생 내부에서 하는 것이다. 성적이 없는데 계산해봤자 값이 없다. 
			total += subject;
		}
		average = (double)total / MAX_SUBJECT;
		if ( average >= EXCELLENT ) {
			grade = "Excellent";
		} else if ( average < FAIL ) {
			grade = "Fail";
		} else {
			grade = "Normal";
		}
	}
	
	public void recordScore( String name, int [] subjects ) {
		this.name = name;
		for ( int i = 0; i < subjects.length; ++i ) {
			this.subjects[i] = subjects[i];
		}
		this.calc();
	}

	public void printStudent() {
		System.out.printf( "%-15s", name );
		for ( int i = 0; i < subjects.length; ++i ) {
			System.out.printf( "%5d", subjects[i] );
		}
		System.out.printf( "%6d %8.2f %-10s\n", total, average, grade );
	}
}
