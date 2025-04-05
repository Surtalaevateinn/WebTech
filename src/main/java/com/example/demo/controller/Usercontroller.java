package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.Usermapper;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Usercontroller {
    @Value("C:/files")
    private String dirPath;
    @Autowired
    Usermapper usermapper;
    @RequestMapping("/login")
    public int login(@RequestBody User user, HttpSession session) {//@RequestBody从前端页面封装一个user对象
        User u= usermapper.selectbyusername(user.getUsername());
        if(u!=null) {
            if(u.getPassword().equals(user.getPassword())) {
                session.setAttribute("user",u);
                return 1;//1代表登陆成功
            }
            return 3;//代表密码错误
        }
        return 2;//代表用户不存在
    }

    @RequestMapping("users/select")
    public User select(String id) {
        return usermapper.selectbyusername(id);
    }
    @RequestMapping("/student/insert")
    public void insert(@RequestBody User user) {
        usermapper.insert(user);
    }
    @RequestMapping("/reg")
    public  Integer insert_reg(@RequestBody User user) {
        User u= usermapper.selectbyusername(user.getUsername());
        if(u != null) {
            return 2;
        }
        usermapper.insert_reg(user);
        return 1;
    }
    @RequestMapping("/student/select")
    public List<User> selectall(){
        return usermapper.selectall();
    }
    @RequestMapping("/update")
    public  Integer updateall(@RequestBody User user,int id) {
        User u= usermapper.selectbyusername(user.getUsername());
        if(u != null) {
            return 2;
        }
        usermapper.updateall(user,id);
        return 1;
    }


}
