package com.yds.four_sage.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yds.four_sage.mapper.empUpdateMapper;
import com.yds.four_sage.pojo.addressImf;

import com.yds.four_sage.pojo.eduLifeTable;
import com.yds.four_sage.pojo.ela;
import com.yds.four_sage.pojo.emp;
import com.yds.four_sage.pojo.home;
import com.yds.four_sage.pojo.learnDao;
import com.yds.four_sage.pojo.passport;
import com.yds.four_sage.pojo.workLifeTable;
import com.yds.four_sage.service.empUpdateService;

@Service
public class empUpdateServiceImpl implements empUpdateService {

    @Autowired
    empUpdateMapper empUpdateMapper;

    @Override
    public home selectHome(emp emp) {
        return empUpdateMapper.selectHome(emp);

    }

    @Override
    public addressImf selectAddress(emp emp) {
        return empUpdateMapper.selectAddress(emp);

    }

    @Override
    public eduLifeTable selectEdu(emp emp) {
        return empUpdateMapper.selectEdu(emp);
    }

    @Override
    public emp selectEmp(emp emp) {
        return empUpdateMapper.selectEmp(emp);
    }

    @Override
    public List<workLifeTable> selectWorkLife(emp emp) {
        return empUpdateMapper.selectWorkLife(emp);
    }

    @Override
    public passport selectPassport(emp emp) {
        return empUpdateMapper.selectPassport(emp);
    }

    @Override
    public List<ela> selectEla(emp emp) {
        return empUpdateMapper.selectEla(emp);

    }

    @Override
    public List<learnDao> selectLearnDao(emp emp) {
        return empUpdateMapper.selectLearnDao(emp);
    }

    // up
    @Override
    public void updateEla(List<ela> elaList) {
        for (ela ela : elaList) {
            ela.setCreateTime(LocalDateTime.now());
            empUpdateMapper.updateEla(ela);
        }
    }

    @Override
    public void updateEmp(emp emp) {
        emp.setCreateTime(LocalDateTime.now());
        empUpdateMapper.updateEmp(emp);

    }

    @Override
    public void updateHome(home home) {
        home.setCreateTime(LocalDateTime.now());
        empUpdateMapper.updateHome(home);

    }

    @Override
    public void updatePass(passport passport) {
        passport.setCreateTime(LocalDateTime.now());
        empUpdateMapper.updatePass(passport);

    }

    @Override
    public void updateWork(List<workLifeTable> workLifeList) {
        for (workLifeTable workLifeTable : workLifeList) {
            workLifeTable.setCreateTime(LocalDateTime.now());
            empUpdateMapper.updateWork(workLifeTable);
        }
    }

    @Override
    public void updateEdu(eduLifeTable eduLifeTable) {
        eduLifeTable.setCreateTime(LocalDateTime.now());
        empUpdateMapper.updateEdu(eduLifeTable);

    }

    @Override
    public void updateAdd(addressImf addressImf) {
        addressImf.setCreateTime(LocalDateTime.now());
        empUpdateMapper.updateAdd(addressImf);

    }

    @Override
    public void updateLearnDao(List<learnDao> LearnList) {
        for (learnDao learnDao : LearnList) {
            learnDao.setCreateTime(LocalDateTime.now());
            empUpdateMapper.updateLearnDao(learnDao);
        }
    }

}
