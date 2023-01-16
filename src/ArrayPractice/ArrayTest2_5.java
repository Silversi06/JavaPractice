package ArrayPractice;

import java.util.Scanner;
public class ArrayTest2_5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int [][]class_1=new int [4][3];
		int sum;
		int i,j;
		
		for(i=0; i<class_1.length; i++) {
			System.out.print(i+1+"class? ");
			for(j=0; j<class_1[i].length; j++) {
				class_1[i][j]=scan.nextInt();
			}
		}
		for(i=0; i<class_1.length; i++) {
			sum=0;
			System.out.print(i+1+"class? ");
			for(j=0; j<class_1[i].length; j++) {
				sum+=class_1[i][j];
			}
			System.out.println(sum);
		}
	}
	
}
