package ch05;

import java.util.Arrays;

public class Exam_05 {

	public static void main(String[] args) {
		//���ο� �迭�� int ���� 3�� ���°��� ���� 
		int[] arr1 = new int[3];
		
		
		//�迭 �ε��� �� ���
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		//�迭 �׸��� ���� ���� �����
		arr1[0] = 90;
		arr1[1] = 80;
		arr1[2] = 95;
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		//�迭 �׸� �� 
		System.out.println(arr1[0] == 90);
		System.out.println(arr1[0] != 80);
	}
	

}
