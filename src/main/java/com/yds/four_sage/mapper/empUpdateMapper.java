package com.yds.four_sage.mapper;

import java.util.List;

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
public interface empUpdateMapper {
    public addressImf selectAddress(emp emp);

    public eduLifeTable selectEdu(emp emp);

    public emp selectEmp(emp emp);

    public List<workLifeTable> selectWorkLife(emp emp);

    public passport selectPassport(emp emp);

    public home selectHome(emp emp);

    public List<ela> selectEla(emp emp);

    public List<learnDao> selectLearnDao(emp emp);

    // up
    public void updateEmp(emp emp);

    public void updateEdu(eduLifeTable eduLifeTable);

    public void updateHome(home home);

    public void updatePass(passport passport);

    public void updateWork(workLifeTable workLifeTable);

    public void updateAdd(addressImf addressImf);

    public void updateEla(ela ela);

    public void updateLearnDao(learnDao learnDao);

}
