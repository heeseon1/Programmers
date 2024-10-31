import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();

		System.out.println(a * (b.charAt(2) - '0'));
		System.out.println(a * (b.charAt(1) - '0'));
		System.out.println(a *(b.charAt(0) - '0'));
		
		int numB = Integer.parseInt(b);
		System.out.println(a * numB);
		
		/* 
  		int a = sc.nextInt();
		int b = sc.nextInt();
	
		String bStr = String.valueOf(b);
		
		String slice3 = bStr.substring(2,3);
		String slice2 = bStr.substring(1,2);
		String slice1 = bStr.substring(0,1);
		
		int b3 = Integer.parseInt(slice3);
		int b2 = Integer.parseInt(slice2);
		int b1 = Integer.parseInt(slice1);
		
		System.out.println(a * b3);
		System.out.println(a * b2);
		System.out.println(a * b1);
		System.out.println(a * b);
  		*/


		
		
	}

}
