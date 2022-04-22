package com.example.elklog.controller;

import com.example.elklog.common.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 酌客 on 2022/4/21.
 * 
 */
@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping
    public R<String> addLog(@RequestParam(value = "param1",required = false) String param1){
        return R.success("你好，这段话将被日志记录");
    }
}
