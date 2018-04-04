package kr.co.multicampus_2;

import java.io.IOException;
import java.util.Scanner;

public class Problem_1_5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		scoreTable();
		System.out.println( "----- Stop Program -----" );
	}

	public static void scoreTable() throws IOException {
		Scanner sc = new Scanner( System.in );
		final int MAX = 10;
		final int EXCELLENT = 90;
		final int FAIL = 60;
		
		int count = 0;
		
		char name;
		int score1, score2, score3;
		int total;
		double average;
		String grade;
		
		System.out.printf( "Input Student[%2d] name ( x : end ) : ", count + 1 );
		name = (char)System.in.read();
		while ( (name != 'x' && name != 'X') && count <= MAX ) {
			++count;
			System.out.printf( "Input Student[%2d] score1 : ", count );
			score1 = sc.nextInt();
			System.out.printf( "Input Student[%2d] score2 : ", count );
			score2 = sc.nextInt();
			System.out.printf( "Input Student[%2d] score3 : ", count );
			score3 = sc.nextInt();
			
			total = score1 + score2 + score3;
			average = (double)total / 3;
			
			if ( average >= EXCELLENT ) {
				grade = "Excellent";
			} else if ( average < FAIL ) {
				grade = "Fail";
			} else {
				grade = "Normal";
			}
			printResultStudent( name, score1, score2, score3, total, average, grade );
			
			System.out.printf( "\nInput Student[%2d] name ( x : end ) : ", count + 1 );
			name = (char)System.in.read();			
		}
		
		return;
	}
	
	public static void printResultStudent( char name, int score1, int score2, int score3, 
										   int total, double average, String grade ) {
		System.out.printf( "\n%-3c %3d %3d %3d", name, score1, score2, score3 );
		System.out.printf( "%5d %7.2f %-10s\n", total, average, grade );
		
		return;
	}
}
