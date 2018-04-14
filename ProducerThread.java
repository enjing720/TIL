package kr.co.multicampus2;

import java.io.StringBufferInputStream;

public class ProducerThread extends Thread {
	private DataBox dataBox;
	
	public ProducerThread(DataBox databox) {
		this.dataBox = databox;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ThreadGroup group = Thread.currentThread().getThreadGroup();
		String groupName = group.getName();
		System.out.println("ProducerThread ->" +groupName);
		
		for (int i = 1;  i <3; i++) {
			String data = "Data-" + i;
			dataBox.setData(data);
		}
	}
}
	
