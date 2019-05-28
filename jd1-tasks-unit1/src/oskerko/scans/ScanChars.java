package oskerko.scans;

import java.util.Scanner;

public class ScanChars {
	
	public static char scanChars(String name) {
		
		char a;
		String s;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Введите " + name);
			s = sc.next();
			if(s.length() != 1) {
				System.out.println(name + " не char");
			}
		}
		while(s.length() != 1);
		
		a = s.charAt(0);
		
		return a;
		
	}
	
}
