package com.yds.four_sage.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yds.four_sage.mapper.empInsertMapper;
import com.yds.four_sage.pojo.addressImf;
import com.yds.four_sage.pojo.eduLifeTable;
import com.yds.four_sage.pojo.ela;
import com.yds.four_sage.pojo.emp;
import com.yds.four_sage.pojo.home;
import com.yds.four_sage.pojo.learnDao;
import com.yds.four_sage.pojo.passport;
import com.yds.four_sage.pojo.workLifeTable;
import com.yds.four_sage.service.empInsertService;

@Service
public class empInsertServiceImpl implements empInsertService {

    @Autowired
    empInsertMapper empInsertMapper;

    @Override
    public void InsertEmp(emp emp) {
        emp.setWorkYear(LocalDate.now().toString());
        emp.setConPeriodDeadline(LocalDate.now().plusYears(3).toString());
        emp.setCreateTime(LocalDateTime.now());
        empInsertMapper.insertEmp(emp);
    }

    @Override
    public void InsertAdd(addressImf addressImf) {
        addressImf.setCreateTime(LocalDateTime.now());
        empInsertMapper.InsertAdd(addressImf);

    }

    @Override
    public void InsertEdu(eduLifeTable eduLifeTable) {
        eduLifeTable.setCreateTime(LocalDateTime.now());
        empInsertMapper.InsertEdu(eduLifeTable);

    }

    @Override
    public void InsertHome(home home) {
        home.setCreateTime(LocalDateTime.now());
        empInsertMapper.InsertHome(home);

    }

    @Override
    public void InsertPassPort(passport passport) {
        passport.setCreateTime(LocalDateTime.now());
        empInsertMapper.InsertPassPort(passport);

    }

    @Override
    public void InsertWork(List<workLifeTable> workLifeList) {
        for (workLifeTable workLifeTable : workLifeList) {
            workLifeTable.setCreateTime(LocalDateTime.now());
            empInsertMapper.InsertWork(workLifeTable);

        }
    }

    @Override
    public void InsertEla(List<ela> elaList) {
        for (ela ela : elaList) {
            ela.setCreateTime(LocalDateTime.now());
            empInsertMapper.InsertEla(ela);

        }
    }

    @Override
    public void InsertLearn(List<learnDao> learnList) {
        for (learnDao learnDao : learnList) {
            learnDao.setCreateTime(LocalDateTime.now());
            empInsertMapper.InsertLearn(learnDao);

        }
    }

}
