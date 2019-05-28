package oskerko.scans;

import java.util.Scanner;

public class ScanDoubles {
	
	public static double scanDoubles(String name) {
		
		double a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите " + name);
		
		while(!sc.hasNextDouble()) {
			System.out.println("not double");
			sc.nextLine();
			System.out.println("Введите " + name);
		}
		
		a = sc.nextDouble();	
		
		return a;

	}

}
