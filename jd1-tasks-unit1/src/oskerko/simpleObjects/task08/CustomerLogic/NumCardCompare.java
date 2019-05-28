package oskerko.simpleObjects.task08.CustomerLogic;

import oskerko.simpleObjects.task08.Customer.ListCustomer;

public class NumCardCompare {

	public void doNewList(ListCustomer listCustomer, int x1, int x2) {
		for (int i = 0; i < listCustomer.getSize(); i++) {
			if (listCustomer.getListCustomer().get(i).getCreditNum() >= x1
					&& listCustomer.getListCustomer().get(i).getCreditNum() <= x2) {
			continue;
			} else {
				listCustomer.getListCustomer().remove(i);
			}
		}
	}

}
