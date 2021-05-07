package core.concretes;



import core.abstracts.ValidatorService;
import entities.concretes.User;

public class EmailValidatorManager implements ValidatorService {

	@Override
	public void sendVerificationMail(User user) {
System.out.println(user.getFirstName()+" A Doðrulama Linki Gönderildi");
		
	}

	


}
