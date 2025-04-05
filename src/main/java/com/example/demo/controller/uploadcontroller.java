package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class uploadcontroller {
    @Value("C:/files")
    private String dirPath;
    @RequestMapping("/upload")
    public String upload(MultipartFile picFile) throws IOException {
        String filename = picFile.getOriginalFilename();
        //获得图片的后缀名,会从最后一个点里面截取后缀
        String suffx = filename.substring(filename.lastIndexOf("."));
        filename = UUID.randomUUID() + suffx;
        //随机生成一个名字，UUID.randomUUID()随机生成唯一一个名字
        File dirfile = new File(dirPath);
        if(!dirfile.exists()) {
            dirfile.mkdir();//如果C盘下files文件夹不存在，创建一个
        }
        String filepath = dirPath + "/" + filename;//得到完整的文件路径
        picFile.transferTo(new File(filepath));//将文件保存到文件夹中
        return filename;
    }
    @RequestMapping("/remove")
    public void remove(String name) {
        String filepath = dirPath + "/" + name;
        new File(filepath).delete();
    }


}
