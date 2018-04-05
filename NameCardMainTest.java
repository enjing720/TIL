package kr.co.muticampus_2;

public class NameCardMainTest {
	//field
	//�ʵ� ���𿡴� black box���(�������� ����) ���̽㿡���� white box����� ����Ѵ�.
	//������������ �������� 4������ �ִ�. Private/Public/Protected/<default>
	private String name;
	private String tel;
	private String email;
	
	public NameCardMainTest() { //Default Constructor
		name = null;
		tel = null;
		email = null;
	}
	//�Ϲ� Constructor
	/*public NameCardMainTest( String name) {
		this.name = name; //this�� �ʵ�� �μ��� ��Ȯ���� ���� �� ���(self�� ��������)
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
		
		//System.out.println( nc2.name ); //Ŭ�����ȿ� ���θ޼ҵ尡 ���ԵǾ������� ���������� �����ϴ�. 
	}
} */ 
