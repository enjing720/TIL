package kr.co.muticampus_2;

public class NameCard {
	private String name;
	private String tel;
	private String email;
	
	public NameCard() { //Default Constructor
		name = null;
		tel = null;
		email = null;
	}
		
	public NameCard( String name, String tel, String email) {
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	
	public void recordNameCard( String name, String tel, String email) {
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	
	public void printNameCard() {
		System.out.printf("|%-20s|%-16s|%-30s|", name, tel, email );
		System.out.println();
	}
}
