package com.yds.four_sage.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class empDto {

    private String id;
    private String name;
    private String cof;
    private String works;
    private String workType;
    private String empType;
    private String workYear;
    private String conPeriodDeadline;
    private Integer gender;
    private String nation;
    private String birthday;
    private String belief;
    private String marry;
    private String conPeriod;
    private String startJpTime;
    private String finishJpTime;
    private String gojpBatch;
    private String gojpYears;
    private LocalDateTime createTime;
}
