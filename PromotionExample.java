/* 자동 타입 변화 */
package kr.co.multicampus_2;

public class PromotionExample {
	public static void main(String[] args) {
	byte byteValue = 10;
	int intValue = byteValue;
	System.out.println(intValue);
	
	char charValue = '가';
	intValue = charValue; // 2byte인 char를 4byte인 int로 변환한다.
	System.out.println("가의 유니코드 = "+ intValue);
	
	intValue = 500;
	long longValue =  intValue;
	System.out.println(longValue);
	//데이터 손실이 일어나지 않는 암시적 형변환
	/*기억장소 크기가 크냐 작냐로 따지는데 기억 저장이 작은곳에서 큰 곳으로 
	옮겨가는 것이 암시적 형변환, 반대로 큰값에서 작은값으로 가는 것이 자동으로 
	되지 않고 짤라줘야하는것이 명시적 형변환이다.*/
	intValue = 200;
	double doubleValue = intValue;
	System.out.println(doubleValue);
	}
}