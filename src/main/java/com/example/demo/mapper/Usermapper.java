package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

@Mapper
public interface Usermapper {
    @Select("select * from user where username=#{username}")
    User selectbyusername(String username);
    @Select("select * from user where username=#{wd}")
    User select(String wd);
    @Insert("insert into user values(null,#{username},#{password},#{sex},#{dormitory},#{phone},#{idcard},#{url})")
    void insert(User user);
    @Delete("delete from user where id=#{id}")
    void delete(int id);
    @Insert("insert into user values(null,#{username},#{password},#{sex},#{dormitory},#{phone},#{idcard},#{url})")
    void insert_reg(User user);

    @Select("select url from user")
    List<User> selectbyurl();

    @Select("select username from user")
    List<User> selectname();
    @Select("select * from user")
    List<User> selectall();
    @Update("update user set username=#{username},password=#{password},sex=#{sex},idcard=#{idcard},phone=#{phone},dormitory=#{dormitory},url=#{url} where id=#{id}")
    User updateall(User user,int id);
}
