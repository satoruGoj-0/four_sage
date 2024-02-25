package com.yds.four_sage.mapper;

import com.yds.four_sage.dto.empIfDto;
import com.yds.four_sage.pojo.emp;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface empMapper {

        public List<empIfDto> selectAll(emp emp);

        public List<empIfDto> printAll(@Param("ids") String[] ids);
}