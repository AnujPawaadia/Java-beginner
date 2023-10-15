package practice;
import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter thee value of a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a+b;
		System.out.println(sum);
		
		sc.close();
	}

}
