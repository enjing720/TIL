package kr.co.multicampus_2;

public class Example_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("str : " + "apple"); //문자열 결합 결과
		System.out.println( 5 + 3 + "str" );  // 보통은 좌에서 우.다항/조건식만 우에서 자외
		//문자하고 숫자하고 결합해서 쓸대 숫가가 먼저나올때 문자를 먼저 계산한다.
		System.out.println( "str" + 5 + 3 );
	}

}
