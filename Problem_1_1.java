package kr.co.multicampus_2;

import java.io.IOException;
import java.util.Scanner;

public class Problem_1_1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		calculateAverage();
		System.out.println( "----- Stop Program -----" );
	}

	public static void calculateAverage() throws IOException {
		Scanner sc = new Scanner( System.in );
		int number1, number2;
		double average;
		
		System.out.print( "Input number1 ( end : -1 ) : " );
		number1 = sc.nextInt();
		while ( number1 != -1 ) {
			System.out.print( "Input number2 : " );
			number2 = sc.nextInt();
			average = (double)( number1 + number2 ) / 2;
			System.out.printf( "( %5d + %5d ) / 2 = %8.2f\n\n", 
					number1, number2, average );
			System.out.print( "Input number1 ( end : -1 ) : " );
			number1 = sc.nextInt();
		}
		
		return;
	}
}
