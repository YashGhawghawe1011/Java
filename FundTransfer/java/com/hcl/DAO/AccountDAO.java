package com.hcl.DAO;

import com.hcl.model.Account;

public interface AccountDAO {

	Account getAccountDetails(int userid);

	public Account getAccountDetailsByAccountNumber(String accountNo);

	void updateAccount(Account account);

}
