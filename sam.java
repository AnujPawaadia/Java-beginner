package practice;
import java.util.Scanner;
public class sam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		if (N%2 != 0 ){
		            System.out.print("Weird");
		        	} else if(N%2 == 0 && (6<N && N<20)){
		            System.out.print("Not Weird");
		        	}else if (N%2 == 0 && (2<N && N<5)){
		        	System.out.print("Not Weird");
		        	}else if (N%2 == 0 && (N>20)){
		            System.out.print("Not Weird");
		        	}else
		        	{
		            System.out.print("Not Weird");
		            }

		        scanner.close();
		    }
		}
