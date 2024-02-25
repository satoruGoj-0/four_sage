package com.yds.four_sage.pojo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class learnDao {
    private Integer bid;
    private String id;
    private String startEduTime;
    private String finishEduTime;
    private String edu;
    private String eduJp;
    private String uni;
    private String uniJp;
    private String maj;
    private String majJp;
    private LocalDateTime createTime;
}
