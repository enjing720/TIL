package kr.co.muticampus_2;

public class NameCardTest {
	//private NameCard nc; // Association�� ���� field


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
	}// field�� private�ϴ� ���� ����. �ڹٴ� black box�� �ϴ� ���� ����. 
}*/

//getter(private field�� ���� �б� method)
//setter(private field�� ���� ���� method) --> ���ϰ����� �ν��Ͻ��� ����
