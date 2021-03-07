package net.codejava.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//비지니스 로직 담당 (dao가 db에서 받아온 데이터를 전달받아 가공)
@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	public List<Customer> listAll(){
		return (List<Customer>) repo.findAll();
	}
}
