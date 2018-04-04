/* switcj¹® */ 
package kr.co.multicampus_2;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		
		switch(num) {
		case 1 :
			System.out.println("1¹øÀÌ ³ª¿È");
			break;
		
		case 2 :
			System.out.println("2¹øÀÌ ³ª¿È");
			break;
		
		case 3 :
			System.out.println("3¹øÀÌ ³ª¿È");
			break;
			
		case 4 :
			System.out.println("4¹øÀÌ ³ª¿È");
			break;
			
		case 5:
			System.out.println("5¹øÀÌ ³ª¿È");
			break;
		
		default:
			System.out.println("6¹øÀÌ ³ª¿È");
			break;		
		}
	}
}
