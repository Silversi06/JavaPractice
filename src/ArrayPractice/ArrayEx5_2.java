package ArrayPractice;

public class ArrayEx5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;	//총합을 저장하기위한 변수
		float average =0f;	//평균을 저장하기 위한 변수
		
		int[] score= {100,88,100,100,90};
		
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
		}
		average=(float)sum/score.length;	//계산 결과를 float 타입으로 얻어서 반환함
		
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+average);
	}
}
