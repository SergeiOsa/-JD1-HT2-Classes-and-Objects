package oskerko.scans;

import java.util.Scanner;

public class ScanInts {
	
	public static int scanInts(String name) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите " + name);
		
		while(!sc.hasNextInt()) {
			System.out.println("not int");
			sc.nextLine();
			System.out.println("Введите " + name);
		}
		
		a = sc.nextInt();	
		
		return a;

	}

}