package com.vikash.microservices.accounts;

import org.springframework.data.repository.CrudRepository;
import com.vikash.microservices.accounts.model.Accounts;

public interface AccountsRepository extends CrudRepository<Accounts, Long> {
	
	Accounts findByCustomerId(int customerId);
}
