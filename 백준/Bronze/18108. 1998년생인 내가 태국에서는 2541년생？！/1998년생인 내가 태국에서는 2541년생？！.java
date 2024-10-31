import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
        //서기는 544년, 일부국가(태국)은 543년을 더하면 불기 연도
		System.out.println(year-543);
	}

}