//���� ����Ʈ�� �迭 ����
package kr.co.muticampus_2;
public class ArrayCreateByValueListExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores;
		scores = new int[] {93, 45, 88};
		int sum1 = 0;
		
		//for(int i = 0; i <3; i++) {
		for(int i = 0; i < scores.length; i++) {
			
			System.out.println("����: " + sum1);
		}
		//return�� ������ sum2�� ����
		int sum2 = add(new int[] {93, 45, 88});
		System.out.println("���� : " + sum2);
		//System.out.println();
		
		double[] darray = new double[5];
		for(int i =0; i < darray.length; i++) {
			System.out.printf("darray[%d] = %s\n", i, darray[i]);
		}
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {
		//for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}