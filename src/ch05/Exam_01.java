package ch05;

public class Exam_01 {

	public static void main(String[] args) {
	
		int var1 = 10;
		int var2 = 10;
		System.out.println(var1 == var2);
		// �� ��
		
		String var3 = "�ڹ�";
		String var4 = "�ڹ�";
		System.out.println(var3 == var4);
		//���� ��
		
		String var5 = new String("�ڹ�");
		String var6 = new String("�ڹ�");
		System.out.println(var5 == var6);
		System.out.println(var5.equals(var6));
	}

}
