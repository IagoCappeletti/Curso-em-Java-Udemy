package curso_teste;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s1 = null;
		int x = 0;
		
		 System.out.println("================================");
         for(int i=0;i<3;i++) {
              s1 = sc.next();
              x = sc.nextInt();   
         }
         System.out.println("================================");
		sc.close();
		System.out.print(s1);
	}
}