package ch04;

import java.util.*;

public class Exam_03 {

	public static void main(String[] args) {
		// �ֻ����� ���� ������ �� ���(1, 2, 3, 4, 5, 6)

		double temp = Math.random();
		System.out.println(temp); // .random() - MathŬ�������� �޼ҵ� ȣ��
									// [0, 1) - 0�� ����������, 1�� �������� �ʴ´ٴ� ��
									// [0, 1) 0�̻� 1�̸��� �Ǽ� ������ �������� ���´ٴ� ��
		System.out.println(temp * 6); // [0, 6) - 0�̻� 6�̸��� �Ǽ���
		System.out.println((int) (temp * 6 + 1)); // 1 �� �����ָ� 7�̸� (�� 6�� ����)

		int value = (int) ((temp * 6) + 1);

		if (value % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}

	}

}
