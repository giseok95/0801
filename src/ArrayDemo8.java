import java.util.Scanner;

public class ArrayDemo8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("제품 몇 개?: ");	
		int count = sc.nextInt();
		 sc.nextLine(); //버퍼 비우기
		
		Product []array = new Product[count];
		
		for(Product p:array) {
			p = new Product();
			System.out.print("name: "); p.name = sc.nextLine();
			System.out.print("price: ");	p.price = sc.nextInt();
			sc.nextLine(); //버퍼 비우기
			System.out.print("color: ");	p.color = sc.nextLine();		
			p.display();
		}		
	}
}