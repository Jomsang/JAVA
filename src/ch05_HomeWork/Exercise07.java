package ch05_HomeWork;

public class Exercise07 {

	public static void main(String[] args) {

		int [] array = {1, 5, 3, 8, 2};

		int max = 0;

		for(int i = 0; i < array.length; i++) {		//ó���� array�迭[0] �� ����
			for(int j = 0; j < array.length; j++) {	//array[0]���� �������� array[j] �����ϸ鼭 ��
				if(array[i] < array[j]) {			//ù��° ������ ���� ���� Ŭ ��� ��������
					max = array[j];
					array[j] = array[i];
					array[i] = max;
				}
			}
		}
		System.out.println("max "+ max);


	}

}
