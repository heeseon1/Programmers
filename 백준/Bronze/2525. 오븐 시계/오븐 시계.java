import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int cookTime = sc.nextInt();
		
		m = m + cookTime;
		
		h = h + ( m / 60);
		m = m % 60;
		
		if ( h >= 24) {
			h = h % 24;
		}
		
		System.out.print(h + " " + m);
}
	}
