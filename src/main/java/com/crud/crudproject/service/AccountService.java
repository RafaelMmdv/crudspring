package com.crud.crudproject.service;


import com.crud.crudproject.model.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {

    List<Account> findAll();
    Account findById(Long id);
    void create (Account account);
    void update (Long id, Account account);
    void delete(Long id);
}
