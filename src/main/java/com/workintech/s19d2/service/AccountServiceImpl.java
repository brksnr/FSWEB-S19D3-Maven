package com.workintech.s19d2.service;

import com.workintech.s19d2.entity.Account;
import com.workintech.s19d2.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AccountServiceImpl implements AccountService{

    private final AccountRepository accountRepositroy;

    @Override
    public List<Account> findAll() {
        return accountRepositroy.findAll();
    }

    @Override
    public Account save(Account account) {
        return accountRepositroy.save(account);
    }
}
