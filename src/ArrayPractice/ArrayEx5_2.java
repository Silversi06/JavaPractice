package ArrayPractice;

public class ArrayEx5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;	//������ �����ϱ����� ����
		float average =0f;	//����� �����ϱ� ���� ����
		
		int[] score= {100,88,100,100,90};
		
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
		}
		average=(float)sum/score.length;	//��� ����� float Ÿ������ �� ��ȯ��
		
		System.out.println("���� : "+sum);
		System.out.println("��� : "+average);
	}
}
