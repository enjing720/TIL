package kr.co.multicampus_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] arr = new byte[10];
		System.out.print("���ڿ� �Է�: ");
		System.in.read(arr);
		
		String str =  new String(arr);
		System.out.println("���ڿ� ���: " + str);
		
		//BufferedReader ��ü ����ϱ�
		/*new InputStreamReader is = new InputStreamReader(System.in)
		BufferedReader in = new BufferedReader(is);*/
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
System.out.print("���ڿ� �Է�: ");
		String bufferstr = in.readLine();
		System.out.println("���ڿ� ���: " + bufferstr);
	}
}
