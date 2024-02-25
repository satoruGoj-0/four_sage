package com.yds.four_sage;

import com.yds.four_sage.dto.empIfDto;
import com.yds.four_sage.mapper.empMapper;

import com.yds.four_sage.pojo.emp;
import com.yds.four_sage.service.empDeleteService;
import com.yds.four_sage.service.empService;

import lombok.extern.slf4j.Slf4j;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@SpringBootTest
public class FourSageApplicationTests {
    @Autowired
    empMapper empMapper;

    @Autowired
    empService empService;

    @Autowired
    empDeleteService empDeleteService;

    @Test
    public void helloTest2() {
        String[] ids = new String[2];
        ids[0] = "11";

        empDeleteService.delete(ids);

    }

    @Test
    public void helloTest1() {
        String[] ids = new String[2];
        ids[0] = "11";

        empDeleteService.delete(ids);

    }

    @Test
    public void helloTest3() {
        String s = "easy" + LocalDateTime.now().toString() + ".xls";
    System.out.println(s);
    }

    @Test
    public void helloTest() {

        emp emp = new emp();
        emp.setName("远东");
        List<empIfDto> aEmp = empMapper.selectAll(emp);
        aEmp.stream().forEach(x -> System.out.println(x));
        log.info("-----select完成-------");

    }
}
