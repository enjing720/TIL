package kr.co.multicampus_2;
import java.io.IOException;


public class ReadTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("입력 : ");
		int anum = System.in.read();
		System.out.println("출력 : " + anum);
		
		System.in.read();
		System.in.read(); // \r\n의 값을 빼준것
		//System.in.read()-48 or '0'; == 숫자
		System.out.print("입력 : ");
		int num =  System.in.read() - 48;
		//int num = System.in.read() - 0;
		System.out.println("출력: " + num);
		
		System.in.read();
		System.in.read(); // 한번에 하나 밖에 못 읽어 온다. 	
		//(char)System.in.read(); == 문자
		System.out.print("입력 : ");
		char ch = (char)System.in.read(); //그냥 담으면 int형이니까 casting으로 강제 형변환일으켜야함
		//(int)num = System.in.read() -'0';
		System.out.println("출력 : " + ch);
	}
}
