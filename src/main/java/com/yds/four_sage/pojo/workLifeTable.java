package com.yds.four_sage.pojo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class workLifeTable {
    private Integer bid;
    private String id;
    private String startTime;
    private String finishTime;
    private String workAdd;
    private String workAddJp;
    private String job;
    private String jobJp;
    private LocalDateTime createTime;
}
