package com.yds.four_sage.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yds.four_sage.pojo.Result;
import com.yds.four_sage.pojo.emp;
import com.yds.four_sage.service.empService;

@RestController
@CrossOrigin
public class basePersonController {
    @Autowired
    empService empService;

    @RequestMapping("/listEmp")
    public Result simpleEmp(emp emp) {
        return Result.success(empService.selectAll(emp));
    }

    @RequestMapping("/printEmp/{ids}")
    public Result printEmp(@PathVariable String[] ids) {
        return Result.success(empService.exportByEasyPoi(ids));
    }
}
