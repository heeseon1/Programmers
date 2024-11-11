import java.util.Scanner;

public class Main {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int nByte = n / 4;
        String b = "";
        
        for ( int i =1; i  <=  nByte; i ++) {
        	String str = "long ";
        	b += str;
        }    
        System.out.println(b + "int");
    }
}