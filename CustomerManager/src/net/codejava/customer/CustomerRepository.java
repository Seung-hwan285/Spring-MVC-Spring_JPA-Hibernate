package net.codejava.customer;

import org.springframework.data.repository.CrudRepository;


//spring-jpa가 dao역활도 해줌 dao=db를 사용해 데이터를 조회하거나 조작하는 기능
//즉 spring-jpa를 사용하면 따로 dao코드를 만들 필요가 없다
//crud 메소드를 정의하는 crudRepository인터페이스를 선언만 하면 됨
public interface CustomerRepository extends CrudRepository<Customer,Long> {

}
