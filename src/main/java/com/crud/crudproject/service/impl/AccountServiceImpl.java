package com.crud.crudproject.service.impl;

import com.crud.crudproject.model.Account;
import com.crud.crudproject.model.AccountLm;
import com.crud.crudproject.repository.AccountRepository;
import com.crud.crudproject.service.AccountService;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired

    private AccountRepository accountRepository;

    @Override
    public List<Account> findAll(){

        List<Account> aa = accountRepository.findAll();
        return aa;

    }

    @Override
    public Account findById(Long id){
        Account account = null;
        try {
            account = accountRepository.findById(id).get();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return account;
    }

    @Override
    public void create(Account account) {

    }

    @Override
    public void update(Long id, Account account) {

    }

    @Override
    public void delete(Long id) {

    }


}
