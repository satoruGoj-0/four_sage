package com.yds.four_sage.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface empDeMapper {
    void deleteEmp(@Param("ids") String[] ids);

    void deletePass(@Param("ids") String[] ids);

    void deleteAdd(@Param("ids") String[] ids);

    void deleteWork(@Param("ids") String[] ids);

    void deleteHome(@Param("ids") String[] ids);

    void deleteEdu(@Param("ids") String[] ids);
}
