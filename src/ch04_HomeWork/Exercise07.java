package ch04_HomeWork;
import java.util.*;
public class Exercise07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean run = true;
		int balance = 0;

		while(run) {	//���� �ݺ�
			System.out.println("-----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------------");
			System.out.print("���� > ");

			int select = input.nextInt();	//�޴� ����

			if(select == 1) {				//1�� ���ý� �Է��� �ݾ� ��ŭ �Ա�
				System.out.print("���ݾ� > ");
				int deposit = input.nextInt();
				balance += deposit;
			}
			else if(select == 2) {			//2�� ���ý� �Է��� �ݾ� ��ŭ ���
				System.out.print("��ݾ� > ");
				int withdraw = input.nextInt();
				balance -= withdraw;
			}
			else if(select == 3) {			//3�� ���ý� �ܰ� Ȯ��
				System.out.println("�ܰ� > "+ balance);
			}
			else if(select == 4) {			//4�� ����
				System.out.println("���α׷� ����");
				break;
			}


		}


	}

}
