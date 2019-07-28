package vijay.learn.sb.dashbaord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication


	public class DashbaordApplication {
		
	//	@RequestMapping("/")
	//	String home() {
	//		return "Hello Vijay FROM h2 db!";
	//	}

	public static void main(String[] args) {
		SpringApplication.run(DashbaordApplication.class, args);
		System.out.println("HELLO GANAPA");
		System.out.println(" THIS IS WITH PORT ON 8888 TOMCAT-------->>");
		//System.out.println(System.getProperty("user.dir"));
	}

	}
