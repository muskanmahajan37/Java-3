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
			System.out.println("Kayýt Baþarýsýz!, Kayýt Alanlarýný Kontrol Ediniz");
		}
		else if(userDao.emailCheck(user))
		{
			System.out.println(user.geteMail()+" Hata, Sistemde Kayýtlý ");
			
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
		System.out.println("Giriþ Baþarýlý, Hoþgeldiniz");
	}
	else {
	System.out.println("Þifre veya E postayý Kontrol Ediniz");
	}
	}

}
