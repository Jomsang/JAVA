package ch04_HomeWork;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1;	//1���� 6���� ������ num�� ����.

		switch(num) {							//switch���� ������ num�� ��.
		case 1:	//num�� 1�� ���� �� ���.								
			System.out.println("1���� ���Խ��ϴ�.");
			break;
		case 2: //num�� 2�� ���� �� ���.
			System.out.println("2���� ���Խ��ϴ�.");
			break;
		case 3: //num�� 3�� ���� �� ���.
			System.out.println("3���� ���Խ��ϴ�.");
			break;
		case 4: //num�� 4�� ���� �� ���.
			System.out.println("4���� ���Խ��ϴ�.");
			break;
		case 5: //num�� 5�� ���� �� ���.
			System.out.println("5���� ���Խ��ϴ�.");
			break;
		default://���� 6�� ����� ��� default ������ ����.
			System.out.println("6���� ���Խ��ϴ�.");
			break;
		}
	}

}
