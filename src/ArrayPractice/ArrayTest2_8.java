package ArrayPractice;

import java.util.Scanner;
public class ArrayTest2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[][]a=new int [4][2];
		int result=0;
		int i,j;
		
		for(i=0; i<a.length; i++) {
			for(j=0; j<a[i].length; j++) {
				a[i][j]=scan.nextInt();
			}
		}
		for(i=0; i<a.length; i++) {
			int sum=0;
			for(j=0; j<a[i].length; j++) {
				sum+=a[i][j];
			}
			result+=sum;
			System.out.print((sum/2)+" ");
		}
		System.out.println();
		
		for(i=0; i<2; i++) {
			int sum=0;
			for(j=0; j<4; j++) {
				sum+=a[j][i];
			}
			System.out.print((sum/4)+" ");
		}
		System.out.println();
		System.out.println(result/8);
	}

}
