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
		
	} //static �� ����(p.239)
	
	
	// �������� ���� �ش��ϴ� Ŭ������ ���Ұ� ������� ������ ���ִ�.
	public Student() {  //�μ��� ����.
		subjects = new int[MAX_SUBJECT];
	}
	
	public Student( String name, int [] subjects ) { //�μ��� 2�� �ִ� �Ϲ� �ν��Ͻ�
		this.subjects = new int[MAX_SUBJECT]; //�μ��� �ʵ带 �����ϱ� ���� �ʵ�� [this.�ʵ�] �տ� ���̸� �ȴ�.
		                                     // �ش��ϴ� �ν����Ͻ��� �ڽ��� �ҷ����� ���̴�. 
		this.recordScore( name, subjects ); //�ߺ��Ǵ� �����ڸ� ������ �ʴ°��� ���������� ����.
	}
// class �ܺο��� ����: Interface�� method (public)
// class ���ο��� ����: ���� method (private), �ܺ� ������ �����Ѵ�. 
// method ����� ���⼭�� ����� �� �� �ƴ϶� ���Ǿ��� ��Ҹ� �̸� ����� �ش�.	
	private void calc() { // calc()�� ����ȣ���̴�. �ܺο��� ȣ���� �� ����. �������� �־�� ������ �� �ִ�. 
		for ( int subject : subjects ) { //����̶�� ���� �л� ���ο��� �ϴ� ���̴�. ������ ���µ� ����غ��� ���� ����. 
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
