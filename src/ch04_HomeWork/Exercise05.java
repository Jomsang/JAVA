package ch04_HomeWork;

public class Exercise05 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		for(x = 1; x <= 10; x++) {		//1 ~ 10������ x,y for�� ����
			for(y = 1; y <= 10; y++) {
				if(4 * x + 5 * y == 60) {	//4x + 5y = 60�� �Ŀ��� x, y�� 1-10 ���� ���� �� �����ϴ� ���� ���
					System.out.println("("+ x +", "+ y +")");
				}
			}
		}

	}

}
