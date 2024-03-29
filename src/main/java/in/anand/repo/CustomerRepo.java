package in.anand.repo;

import org.springframework.data.repository.CrudRepository;

import in.anand.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer>{
	
	public Customer findByUname(String cuname);

}
