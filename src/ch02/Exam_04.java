package ch02;

public class Exam_04 {

	public static void main(String[] args) {
		// ���ڿ� -> ����(����, �Ǽ�)
		// ���ڿ��� String Ÿ�� ������ �����Ѵ�.
		String var1 = "10";
		System.out.println(var1);

		// ���� + ���ڰ� �Ǹ� ���ڷ� ���յ�.
		String var2 = var1 + 5;
		System.out.println(var2);

		// ���ڿ� -> ����
		int var3 = Integer.parseInt(var1) + 5;
		System.out.println(var3);

		// ���ڿ� -> �Ǽ�
		String var4 = "10.5";
		double var5 = Double.parseDouble(var4) + 2.3;
		System.out.println(var5);

		// ���� -> ���ڿ�
		int var6 = 3;
		String var7 = "" + var6;
		String var8 = String.valueOf(var6);
		System.out.println(var6);
		
	}

}
