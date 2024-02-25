package com.yds.four_sage.pojo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class passport {
    private String id;
    private String enName;
    private Integer passCode;
    private String jpName;
    private String jpHanName;
    private String passClass;
    private String passYear;
    private String passEffYear;
    private String passCoff;
    private String passAddress;
    private LocalDateTime createTime;
}
