package practice;
import java.util.Scanner;

public class conditional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a:");
		int a = sc.nextInt();
		System.out.println("b:");
		int b = sc.nextInt();
		
		if (a == b) {
			System.out.println("equal");
		}else if(a>b){
			System.out.println("a is greater");
		}else{
			System.out.println("b is greater");
		}
		sc.close();
	}

}
