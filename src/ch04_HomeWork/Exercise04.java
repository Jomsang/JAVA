package ch04_HomeWork;

public class Exercise04 {

	public static void main(String[] args) {
		int dice1 = 0;
		int dice2 = 0;
		while(true) {	//���� �ݺ�
			dice1 = (int) (Math.random() * 5);	//0 ~ 4 int������ random ���� ȣ��
			dice2 = (int) (Math.random() * 5);
			System.out.println("("+ dice1 +", "+ dice2+")");
			if(dice1 + dice2 == 5) {	//dice1�� dice2�� ���� 5�̸� �ݺ��� ����
				break;
			}
		}

	}

}
