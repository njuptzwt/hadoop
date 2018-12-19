package com.sunvalley.hadoop.hdfs.controller;

import com.sunvalley.hadoop.Bean.FileEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 18362 on 2018/12/19.
 */
@Controller
public class InquiryController {
    @RequestMapping("fileistTest")
    public String file() {
        return "/fileList";
    }

    @RequestMapping(value = "/fileList", method = RequestMethod.POST)
    public String file(Model model,FileEntity fileEntity) {
        System.out.println("fielentity: "+fileEntity.getFilename()+fileEntity.getFilepath());
        List<FileEntity> files = new ArrayList<>();
        FileEntity f1 = new FileEntity();
        f1.setFilename("dsjkd");
        f1.setFilepath("D:/sdsd");
        files.add(f1);
        FileEntity f2 = new FileEntity();
        f2.setFilename("dsjkd");
        f2.setFilepath("C:/sdsd");
        files.add(f2);
        model.addAttribute("files", files);
        return "/fileList";
    }
}
