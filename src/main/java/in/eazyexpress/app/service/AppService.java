package in.eazyexpress.app.service;

import org.springframework.stereotype.Service;

import in.eazyexpress.app.domain.AppRequest;
import in.eazyexpress.app.domain.User;

@Service
public class AppService {

	public void validateAndLoginUser(AppRequest request) {

		User user = new User();
		user.setFirstName("Sourabh");
		user.setLastName("Suman");

		request.setUser(user);
	}

}
