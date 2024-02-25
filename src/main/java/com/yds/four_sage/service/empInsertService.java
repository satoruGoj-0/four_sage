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

public interface empInsertService {
    void InsertEmp(emp emp);

    void InsertAdd(addressImf addressImf);

    void InsertEdu(eduLifeTable eduLifeTable);

    void InsertHome(home home);

    void InsertPassPort(passport passport);

    void InsertWork(List<workLifeTable> workLifeList);

    void InsertEla(List<ela> elaList);

    void InsertLearn(List<learnDao> learnList);
}
