package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.pojo.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }

    @Override
    public void transfer(Integer id1,Integer id2,Double money){
        Account target = accountDao.findById(id1);
        Account source = accountDao.findById(id2);
        target.setMoney(target.getMoney()+money);
        source.setMoney(source.getMoney()-money);
        accountDao.updateAccount(target);
//        int i=10/0;
        accountDao.updateAccount(source);
    }
}
