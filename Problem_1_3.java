package kr.co.multicampus_2;

import java.util.Scanner;

public class Problem_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateTotal();
		System.out.println( "----- Stop Program -----" );
	}

	public static void calculateTotal() {
		Scanner sc = new Scanner( System.in );
		int startNumber, endNumber;
		int isLoop;
		boolean loop = true;
		
		while ( loop ) {
			System.out.print( "start number : " );
			startNumber = sc.nextInt();
			System.out.print( "end number : " );
			endNumber = sc.nextInt();
			isLoop = startNumber - endNumber;
			if ( isLoop < 0 ) {
				printResult( startNumber, endNumber );
			} else {
				loop = false;
			}
		}
		
		return;
	}
	
	public static void printResult( int startNumber, int endNumber ) {
		int total = 0;
		
		for ( int i = startNumber; i <= endNumber; ++i ) {
			total += i;
		}
		
		System.out.println();
		System.out.println( "startNumber : " + startNumber );
		System.out.println( "endNumber : " + endNumber );
		System.out.println( "total : " + total );
		System.out.println();
		
		return;
	}
	
}
