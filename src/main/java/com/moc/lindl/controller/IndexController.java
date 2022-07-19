package com.moc.lindl.controller;

import com.moc.lindl.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class IndexController {

    @Autowired
    HttpServletRequest request;

    @RequestMapping("/")
    public Result index() {
        System.out.println(request.getRequestURL());
        return Result.success(request.getRequestURL() + ": 成功了!");
    }

}
