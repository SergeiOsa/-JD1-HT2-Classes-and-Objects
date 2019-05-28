package oskerko.simpleObjects.task08.CustomerLogic;

import oskerko.simpleObjects.task08.Customer.ListCustomer;

public class PrintListCustomer {

	public static void print(ListCustomer listCustomer) {
	
		for (int i = 0; i < listCustomer.getSize(); i++) {		
			System.out.println(listCustomer.getElementListCustomer(i));
			}
	}
	
}
