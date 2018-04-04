package kr.co.multicampus_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] arr = new byte[10];
		System.out.print("문자열 입력: ");
		System.in.read(arr);
		
		String str =  new String(arr);
		System.out.println("문자열 출력: " + str);
		
		//BufferedReader 객체 사용하기
		/*new InputStreamReader is = new InputStreamReader(System.in)
		BufferedReader in = new BufferedReader(is);*/
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
System.out.print("문자열 입력: ");
		String bufferstr = in.readLine();
		System.out.println("문자열 출력: " + bufferstr);
	}
}
