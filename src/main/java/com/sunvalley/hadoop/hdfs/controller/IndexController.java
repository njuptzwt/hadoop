package com.sunvalley.hadoop.hdfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 18362 on 2018/12/19.
 */
@Controller
public class IndexController {
    /**
     * 导航页
     * @return
     */
    @RequestMapping("/file")
    public String file() {
        return "/file";
    }
}
