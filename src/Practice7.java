import java.util.Scanner;

public class Practice7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하세요 : ");
		int x= sc.nextInt();
		int y= sc.nextInt();
		int gcm=0;
		for(int i=2; i<x; i++) {
			if(x%i==0 && y%i==0) {
				gcm = i;
				System.out.print(i+"\t");					
			}
		}
		int icm = (x/gcm)*(y/gcm)*gcm;
		System.out.print(icm+"\t");
	}
}
