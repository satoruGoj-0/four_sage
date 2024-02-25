package com.yds.four_sage.pojo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class addressImf {
    private String id;
    private String codeId;
    private String addressCode;
    private String addressUp;
    private String addressPlo;
    private String addressPerson;
    private LocalDateTime createTime;
}
