package core.abstracts;

import entities.concretes.User;

public interface ValidatorService {
	
	    void sendVerificationMail(User user);


}
