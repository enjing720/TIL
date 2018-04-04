//String 타입의 Switch문
package kr.co.multicampus_2;

import java.util.Scanner;

public class SwitchStringExample {

	public static void main(String[] args) {
		//String position = "사원";
		//String position = "대리";
		String position = "일진과장";
		
		switch(position) {
		case "일진사원":
			System.out.println("연봉 3500");
			//break;
		
		case "일진대리":
			System.out.println("연봉 4500");
			break;
		
		case "일진과장":
			System.out.println("연봉협상");
			System.out.printf("현재 경력을 입력하세요: ", '\n');
			Scanner sc = new Scanner(System.in);
			int careers = sc.nextInt();
			
			if (careers >= 5) {
				System.out.println("경력 5년차 이상");
				System.out.println("200만원 인상");
				
			} else if (careers >= 10) {
				System.out.println("경력 10년차 이상");
				System.out.println("500만원 인상");
				}
			}
	}
}
