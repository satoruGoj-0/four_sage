package com.yds.four_sage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yds.four_sage.mapper.empDeMapper;
import com.yds.four_sage.service.empDeleteService;

@Service
public class empDeleteServiceImpl implements empDeleteService {
    @Autowired
    empDeMapper empDeMapper;

    @Override
    public void delete(String[] ids) {
        empDeMapper.deleteEmp(ids);
        empDeMapper.deleteEdu(ids);
        empDeMapper.deleteHome(ids);
        empDeMapper.deleteWork(ids);
        empDeMapper.deletePass(ids);
        empDeMapper.deleteAdd(ids);

    }

}
