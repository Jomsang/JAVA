package ch05_HomeWork;
import java.util.*;
public class Exercise09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.print("���� > ");

			int selectNo = input.nextInt();

			if(selectNo == 1) {
				System.out.print("�л��� > ");
				int count = input.nextInt();
				scores = new int[count];
			}
			else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores["+i+"]"+"> ");
					scores[i] = input.nextInt();
				}
			}
			else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores["+i+"] "+scores[i]);
				}
			}
			else if(selectNo == 4) {
				int sum = 0;
				int max = 0;
				double avg = 0.0;
				for(int i = 0; i < scores.length; i++) {

					if(max < scores[i]) {
						max = scores[i];

					}

					sum += scores[i];
				}
				avg = (double) sum / scores.length;
				System.out.println(sum);
				System.out.println("�ְ� ���� "+max);
				System.out.println("��� ���� "+avg);
			}
			else if(selectNo == 5) {
				break;
			}

		}
		System.out.println("���α׷� ����");

	}

}
