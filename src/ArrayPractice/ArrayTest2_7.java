package ArrayPractice;

import java.util.Scanner;
public class ArrayTest2_7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		int [][] first=new int[2][3];
		int [][] second=new int [2][3];
		int i,j;
		
		
		System.out.println("first array");
		for(i=0; i<first.length; i++) {
			for(j=0; j<first[i].length; j++){
				first[i][j]=scan.nextInt();
			}
		}
		System.out.println("second array");
		for(i=0; i<second.length; i++) {
			for(j=0; j<second[i].length; j++) {
				second[i][j]=scan.nextInt();
			}
		}
		for(i=0; i<2; i++) {
			for(j=0; j<3; j++) {
				System.out.print(first[i][j]*second[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
