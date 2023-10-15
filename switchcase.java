package practice;
import java.util.Scanner;
public class switchcase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("your choice:");
		int a = sc.nextInt();
		
		switch(a) {
		case 1 : System.out.println("hello");
		break;
		
		case 2 : System.out.println("namaste");
		break;
		
		case 3 : System.out.println("bonjour");
		break;
		
		default : System.out.println("invalid");
		}
		sc.close();

	}

}
