package ch04_HomeWork;

public class Exercise03 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {	//1-100 ������ Ȧ���� ��쿡�� sum�� ���� ��Ŵ
				sum += i;
			}
		}
		System.out.println("3�� ����� ���� : "+ sum);
	}

}
