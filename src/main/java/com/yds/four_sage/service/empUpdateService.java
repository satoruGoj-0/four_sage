package com.yds.four_sage.service;

import java.util.List;

import com.yds.four_sage.pojo.addressImf;

import com.yds.four_sage.pojo.eduLifeTable;
import com.yds.four_sage.pojo.ela;
import com.yds.four_sage.pojo.emp;
import com.yds.four_sage.pojo.home;
import com.yds.four_sage.pojo.learnDao;
import com.yds.four_sage.pojo.passport;
import com.yds.four_sage.pojo.workLifeTable;

public interface empUpdateService {
    public addressImf selectAddress(emp emp);

    public eduLifeTable selectEdu(emp emp);

    public emp selectEmp(emp emp);

    public List<workLifeTable> selectWorkLife(emp emp);

    public passport selectPassport(emp emp);

    public home selectHome(emp emp);

    public List<ela> selectEla(emp emp);

    public List<learnDao> selectLearnDao(emp emp);

    void updateEmp(emp emp);

    void updateHome(home home);

    void updatePass(passport passport);

    void updateWork(List<workLifeTable> workLifeList);

    void updateEdu(eduLifeTable eduLifeTable);

    void updateAdd(addressImf addressImf);

    void updateEla(List<ela> elaList);

    void updateLearnDao(List<learnDao> LearnList);
}
