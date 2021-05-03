package UI;


import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) {
	
		BaseCustomerManager customerManager =new StarbucksCustomerManager(new CustomerCheckManager()); 
customerManager.save(new Customer(1, "Mehmet","Karakaþ",(new GregorianCalendar(1993, 11 , 16).getTime()),"1234567890"));		

	}

}
