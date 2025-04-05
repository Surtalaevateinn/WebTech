package com.example.demo.mapper;

import com.example.demo.entity.Video;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Videomapper {
    @Select("select * from video")
    List<Video> select();
}
