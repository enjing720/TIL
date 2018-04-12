package kr.co.multicampus_2;

public class Worker extends Thread {
	private Sum sum;
	
	private int subSum;
	private int start;
	private int stop;
	
	public Worker( Sum sum, int start, int stop ) {
		this.sum = sum;
		this.start = start;
		this.stop = stop;
	}
	// �ڿ������� �ս��� ���� Thread�� �����̴�. 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//sum.calc( start, stop );
		try {
			System.out.println( getName() );
			for ( int i = start; i <= stop; ++i ) {
				subSum = sum.getSum();
				//Thread.sleep( 1 );
				subSum += i;
				sum.setSum( subSum );
			}
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
}
