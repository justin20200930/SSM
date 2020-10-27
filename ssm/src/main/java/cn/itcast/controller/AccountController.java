package cn.itcast.controller;

import cn.itcast.pojo.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/testFind")
    public String testFind(Model model){
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "success";
    }
}
