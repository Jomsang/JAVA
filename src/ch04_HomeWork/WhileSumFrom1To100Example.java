package ch04_HomeWork;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;	//sum �� ������ ���� �ʱ⿡ 0���� ����.

		while(i <= 100) {

			sum += i;  //1���� 100���� sum�� ����
			i++;

		}

		System.out.println("1~" + (i-1) +"�� : "+sum);

	}

}
