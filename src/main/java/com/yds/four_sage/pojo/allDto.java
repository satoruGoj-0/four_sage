package com.yds.four_sage.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class allDto {
    private addressImf addressImf;
    private eduLifeTable eduLifeTable;
    private emp emp;
    private home home;
    private passport passport;
    private List<workLifeTable> workLifeTable;
    private List<ela> elaList;
    private List<learnDao> learnList;
}
