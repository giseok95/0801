import java.util.Scanner;

public class practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력 : ");
		int d = sc.nextInt();
	
		int []array;
		array= new int[] {50000,10000,5000,1000,500,100,50,10,5,1};
		
		int []array2=new int[10];
		
		for(int i=0; i<10; i++) {
			array2[i]= d/array[i];
			d=d%array[i];
		}
		for(int i=0; i<10; i++) {
			System.out.printf("%d원 : %d장 \n",array[i],array2[i]);
		}		
		
		
	
	}
}
