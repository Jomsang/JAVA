package ch04_HomeWork;

public class WhileKeyControlExample {

	public static void main(String[] args) {

		boolean run = true;	
		int speed = 0;
		int keyCode = 0;

		while(run) {	//true�� �̻� ���� �ݺ�
			if(keyCode != 13 && keyCode != 10) {	//13�� 10�� �ԷµǸ� if���� ���.
				System.out.println("=====================");
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("=====================");
				System.out.println("���� : ");
			}

			try {									//Exception ó��
				keyCode = System.in.read();
			}catch(Exception e){
				e.printStackTrace();
			}

			if(keyCode == 49) {	//1(49)�� �ԷµǸ� speed ����
				speed++;
				System.out.println("���� �ӵ� = "+ speed);
			}
			else if(keyCode == 50) { //2(50)�� �ԷµǸ� speed ����
				speed--;
				System.out.println("���� �ӵ� = "+ speed);
			}
			else if(keyCode == 51) {	//3(51)�� �ԷµǸ� ����
				run = false;
			}
		}
		System.out.println("���α׷� ����");

	}

}
