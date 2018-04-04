package kr.co.multicampus_2;
import java.util.Scanner;

public class ReadTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in );
		
		System.out.print(" Input number1 : " );
		int num1 = sc.nextInt();
		System.out.print(" Input number1:  ");
		int num2 = sc.nextInt();
		System.out.print(" Input number1:  ");
		int num3 = sc.nextInt();
		int sum = num1+ num2 + num3;
		
		System.out.printf(" Scanner(숫자입력): %d + %d + %d = %d\n ", num1, num2, num3, sum);
		
		System.out.print(" 문자열 입력 : " );
		String str1 = sc.next();
		System.out.print(" 문자열 입력 : " );
		String str2 = sc.next();
		
		System.out.println(" 입력된 문자열 1  : " + str1 );
		System.out.println(" 입력된 문자열 2  : " + str2 );
	}
}