package kr.co.muticampus_2;

public class NameCardMainTest {
	//field
	//필드 선언에는 black box방식(직접접근 차단) 파이썬에서는 white box방식을 사용한다.
	//접근제한자의 범위에는 4가지가 있다. Private/Public/Protected/<default>
	private String name;
	private String tel;
	private String email;
	
	public NameCardMainTest() { //Default Constructor
		name = null;
		tel = null;
		email = null;
	}
	//일반 Constructor
	/*public NameCardMainTest( String name) {
		this.name = name; //this는 필드와 인수가 명확하지 않을 때 사용(self와 같은역할)
		this.tel = null;
		this.email = null;
	}*/
	public NameCardMainTest( String name) {
		this(name, null, null);
	}
	public NameCardMainTest( String name, String tel ) {
		this(name, tel, null);
	}	
	/*public NameCardMainTest( String name, String tel) {
		this.name = name;
		this.name = tel;
	}*/
	public NameCardMainTest( String name, String tel, String email) {
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	
	public void recordNameCardMainTest( String name, String tel, String email) {
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	
	public void printNameCardMainTest() {
		System.out.printf("|%-20s|%-16s|%-30s|", name, tel, email );
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameCardMainTest[] ncs = new NameCardMainTest[5];
		for (NameCardMainTest nc : ncs) {
			nc.printNameCardMainTest();
		}
		System.out.println();
		
		ncs[0].recordNameCardMainTest("Kang", "010-8889-9999", "Kang@naver.com");
		ncs[1].recordNameCardMainTest("Seo", "010-7789-5599", "Min@naver.com");
		for (NameCardMainTest nc :ncs) {
			nc.printNameCardMainTest();
		}
	}
}

		/*		NameCardMainTest nc1 = new NameCardMainTest();
		NameCardMainTest nc2 = new NameCardMainTest("Kim");
		NameCardMainTest nc3 = new NameCardMainTest("kim", "010-1234-5678");
		NameCardMainTest nc4 = new NameCardMainTest("Moon","010-2345-6789", "Moon@korea.com");
		
		nc1.printNameCardMainTest();
		nc2.printNameCardMainTest();
		nc3.printNameCardMainTest();
		nc4.printNameCardMainTest();
		
		//System.out.println( nc2.name ); //클래스안에 메인메소드가 포함되어있으니 직접접근이 가능하다. 
	}
} */ 
