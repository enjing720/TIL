/* ������ ��� ���� */
package kr.co.multicampus_2;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if (v1 > 0) {
			int v2 = v1 -10;
		}
//		int v3 = v1 + v2 + 5;
		// v2 ������ ����� �� ���⿡ ������ ������ ����
		// v2 cannot be resolved to a variable
	}
}
