package oskerko.simpleObjects.task08;

import oskerko.scans.ScanInts;
import oskerko.scans.ScanStrings;

import oskerko.simpleObjects.task08.Customer.Customer;
import oskerko.simpleObjects.task08.Customer.ListCustomer;
import oskerko.simpleObjects.task08.CustomerLogic.CustomerNameCompare;
import oskerko.simpleObjects.task08.CustomerLogic.NumCardCompare;
import oskerko.simpleObjects.task08.CustomerLogic.PrintListCustomer;

/*8. Создать класс Customer, спецификация которого приведена ниже. 
Определить конструкторы, set- и get- методы и метод toString(). 
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
         a) список покупателей в алфавитном порядке;
         b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

public class Task08 {

	public static void main(String[] args) {

		int choice;
		int x1; // для интервала
		int x2;
		
		int n; // кол-во customer
		
		int id;
		String firstName;
		String secondName;
		String address;
		int creditNum;
		int bankAccountNum;

		Customer customer;
		n = ScanInts.scanInts("количество покупателей:");

		ListCustomer listCustomer = new ListCustomer();
		CustomerNameCompare cnc = new CustomerNameCompare();
		NumCardCompare ncc =new NumCardCompare();

		for (int i = 0; i < n; i++) {

			id = i + 1;
			firstName = ScanStrings.scanStrings("фамилию:");
			secondName = ScanStrings.scanStrings("имя:");
			address = ScanStrings.scanStrings("адрес:");
			creditNum = ScanInts.scanInts("номер карты:");
			bankAccountNum = ScanInts.scanInts("номер банковского счёта:");

			customer = new Customer(id, firstName, secondName, address, creditNum, bankAccountNum);
			listCustomer.add(customer);
		}

		PrintListCustomer.print(listCustomer);
		
		System.out.println();
		System.out.println("Выберите действие:");
		System.out.println("1) список покупателей в алфавитном порядке.");
		System.out.println("2) список покупателей, у которых номер кредитной карточки находится в заданном интервале.");

		do {
			choice = ScanInts.scanInts("ваш выбор:");
			if (choice < 1 || choice > 2) {
				System.out.println("1) список покупателей в алфавитном порядке.");
				System.out.println(
						"2) список покупателей, у которых номер кредитной карточки находится в заданном интервале.");
			}
		} while (choice < 1 || choice > 2);

		if (choice == 1) {
		    listCustomer.getListCustomer().sort(cnc);
			PrintListCustomer.print(listCustomer);
		} else {
			System.out.println("Задайте интервал:");
			System.out.println("от");
			x1 = ScanInts.scanInts(":");
			System.out.println("до");
			x2 = ScanInts.scanInts(":");
			ncc.doNewList(listCustomer, x1, x2);
			PrintListCustomer.print(listCustomer);
		}

	}

}
