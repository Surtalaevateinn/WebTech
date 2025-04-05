package com.example.demo.mapper;

import com.example.demo.entity.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Productmapper {
    @Select("select * from product where type=#{wd1}")
    List<Product> select(String wd1);
    @Select("select * from product  where title like concat('%',#{wd},'%')")
    List<Product> selectbywd(String wd);

    @Select("select * from product where (type='数码电器') order by viewCount desc limit 10")
    List<Product> selectbyshuma();

    @Select("select * from product where (type='家用百货') order by viewCount desc limit 10")
    List<Product> selectbyjuyong();
    @Delete("delete from product where id=#{id}")
    void delete(int id);
    @Insert("insert into product values(null,#{title},#{url},#{price},#{oldPrice},#{saleCount},0,0)")
    void insert(Product product);
    @Select("select * from product where id=#{id}")
    Product selectbyid(int id);
    @Select("select * from product")
    List<Product> selectall();
}
