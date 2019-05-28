package oskerko.simpleObjects.task08.Customer;

import java.util.ArrayList;
import java.util.List;

public class ListCustomer {

	List<Customer> listCustomer;
		
	public ListCustomer() {
		listCustomer = new ArrayList<Customer>();
	}
	
	public void add(Customer newCustomer) {
		listCustomer.add(newCustomer);
	}
	
	public void remove(int index) {
		listCustomer.remove(index);
	}
	
	public List<Customer> getListCustomer() {
		return listCustomer;
	}
	
	public Customer getElementListCustomer(int index) {
		return listCustomer.get(index);
	}
	
	public int getSize() {
		return listCustomer.size();
	}

	public void setListCustomer(List<Customer> listCustomer) {
		this.listCustomer = listCustomer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listCustomer == null) ? 0 : listCustomer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListCustomer other = (ListCustomer) obj;
		if (listCustomer == null) {
			if (other.listCustomer != null)
				return false;
		} else if (!listCustomer.equals(other.listCustomer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ListCustomer [listCustomer=" + listCustomer + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}

	
	
}
