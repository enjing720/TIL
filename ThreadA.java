package kr.co.multicampus2;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!stop) {
			if(work) {
				System.out.println("ThreadA �۾�����");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA ����");
	}
}