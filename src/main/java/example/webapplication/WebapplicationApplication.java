package example.webapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping
public class ApplicationApplication {


	@GetMapping("/")
	public String hello() {
		return "welcome to springboot application";
	}
	public static void main(String[] args) {
		SpringApplication.run(ApplicationApplication.class, args);
	}

}
