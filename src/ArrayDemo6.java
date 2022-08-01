import java.util.Scanner;

public class ArrayDemo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student jimin = new Student();
		System.out.print("name: ");
		jimin.name=sc.nextLine();
		System.out.print("hakbun: ");
		jimin.hakbun=sc.nextLine();
		System.out.print("korean: ");
		jimin.kor=sc.nextInt();
		System.out.print("english: ");
		jimin.eng=sc.nextInt();
		System.out.print("math: ");
		jimin.mat=sc.nextInt();
		
		jimin.calcTot();
		jimin.calcavg();
		jimin.calcGrade();
		 
		jimin.display();
								
	}
}
