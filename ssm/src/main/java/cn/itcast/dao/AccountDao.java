package cn.itcast.dao;

import cn.itcast.pojo.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountDao {

    @Select("select * from account")
    List<Account> findAll();

    @Insert("insert into account(name,money) values (#{name},#{money})")
    void save(Account account);

    @Select("select * from account where id = #{id}")
    Account findById(Integer id);

    @Update("update account set money = #{money} where id = #{id}")
    void updateAccount(Account account);
}
