package ch04_HomeWork;

public class BreakExample {

	public static void main(String[] args) {
		while(true) {									//���� �ݺ�
			int num = (int) (Math.random() * 6) + 1;	//0~6 ���� ���� ����
			System.out.println(num);
			if(num == 6) {								//6�� ���� ��� ���� ����� �ݺ����� ����.
				break;
			}
		}
		System.out.println("���α׷� ����");
	}

}
