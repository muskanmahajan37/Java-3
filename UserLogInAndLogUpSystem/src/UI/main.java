package UI;

import Adaptor.JGoogleVerificationAdaptor;
import business.abstracts.UserService;
import business.concretes.UserManager;
import core.concretes.EmailValidatorManager;
import core.concretes.InputVerification;
import dataAccess.concretes.UserDao;
import entities.concretes.User;

public class main {

	public static void main(String[] args) {

		UserService userService = new UserManager(new InputVerification(), new EmailValidatorManager(), new UserDao());
		UserService userService2 = new UserManager(new JGoogleVerificationAdaptor(), new EmailValidatorManager(),
				new UserDao());

		User person = new User("Mehmet", "Karakaþ", "Example@gmail.com", "123123");
		User person2 = new User("Engin", "Demiroð", "EnginDemirog@gmail.com", "password");
		User person3 = new User("Hakan", "Okçu", "Hakan@gmail.com", "147258");

		userService.register(person);
		System.out.println("-------------------------------------");
		
		
		userService.register(person2);
		System.out.println("-------------------------------------");
		
		userService2.register(person3);
		System.out.println("-------------------------------------");
		

		userService.login("Example@gmail.com", "123123");
		System.out.println("-------------------------------------");
		
		userService.login("EnginDemirog@gmail.com", "password");

		System.out.println("-------------------------------------");

	}

}
