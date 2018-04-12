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
			sum += i; // 1. i 내용일기/ 2.sum내용읽기/3.i내용과 sum내용 더하기/ 4.더한결과 sum에 저장
			//Thread.sleep(1);
		}
	} catch (Exception e) {
		e.printStackTrace();
		}
	}
}