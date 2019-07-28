/**
 * 
 */
package vijay.learn.sb.dashbaord;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vijaygovind
 *
 */
@RestController
public class sbController {


		@RequestMapping("/hello")
		public String sayHi()
		{
			return "Hello Vinayaka garu";
		
	    }
		
		@RequestMapping("/topics")
		public List <Topic> getTopics()
		{
			return Arrays.asList(new Topic("Vijay","JPMC"), new Topic("Champ","Colt"));
		
	    }
}

	
