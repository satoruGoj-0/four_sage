package com.yds.four_sage.soutE;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ExcelTarget("empIfDto")
public class ExcelUserVo implements Serializable {

    @Excel(name = "用户id", width = 20)
    private String id;
    @Excel(name = "员工姓", width = 20)
    private String name;
    @Excel(name = "所属部门", width = 20)
    private String cof;
    @Excel(name = "主要职位", width = 20)
    private String works;
    @Excel(name = "员工类", width = 20)
    private String workType;
    @Excel(name = "员工状", width = 20)
    private String empType;
    @Excel(name = "入职时间", width = 20)
    private LocalDate workYear;
    @Excel(name = "劳务合同结束日", width = 20)
    private LocalDate conPeriodDeadline;
    @Excel(name = "护照有效日期", width = 20)
    private LocalDate passEffYear;
    @Excel(name = "民族", width = 20)
    private String nation;
    @Excel(name = "政治面貌", width = 20)
    private String belief;
    @Excel(name = "婚姻状况", width = 20)
    private String marry;
    @Excel(name = "出生地", width = 20)
    private String addressUp;
    @Excel(name = "籍贯", width = 20)
    private String addressCode;
    @Excel(name = "身份证号", width = 20)
    private String codeId;
    @Excel(name = "毕业年月", width = 20)
    private LocalDate finishEduTime;
    @Excel(name = "劳务合同期", width = 20)
    private String conPeriod;
    @Excel(name = "赴日起始年月", width = 20)
    private LocalDate startJpTime;
    @Excel(name = "赴日批次", width = 20)
    private String gojpBatch;
    @Excel(name = "赴日合同年", width = 20)
    private String gojpYears;
    @Excel(name = "现住址", width = 20)
    private String addressNew;
    @Excel(name = "住宅电话", width = 20)
    private String homePhone;
    @Excel(name = "手机", width = 20)
    private String personPhone;
}
