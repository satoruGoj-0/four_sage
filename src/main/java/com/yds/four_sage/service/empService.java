package com.yds.four_sage.service;

import java.util.List;

import com.yds.four_sage.dto.empIfDto;
import com.yds.four_sage.pojo.Result;
import com.yds.four_sage.pojo.emp;

public interface empService {
    public List<empIfDto> selectAll(emp emp);

    public Result exportByEasyPoi(String[] ids);
}