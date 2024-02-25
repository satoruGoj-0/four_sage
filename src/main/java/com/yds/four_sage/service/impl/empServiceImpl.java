package com.yds.four_sage.service.impl;

import com.yds.four_sage.dto.empIfDto;
import com.yds.four_sage.mapper.empMapper;
import com.yds.four_sage.pojo.Result;
import com.yds.four_sage.pojo.emp;
import com.yds.four_sage.service.empService;
import com.yds.four_sage.soutE.BeanCopyUtils;
import com.yds.four_sage.soutE.Constants;
import com.yds.four_sage.soutE.ExcelUserVo;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class empServiceImpl implements empService {
    @Autowired
    empMapper empMapper;

    @Override
    public List<empIfDto> selectAll(emp emp) {
        return empMapper.selectAll(emp);
    }

    @Override
    public Result exportByEasyPoi(String[] ids) {
        List<empIfDto> users = empMapper.printAll(ids);
        List<ExcelUserVo> excelUserVos = BeanCopyUtils.copyBeanList(users, ExcelUserVo.class);
        ExportParams params = new ExportParams();
        params.setSheetName("用户信息");
 
        Workbook workbook = ExcelExportUtil.exportExcel(params, ExcelUserVo.class, excelUserVos);
        try {
            File folder = new File(Constants.XLSX_DIR);
            if (!folder.exists() && !folder.isDirectory()) {
                folder.mkdirs();
            }
            File file = new File(Constants.XLSX_DIR + "\\" +  Constants.XLSX_NAME);
            if (!file.exists()) {
                file.createNewFile();
            }
            // 输出流写入
            FileOutputStream outputStream = new FileOutputStream(
                    Constants.XLSX_DIR + "\\" +  Constants.XLSX_NAME);
            workbook.write(outputStream);
            // 关闭写，不然用户点击生成的文件会显示只读
            outputStream.close();
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Result.success("导出成功");
    }
}