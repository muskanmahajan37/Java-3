package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		if(customer.getFirstName()=="Mehmet"&&customer.getLastName()=="Karakaþ"&&customer.getNationalityId()=="1234567890")
		{
			
			return true;
		}
		else
		{
			
			return false;
		}
		
		
	}

	
	

}
