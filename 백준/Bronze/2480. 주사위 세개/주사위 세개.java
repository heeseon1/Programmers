import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int value;
		
		// 같은 눈이 3개일 때
		if( a == b && b == c) {
			value = 10000 + a * 1000 ;
		}
		
		// 같은 눈이 2개일 때
		else if( a == b || a == c) {
			value = 1000 + a * 100;
		}else if(b == c){
			value = 1000 + b * 100;
		}
		
		// 모두 다른 눈이 나올 때
		else {
			int num = ( a > b ) ? a : b;
			int max = ( num > c) ? num : c;
			value = max * 100; 
		}
		
		System.out.print(value);
}
	}
