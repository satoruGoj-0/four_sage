package com.yds.four_sage.soutE;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

public class BeanCopyUtils {
    private BeanCopyUtils() {
    }

    /** 单个对象 */
    public static <V> V copyBean(Object source, Class<V> clazz) {
        /** 创建目标对象 实现属性拷贝 */
        V result = null;
        try {
            result = clazz.newInstance();
            /** 拷贝 */
            BeanUtils.copyProperties(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /** 集合 */
    public static <O, V> List<V> copyBeanList(List<O> list, Class<V> clazz) {
        /** 创建目标对象 实现属性拷贝 */
        return list.stream()
                .map(o -> copyBean(o, clazz))
                .collect(Collectors.toList());
    }
}
