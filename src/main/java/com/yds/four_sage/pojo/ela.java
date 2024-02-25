package com.yds.four_sage.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ela {
    private Integer bid;
    private String id;
    private String elation;
    private String elaName;
    private String elaWorkAddress;
    private String elaPhone;
    private LocalDateTime createTime;
}
