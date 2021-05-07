package business.concretes;

import business.abstracts.UserService;
import core.abstracts.InputVerificationService;
import core.abstracts.ValidatorService;
import dataAccess.abstracts.UserDaoService;
import entities.concretes.User;

public class UserManager  implements UserService{
	private InputVerificationService personValidation;
	private	UserDaoService userDao;
	private ValidatorService validatorService;

	public UserManager(InputVerificationService personValidation, ValidatorService validatorService,
			UserDaoService userDao) {
		super();
		this.personValidation = personValidation;
		this.userDao = userDao;
		this.validatorService = validatorService;
	}

	@Override
	public void register(User user) {
		if(!personValidation.isValid(user))
		{
			System.out.println("Kay�t Ba�ar�s�z!, Kay�t Alanlar�n� Kontrol Ediniz");
		}
		else if(userDao.emailCheck(user))
		{
			System.out.println(user.geteMail()+" Hata, Sistemde Kay�tl� ");
			
		}
		else 
		{
			userDao.add(user);		
		
			validatorService.sendVerificationMail(user);
		}
		
		
	}

	@Override
	public void login(String email, String password) {
	if(userDao.loginByCheck(email, password))
	{
		System.out.println("Giri� Ba�ar�l�, Ho�geldiniz");
	}
	else {
	System.out.println("�ifre veya E postay� Kontrol Ediniz");
	}
	}

}
