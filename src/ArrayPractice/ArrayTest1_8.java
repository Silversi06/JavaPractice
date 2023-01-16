package ArrayPractice;
import java.util.Scanner;
public class ArrayTest1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int []array=new int [100];
		int number=0;
		int sum=0;
		int save=0;
		double avg=0;
		
			
		for(int i=0; i<array.length; i++) {
			array[i]=scan.nextInt();
			if(array[i]==0) {
				save=i;
				break;
				}
			}
		for(int i=0; i<save; i++) {
			if(array[i]%5==0) {
				number++;
				sum+=array[i];
				}
			}
			avg=(double)(sum/number);
			System.out.println("Multiples of 5 : "+number);
			System.out.println("sum : "+sum);
			System.out.println("avg : "+avg);
		}
}
