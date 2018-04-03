/* byte 타입 변수 */
package kr.co.multicampus_2;

public class GrabageValueExample {
	
	public static void main(String[] args) {

		byte var1 = 125;
		int var2 = 125;
		
		for (int i = 0; i<5; i++) {
			var1++;
			var2++;
			
			System.out.println("var1 : " + var1 + "\t" + "var2 : " + var2);
			// byte 변수는 127을 넘어서는 순간 최소값인 -128부터 다시 저장되는 것을 볼수 있고,
			// int 타입의 변수는 정상적으로 1씩 증가된 값을 계속 저장하는 것을 볼 수 있다. 
		}
	}
}
