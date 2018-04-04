package kr.co.multicampus_2;

import java.util.Scanner;

public class Problem_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainMenu();
		System.out.println( "----- Stop Program -----" );
	}

	public static void mainMenu() {
		Scanner sc = new Scanner( System.in );
		int select;
		
		do {
			System.out.println( "1. add" );
			System.out.println( "2. subtract" );
			System.out.println( "3. multiple" );
			System.out.println( "4. divide" );
			System.out.println( "0. end" );
			System.out.print( "select : " );
			select = sc.nextInt();
			
			if ( select >= 1 && select <= 4 ) {
				process( select );
			} 
		} while ( select != 0 );
		
		return;
	}
	
	public static void process( int select ) {
		Scanner sc = new Scanner( System.in );
		double number1, number2;
		
		System.out.print( "\nInput number1 : " );
		number1 = sc.nextDouble();
		System.out.print( "Input number2 : " );
		number2 = sc.nextDouble();
		
		switch ( select ) {
		case 1 : add( number1, number2 );		break;
		case 2 : subtract( number1, number2 );	break;
		case 3 : multiple( number1, number2 );	break;
		case 4 : divide( number1, number2 );	break;
		}
		
		return;
	}
	
	public static void add( double number1, double number2 ) {
		double result = number1 + number2;
		System.out.printf( "%7.2f + %7.2f = %7.2f\n\n", number1, number2, result );

		return;
	}
	
	public static void subtract( double number1, double number2 ) {
		double result = number1 - number2;
		System.out.printf( "%7.2f - %7.2f = %7.2f\n\n", number1, number2, result );
		
		return;
	}

	public static void multiple( double number1, double number2 ) {
		double result = number1 * number2;
		System.out.printf( "%7.2f * %7.2f = %7.2f\n\n", number1, number2, result );
		
		return;
	}

	public static void divide( double number1, double number2 ) {
		double result = number1 / number2;
		System.out.printf( "%7.2f / %7.2f = %7.2f\n\n", number1, number2, result );
		
		return;
	}	
}
