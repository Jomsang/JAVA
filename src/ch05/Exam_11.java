package ch05;

public class Exam_11 {

	public static void main(String[] args) {
		Season NowSeason = Season.WINTER;
		
		if(NowSeason == Season.SUMMER) {
			System.out.println("��");
		}
		else {
			System.out.println("���Դϴ�.");
		}

		System.out.println(NowSeason);
		//-----------------------------
		
		Login_Result Access = Login_Result.SUCCESS;
		
		if(Access == Login_Result.FAIRURE_ID) {
			System.out.println("ID�� �߸� �ԷµǾ����ϴ�.");
		}
		else if(Access == Login_Result.FAIRURE_PASSWORD) {
			System.out.println("PASSWORD�� �߸� �ԷµǾ����ϴ�.");
		}
		else {
			System.out.println("�α��� �Ǿ����ϴ�.");
		}

	}

}
