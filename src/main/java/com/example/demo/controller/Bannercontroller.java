package com.example.demo.controller;

import com.example.demo.entity.Banner;
import com.example.demo.mapper.Bannermapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Bannercontroller {
    @Autowired
    Bannermapper bannermapper;
    @RequestMapping("/banner/select")
    public List<Banner> select() {
        return bannermapper.select();
    }
}

