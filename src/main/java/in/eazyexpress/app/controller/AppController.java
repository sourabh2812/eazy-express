
package in.eazyexpress.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import in.eazyexpress.app.domain.AppRequest;
import in.eazyexpress.app.service.AppService;

@RestController
public class AppController {

	@Autowired
	private AppService appService;

	@RequestMapping("/")
	public ModelAndView homepage() {
		String helloWorldMessage = "Hello world";
		return new ModelAndView("home", "message", helloWorldMessage);
	}

	@PostMapping("/login")
	private ModelAndView adminLogin(@RequestBody AppRequest request) {

		if (!request.getUserName().isEmpty() && !request.getPassword().isEmpty()) {
			appService.validateAndLoginUser(request);
		}
		return new ModelAndView("admin", "request", request);
	}

}
