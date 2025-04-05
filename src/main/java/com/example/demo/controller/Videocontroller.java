package com.example.demo.controller;

import com.example.demo.entity.Video;
import com.example.demo.mapper.Videomapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Videocontroller {
    @Value("C:/files")
    private String dirPath;
    @Autowired
    Videomapper videomapper;
    @RequestMapping("/video/select")
    public List<Video> select(){
        return videomapper.select();
    }
}
