package kr.co.multicampus2;

public class WaieNotifyExample {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		CousumerThread consumerThread = new CousumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();
	}
}
