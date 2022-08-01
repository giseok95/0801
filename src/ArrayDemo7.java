import java.util.Scanner;

public class ArrayDemo7 {
	public static void main(String[] args) {
		System.out.print("학생 몇 명? ");
		Scanner sc = new Scanner(System.in);
		int count  = sc.nextInt();
		sc.nextLine();
		
		Student []array = new Student[count];
		for(Student std:array) {
			std = new Student();
			System.out.print("name: ");
			std.name=sc.nextLine();
			System.out.print("hakbun: ");
			std.hakbun=sc.nextLine();
			System.out.print("korean: ");
			std.kor=sc.nextInt();
			System.out.print("english: ");
			std.eng=sc.nextInt();
			System.out.print("math: ");
			std.mat=sc.nextInt();
			sc.nextLine();
		
			std.calcTot(); std.calcavg(); std.calcGrade(); std.display();		
		}	
		
	}
}
