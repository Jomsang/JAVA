package ch04_HomeWork;

public class IfNesteadExample {

	public static void main(String[] args) {
		int score = (int) (Math.random() * 20) + 81; // 81�̻� 101 �̸��� ���� ���� int�� ����ȯ �� score ������ ����
		System.out.println("����: " + score);

		String grade;

		if (score >= 90) { 							// score�� 90�̻��� ���� ���. ù if��(score >= 90)�� ��.
			if (score >= 95) { 						// �ȿ��� 95�� �̻��� ��� 'grade'������ A+ ����
				grade = "A+";
			} else { 								// 90�̻� ~ 95�̸��� ��� A
				grade = "A";
			}

		} else {									//	90�̻��� �ƴ� ���.
			if(score >= 85) {						//	85�̻� ~ 90 �̸��� ��� B+
				grade = "B+";
			}
			else {									// 85�̸��� ��� B
				grade = "B";
			}
		}

		System.out.println("���� : "+grade);

	}

}
