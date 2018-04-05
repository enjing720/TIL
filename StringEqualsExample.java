//문자열 비교
package kr.co.muticampus_2;
public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 ="양승철";
		String strVar2 = "양승철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVal1과 strVal2는 참조가 같다.");
		} else {
			System.out.println("strVal1과 strVal2는 참조가 다르다.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar는 문자열이 같다.");
		}
		
		String strVar3 = new String("양승철");
		String strVar4 = new String("양승철");
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같다.");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다르다.");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같다.");
		}
		strVar1 = null;
		strVar2 = null;
		strVar3 = null;
		strVar4 = null;
		System.out.println(strVar1);

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같다.");
		}
		
	}
}