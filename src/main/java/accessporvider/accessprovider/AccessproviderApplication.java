package accessporvider.accessprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AccessproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessproviderApplication.class, args);
	}
}

@RestController
class Hello{
	@PostMapping("/hello")
	public String hello(){
		return "Hello world";
	}
	@GetMapping("/")
	public String hai() {
	    return "Its Working";
	}
}