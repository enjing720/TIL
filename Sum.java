package kr.co.multicampus_2;

public class Sum {
	private int sum = 0;
	
	public Sum() {}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public synchronized void calc( int start, int stop ) {
		for ( int i = start; i <= stop; ++i ) {
			sum += i; // 1. i �����ϱ�/ 2.sum�����б�/3.i����� sum���� ���ϱ�/ 4.���Ѱ�� sum�� ����
			//Thread.sleep(1);
		}
	} catch (Exception e) {
		e.printStackTrace();
		}
	}
}