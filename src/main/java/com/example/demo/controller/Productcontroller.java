package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.mapper.Productmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Productcontroller {
    @Value("C:/files")
    private String dirPath;
    @Autowired
    Productmapper productmapper;
    @RequestMapping("item/select")
    public List<Product> select(String wd1) {return productmapper.select(wd1);}
    @RequestMapping("/search")
    public List<Product> selectbywd(String wd) {
        return productmapper.selectbywd(wd);
    }
    @RequestMapping("product/select")
    public List<Product> selectbyshuma() {
        return productmapper.selectbyshuma();
    }
    @RequestMapping("product1/select")
    public List<Product> selectbujiayong() {return productmapper.selectbyjuyong();}
    @RequestMapping("/product/delete")
    public void delete(int id) {
        productmapper.delete(id);
    }
    @RequestMapping("/product/insert")
    public void insert(@RequestBody Product product) {
        productmapper.insert(product);
    }
    @RequestMapping("/product/selectByid")
    public Product selectbyid(int id) {
        return productmapper.selectbyid(id);
    }
    @RequestMapping("/product/select1")
    public  List<Product> selectall(){
        return productmapper.selectall();
    }
}
