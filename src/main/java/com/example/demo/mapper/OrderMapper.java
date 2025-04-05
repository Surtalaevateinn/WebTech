package com.example.demo.mapper;


import com.example.demo.entity.Order;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface OrderMapper {
    @Select("select * from list")
    List<Order> select();
    @Update(("update list set num=#{num} where id=#{id}"))
    void update(int id, String num);
    @Delete("delete from list where id=#{id}")
    void delete(int id);
    @Select("select * from list where username like concat('%',#{name}),'%'")
    List<Order> search(String name);
}
