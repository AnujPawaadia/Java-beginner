package practice;
import java.util.*;

public class sample {

	public static void main(String[] args) {
		
		System.out.println("enter the value of n: ");
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		
		for (int i=1;i<11;i++) {
			System.out.println(n*i);
		}
		
		sn.close();
	}
}
