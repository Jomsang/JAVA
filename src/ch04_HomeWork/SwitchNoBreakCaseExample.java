package ch04_HomeWork;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int)(Math.random() * 4) + 8;	//0�� ~ 12�� �� �ð� �� ����� ���� random ���
		System.out.println("[����ð�: "+time+" ��]");

		switch(time) {
		case 8:				
			System.out.println("����մϴ�");	//time�� 8�� ���� �� ��� 
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�");
		case 10:
			System.out.println("������ ���ϴ�");
		default:
			System.out.println("�ܱ��� �����ϴ�");
		}

	}

}
