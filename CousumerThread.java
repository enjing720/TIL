package kr.co.multicampus2;

public class CousumerThread extends Thread {
	private DataBox dataBox;
	
	public CousumerThread(DataBox databox) {
		this.dataBox = databox;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ThreadGroup group = Thread.currentThread().getThreadGroup();
		String groupName = group.getName();
		System.out.println("ConsumerThread ->" +groupName);
		
		for (int i = 1;  i <3; i++) {
			String data = "Data-" + i;
			dataBox.setData(data);
		}
	}
}
	