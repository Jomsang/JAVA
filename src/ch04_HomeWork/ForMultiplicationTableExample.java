package ch04_HomeWork;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {			//i�� �ʱⰪ 2���� j= 1,2,3~ 9���� �Ϸ� �� i++�� �۵�.
			System.out.println("*** "+i+"�� ***");
			for(int j = 1; j <= 9; j++) {				//j �ʱⰪ 1���� 9���� "2*1 = 2" ~ ���
				System.out.println(i+" X "+j+" = "+ i*j);
			}
		}

	}

}
