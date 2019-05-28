package oskerko.simpleObjects.task08.Customer;

/*8. Создать класс Customer, спецификация которого приведена ниже. 
Определить конструкторы, set- и get- методы и метод toString(). 
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
         a) список покупателей в алфавитном порядке;
         b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

public class Customer {

	private int id;
	private String firstName;
	private String secondName;
	private String address;
	private int creditNum;
	private int bankAccountNum;
	
	{
		id = 1;
		firstName = "User";
		secondName = "Userof";
		address = "Minsk, 100";
		creditNum = 100;
		bankAccountNum = 1000;
	}
	
	public Customer() {}
	
	public Customer(int id, String firstName, String secondName, String address, 
			int creditNum, int bankAccountNum) {
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.address = address;
		this.creditNum = creditNum;
		this.bankAccountNum = bankAccountNum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreditNum() {
		return creditNum;
	}

	public void setCreditNum(int creditNum) {
		this.creditNum = creditNum;
	}

	public int getBankAccountNum() {
		return bankAccountNum;
	}

	public void setBankAccountNum(int bankAccountNum) {
		this.bankAccountNum = bankAccountNum;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + bankAccountNum;
		result = prime * result + creditNum;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((secondName == null) ? 0 : secondName.hashCode());
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
		
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bankAccountNum != other.bankAccountNum)
			return false;
		if (creditNum != other.creditNum)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (secondName == null) {
			if (other.secondName != null)
				return false;
		} else if (!secondName.equals(other.secondName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", address=" + address
				+ ", creditNum=" + creditNum + ", bankAccountNum=" + bankAccountNum + "]";
	}

	
	
}
