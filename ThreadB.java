package kr.co.multicampus2;

public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!stop) {
			if(work) {
				System.out.println("ThreadB �۾�����");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB ����");
	}
}