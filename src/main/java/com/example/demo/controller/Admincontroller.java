package com.example.demo.controller;


import com.example.demo.entity.Admin;
import com.example.demo.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Admincontroller {
    @Autowired
    AdminMapper adminMapper;
    @RequestMapping("/login_admin")
    public Integer findadmin(@RequestBody Admin admin) {
        if(admin.getUsername().isEmpty() || admin.getPassword().isEmpty()) {
            return 4;
        }
        Admin admin1 = adminMapper.findadmin(admin.getUsername());
        if(admin1 == null) {
            return 2;
        } else {
            if(admin1.getPassword().equals(admin.getPassword())) {
                return 1;
            }
            else {
                return 3;
            }
        }
    }
    @RequestMapping("/admin/select")
    public List<Admin> select() {
        return adminMapper.select();
    }
}
