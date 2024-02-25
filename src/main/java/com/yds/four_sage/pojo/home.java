package com.yds.four_sage.pojo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class home {
    private String id;
    private String addressNew;
    private String postcode;
    private String homePhone;
    private String personPhone;
    private String leavePhone;
    private LocalDateTime createTime;
}
