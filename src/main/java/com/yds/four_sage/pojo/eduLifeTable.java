package com.yds.four_sage.pojo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class eduLifeTable {
    private String id;
    private String firstLn;
    private String lnPower;
    private String finishEduTime;
    private LocalDateTime createTime;
}
