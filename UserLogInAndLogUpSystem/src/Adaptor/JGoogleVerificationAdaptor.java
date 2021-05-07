package Adaptor;

import business.abstracts.JGoogleVerificationService;
import core.abstracts.InputVerificationService;
import entities.concretes.User;

public class JGoogleVerificationAdaptor implements InputVerificationService{

	@Override
	public boolean isValid(User user) {
		JGoogleVerificationService service =new JGoogleVerificationService();
	
		return service.isValid();
	}

}
