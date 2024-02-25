package com.yds.four_sage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yds.four_sage.pojo.Result;
import com.yds.four_sage.pojo.addressImf;
import com.yds.four_sage.pojo.allDto;
import com.yds.four_sage.pojo.eduLifeTable;
import com.yds.four_sage.pojo.ela;
import com.yds.four_sage.pojo.emp;
import com.yds.four_sage.pojo.home;
import com.yds.four_sage.pojo.learnDao;
import com.yds.four_sage.pojo.passport;
import com.yds.four_sage.pojo.workLifeTable;
import com.yds.four_sage.service.empUpdateService;

@RestController
@CrossOrigin
public class UpdateController {
    @Autowired
    empUpdateService empUpdateService;

    @RequestMapping("/empUpdate")
    public Result selectHome(emp emp) {

        allDto allDto = new allDto();
        allDto.setHome(empUpdateService.selectHome(emp));

        allDto.setAddressImf(empUpdateService.selectAddress(emp));

        allDto.setEduLifeTable(empUpdateService.selectEdu(emp));

        allDto.setEmp(empUpdateService.selectEmp(emp));

        allDto.setWorkLifeTable(empUpdateService.selectWorkLife(emp));
        allDto.setLearnList(empUpdateService.selectLearnDao(emp));
        allDto.setPassport(empUpdateService.selectPassport(emp));
        allDto.setElaList(empUpdateService.selectEla(emp));
        return Result.success(allDto);

    }

    @PutMapping("/empUpdate")
    public Result updateEmp(@RequestBody emp emp) {
        empUpdateService.updateEmp(emp);
        return Result.success();
    }

    @PutMapping("/homeUpdate")
    public Result updateHome(@RequestBody home home) {
        empUpdateService.updateHome(home);
        return Result.success();
    }

    @PutMapping("/addUpdate")
    public Result updateAdd(@RequestBody addressImf addressImf) {
        empUpdateService.updateAdd(addressImf);
        return Result.success();
    }

    @PutMapping("/eduUpdate")
    public Result updateEdu(@RequestBody eduLifeTable eduLifeTable) {
        empUpdateService.updateEdu(eduLifeTable);
        return Result.success();
    }

    @PutMapping("/workUpdate")
    public Result updateWork(@RequestBody List<workLifeTable> workLifeList) {
        empUpdateService.updateWork(workLifeList);
        return Result.success();
    }

    @PutMapping("/passUpdate")
    public Result updatePass(@RequestBody passport passport) {
        empUpdateService.updatePass(passport);
        return Result.success();
    }

    @PutMapping("/elaUpdate")
    public Result updateEla(@RequestBody List<ela> elaList) {
        empUpdateService.updateEla(elaList);
        return Result.success();
    }

    @PutMapping("/learnUpdate")
    public Result updateLearn(@RequestBody List<learnDao> learnList) {
        empUpdateService.updateLearnDao(learnList);
        return Result.success();
    }
}
