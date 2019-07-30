package vijay.ms.docker.mysqlspringbootindocker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vijay.ms.docker.mysqlspringbootindocker.model.Employees;
import vijay.ms.docker.mysqlspringbootindocker.repository.empRepository;
import java.util.List;

@RestController
@RequestMapping(value="emp")
public class EmployeeResource {

	public EmployeeResource() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	empRepository er;
	
	
	
	@GetMapping(value="/all")
	public List <Employees> getAllEmp()
	{
	  return er.findAll();
	}	

}
