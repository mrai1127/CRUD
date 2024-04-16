package com.rai.banking.service;

import java.util.List;

import com.rai.banking.dto.AccountDto;

public interface AccountService {
	
	AccountDto createAccount(AccountDto accountDto);
	AccountDto getAccountById(Long id);
	AccountDto deposit(Long id, double amount);
	AccountDto withdraw(Long id, double amount);
	List<AccountDto> getAllAccount();
	void deleteAccount(Long id);
}
