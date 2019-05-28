package oskerko.scans;

import java.util.Scanner;

public class ScanStrings {
	
	public static String scanStrings(String name) {
		
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите " + name);
		str = sc.nextLine();
		
		return str;
		
	}

}
