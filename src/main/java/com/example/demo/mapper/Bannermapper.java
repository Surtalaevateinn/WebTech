package com.example.demo.mapper;

import com.example.demo.entity.Banner;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Bannermapper {
    @Select("select * from banner")
    List<Banner> select();
}
