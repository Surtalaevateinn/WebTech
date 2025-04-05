package com.example.demo.mapper;


import com.example.demo.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AdminMapper {
    @Select("select * from admin where username=#{username}")
    Admin findadmin(String username);
    @Select("select * from admin")
    List<Admin> select();
}
