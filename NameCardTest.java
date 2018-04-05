package kr.co.muticampus_2;

public class NameCardTest {
	//private NameCard nc; // Association을 위한 field


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		NameCard nc = new NameCard("kim", "010-6418-6060" ,"Kim@nan.com");
		nc.printNameCard();
		
		NameCard[] ncarray = new NameCard[5];
		for (int i = 0; i< ncarray.length; ++i) {
			ncarray[i] = new NameCard();	
		}
		
		ncarray[0].recordNameCard("kim", "010-6418-6060" ,"Kim@nan.com");
		for (NameCard element: ncarray) {
			element.printNameCard();
		}
	}
}

		/*NameCardTest nct = new NameCardTest();
		nct.nc = new NameCard("hong", "010-1234-5678","hong@naver.com");
		nct.nc.printNameCard(); 
		
		nct.nc.name = "kim";
	}// field는 private하는 것이 좋다. 자바는 black box로 하는 것이 좋다. 
}*/

//getter(private field에 대한 읽기 method)
//setter(private field에 대한 쓰기 method) --> 리턴값없이 인스턴스만 생성
