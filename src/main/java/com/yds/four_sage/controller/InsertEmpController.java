package com.yds.four_sage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yds.four_sage.pojo.Result;
import com.yds.four_sage.pojo.addressImf;
import com.yds.four_sage.pojo.eduLifeTable;
import com.yds.four_sage.pojo.ela;
import com.yds.four_sage.pojo.emp;
import com.yds.four_sage.pojo.home;
import com.yds.four_sage.pojo.learnDao;
import com.yds.four_sage.pojo.passport;
import com.yds.four_sage.pojo.workLifeTable;
import com.yds.four_sage.service.empInsertService;

@RestController
@CrossOrigin

public class InsertEmpController {

    @Autowired
    empInsertService empInsertService;

    @PostMapping("/empInsert")
    public Result Insert(@RequestBody emp emp) {

        empInsertService.InsertEmp(emp);
        return Result.success();
    }

    @PostMapping("/addInsert")
    public Result Insert(@RequestBody addressImf addressImf) {

        empInsertService.InsertAdd(addressImf);
        return Result.success();
    }

    @PostMapping("/eduInsert")
    public Result Insert(@RequestBody eduLifeTable eduLifeTable) {
        empInsertService.InsertEdu(eduLifeTable);
        return Result.success();
    }

    @PostMapping("/learnInsert")
    public Result InsertLearn(@RequestBody List<learnDao> learnList) {
        empInsertService.InsertLearn(learnList);
        return Result.success();
    }

    @PostMapping("/homeInsert")
    public Result Insert(@RequestBody home home) {

        empInsertService.InsertHome(home);
        return Result.success();
    }

    @PostMapping("/elaInsert")
    public Result InsertEla(@RequestBody List<ela> elaList) {
        empInsertService.InsertEla(elaList);
        return Result.success();
    }

    @PostMapping("/passInsert")
    public Result Insert(@RequestBody passport passport) {

        empInsertService.InsertPassPort(passport);
        return Result.success();
    }

    @PostMapping("/workInsert")
    public Result Insert(@RequestBody List<workLifeTable> workLifeTable) {

        empInsertService.InsertWork(workLifeTable);
        return Result.success();
    }
}
