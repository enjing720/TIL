/* float와 double의 타입 */
package kr.co.multicampus_2;

public class floatExample {

	public static void main(String[] args) {
		double var1 = 3.14;		
		//float var2 = 3.14;  //compile Error(Type mismath)
		float var3 = 3.14F;
		
		//double과 float의 정밀도 테스트
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		//double type인 var4가 float type인 var5보다 2배 이상 정밀하게 값이
		//저장되어 있는 것을 볼 수 있는데 이것은 double type의 기수가 
		//float type의 기수 bit수 보다 약 두배 정도 크기 때문이다. 
		
		System.out.println("var1 : " + var1);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		
		//e 사용하기
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
		System.out.println("var8 : " + var8);
		System.out.println("var9 : " + var9);
	}
}
