package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDaoService;
import entities.concretes.User;

public class UserDao implements UserDaoService
{
	 List<User> users = new ArrayList<>();
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName()+" "+user.getLastName() +" Kayýt Ýþlemi Baþarýlý");
		for(User person:users)
		{
			
		}
		
		
	}

	@Override
	public boolean emailCheck(User user) {

        for (User person: users
        )
            if (person.geteMail() == user.geteMail()) {
                return true;
            }
        return false;
	}

	@Override
	public boolean loginByCheck(String email, String password) {
		for(User person:users)
		{
			
			if(person.geteMail()==email&& person.getPassword()==password)
			{
				return true;
			}
		}
		return false;
	}

}
