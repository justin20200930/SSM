package cn.itcast.service;

import cn.itcast.pojo.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();

    void save(Account account);

    void transfer(Integer id1,Integer id2,Double money);
}
