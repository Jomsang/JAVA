package ch05_HomeWork;

public class Exercise08 {

	public static void main(String[] args) {
		int [][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;			//��� ���� ���ϱ� ���� ���� 
		int max = 0;
		for(int i = 0; i < array.length; i++) {		//array �迭 ũ�� �б�
			for(int j = 0; j < array[i].length; j++) { // array[i]�� ũ�� �б�
				sum += array[i][j];					//array �迭�� ������ sum�� ����
				count++;							//���� �ɶ� ���� count 1�� ����
				if(max < array[i][j]) {
					max = array[i][j];
				}
			}
		}
		avg = (double) sum /count;					//�迭�� ������ ���� ������ ������ ����� ���� �� ����ȯ �� ��� ���� ����
		System.out.println("sum: "+ sum);
		System.out.println("avg: "+ avg);
		System.out.println("max: "+ max);

	}

}
