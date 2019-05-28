package oskerko.simpleObjects.task08.CustomerLogic;

import java.util.Comparator;

import oskerko.simpleObjects.task08.Customer.Customer;

public class CustomerNameCompare implements Comparator<Customer>  {

	@Override
	public int compare(Customer customer1, Customer customer2) {
		
		return customer1.getFirstName().compareTo(customer2.getFirstName());
	}

	
	
}
