package ch04_HomeWork;
import java.util.*;
public class DoWhileExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("�޼����� �Է��Ͻÿ�.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��Ͻÿ�.");

		String inputString;

		do {							//do-while���� ������ �� ���� ����.
			System.out.println(">");
			inputString = input.nextLine();	//���ڿ� ���� �Է�
			System.out.println(inputString);
		}while(! inputString.equals("q"));	//"q"�� �ԷµǸ� do-while�� ���.

		System.out.println();
		System.out.println("���α׷� ����");
	}

}
