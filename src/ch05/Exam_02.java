package ch05;

import java.util.Arrays;

public class Exam_02 {

	public static void main(String[] args) {
		//������ �����ϸ鼭 �� ����� ������ ���
		int[] scores1 = {90, 85, 87};
		System.out.println(scores1[0]);
		System.out.println(scores1[1]);
		System.out.println(scores1[2]);

		
		//������ ������ �� �� ����� ������ ���
		int[] scores2 = null; 
		scores2 = new int[] {90, 85, 87}; // scores2 = new int[] {90, 85, 87};  -�̷��� �����ؾ� ��� ����

		add(scores1); //�޼ҵ� ȣ��
		//call by references - '����'�� �����ϸ鼭 add �޼ҵ带 ȣ��     //call by value - '��'�� �����ϸ鼭 add �޼ҵ带 ȣ���ϰڴ�!
		add(scores2);
		//add({100, 200, 300});  - �� ��. add�޼ҵ忡 �Ű����� int[] arr�� �����߱⶧��.
		add(new int[] {100, 200, 300}); // �̷��� ������ ���� ��� ���� ����
		
	}
	public static void add(int[] arr) { //�޼ҵ� ����
		System.out.println("��: "+ Arrays.toString(arr));
	}

}
