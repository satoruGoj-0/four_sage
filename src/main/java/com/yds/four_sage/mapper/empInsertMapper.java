package com.yds.four_sage.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.yds.four_sage.pojo.addressImf;
import com.yds.four_sage.pojo.eduLifeTable;
import com.yds.four_sage.pojo.ela;
import com.yds.four_sage.pojo.emp;
import com.yds.four_sage.pojo.home;
import com.yds.four_sage.pojo.learnDao;
import com.yds.four_sage.pojo.passport;
import com.yds.four_sage.pojo.workLifeTable;

@Mapper
public interface empInsertMapper {
    void insertEmp(emp emp);

    void InsertWork(workLifeTable workLifeTable);

    void InsertPassPort(passport passport);

    void InsertHome(home home);

    void InsertEdu(eduLifeTable eduLifeTable);

    void InsertAdd(addressImf addressImf);

    void InsertLearn(learnDao learnDao);

    void InsertEla(ela ela);
}
