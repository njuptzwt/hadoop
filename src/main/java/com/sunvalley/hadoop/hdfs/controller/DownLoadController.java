package com.sunvalley.hadoop.hdfs.controller;

import com.sunvalley.hadoop.Bean.Download;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 18362 on 2018/12/19.
 */
@RestController
public class DownLoadController {
    @RequestMapping(value = "/file/download",method = RequestMethod.POST)
    public String download(@RequestBody Download download)
    {
        System.out.println("RequestParam:"+ download.getDownloadpath());
        return "200";
    }
}
