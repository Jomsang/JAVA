package ch05;

import java.util.Arrays;

public class Exam_06 {

	public static void main(String[] args) {
		//���ο� �迭�� int ���� 3�� ���°��� ���� 
		String[] arr1 = new String[3];
		
		
		//�迭 �ε��� �� ���
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		//�迭 �׸��� ���� '����'(�ּ�)�� ����
		arr1[0] = "Hi";
		arr1[1] = "My name is";
		arr1[2] = "Cho minsang";
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]+" ");
		}
		
		System.out.println(arr1[0].equals("Hi"));
		System.out.println(!(arr1[0].equals("AA")));
		System.out.println(arr1[0] == "Hi");
	}
	

}
