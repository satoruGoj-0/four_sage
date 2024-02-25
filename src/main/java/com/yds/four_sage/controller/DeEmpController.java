package com.yds.four_sage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yds.four_sage.pojo.Result;
import com.yds.four_sage.service.empDeleteService;

@RestController
@CrossOrigin
public class DeEmpController {
    @Autowired
    empDeleteService empDeleteService;

    @DeleteMapping("/list/{ids}")
    public Result delete(@PathVariable String[] ids) {
        empDeleteService.delete(ids);
        return Result.success();
    };
}
