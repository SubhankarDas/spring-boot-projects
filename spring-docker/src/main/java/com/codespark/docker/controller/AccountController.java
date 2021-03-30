package com.codespark.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codespark.docker.dto.AccountDTO;
import com.codespark.docker.service.AccountService;

@RestController
@RequestMapping("accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@GetMapping
	public List<AccountDTO> accounts() {
		return accountService.accounts();
	}

	@PostMapping
	public AccountDTO newAccount(@RequestBody AccountDTO accountDTO) {
		return accountService.newAccount(accountDTO);
	}

}
