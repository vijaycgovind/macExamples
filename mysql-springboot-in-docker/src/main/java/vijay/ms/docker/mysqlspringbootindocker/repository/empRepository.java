package vijay.ms.docker.mysqlspringbootindocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vijay.ms.docker.mysqlspringbootindocker.model.Employees;


public interface empRepository extends JpaRepository <Employees,Integer>{

	
	
}
