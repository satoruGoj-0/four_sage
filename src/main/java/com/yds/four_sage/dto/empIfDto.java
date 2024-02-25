package com.yds.four_sage.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class empIfDto {

    private String id;
    private String name;
    private String cof;
    private String works;
    private String workType;
    private String empType;
    private LocalDate workYear;
    private LocalDate conPeriodDeadline;
    private LocalDate passEffYear;
    private Integer gender;
    private String nation;
    private LocalDate birthday;
    private String belief;
    private String marry;
    private String addressUp;
    private String addressCode;
    private String codeId;
    private LocalDate finishEduTime;
    private String conPeriod;
    private LocalDate startJpTime;
    private LocalDate finishJpTime;
    private String gojpBatch;
    private String gojpYears;
    private String addressNew;
    private String homePhone;
    private String personPhone;
    private LocalDateTime createTime;
}
