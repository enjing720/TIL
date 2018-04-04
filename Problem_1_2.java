package kr.co.multicampus_2;

import java.util.Scanner;

public class Problem_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputData();
		System.out.println( "----- Stop Program -----" );
	}

	public static void inputData() {
		final int MAX = 10;
		Scanner sc = new Scanner( System.in );
		int number;
		int error = 0;
		int positive = 0, negative = 0, even = 0, odd = 0;
		
		for ( int i = 1; i <= MAX; ++i ) {
			System.out.printf( "Input number[%2d] : ", i );
			number = sc.nextInt();
			if ( number != 0 ) {
				if ( number > 0 ) {
					++positive;
					if ( ( number % 2 ) == 0 ) {
						++even;
					} else {
						++odd;
					}
				} else {
					++negative;
				}
			} else {
				++error;
			}
		}
		printResult( MAX, error, positive, negative, even, odd );
		
		return;
	}
	
	public static void printResult( int count, int error, int positive, int negative, int even, int odd ) {
		System.out.printf( "\nPositive number count : %5d\n", positive );
		System.out.printf( "\tEven number count : %5d\n\tOdd  number count : %5d\n"
				, even, odd );
		System.out.printf( "Negative number count : %5d\n\n", negative );		
		System.out.printf( "Total data count : %5d\tError data count : %5d\n", count, error );
		
		return;
	}
}
