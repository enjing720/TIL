package kr.co.multicampus_2;

public class PrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("System.out.print()"); //내용변경없고 줄바꿈 
												//없을 때는 그냥 print()
			
		System.out.println(); 
		System.out.println("System.out.println()"); // 줄바꿈을 포함하는 println()
		
		int number = 10;
		char ch = 'A';
		double dnumber = 19.7;
		String str = "apple"; 
		
		//별도의 format을 지정하는 printf()
		System.out.printf("%d %o %x %.2f %e %g %s %c", 
				number, number, number, 
				dnumber, dnumber, dnumber, str, ch );
	}
}
