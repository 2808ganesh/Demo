package in.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@Autowired
	private Environment environment;
	
	@GetMapping("/welcome")
	public String getWelcomemsg() {
		
		System.out.println("skfksfs");
		String port = environment.getProperty("server.port");
		String msg="Welcome to ashokit"+"(port :: "+ port+")";
		System.out.println("fkjfef");
		return msg;
	}
}
