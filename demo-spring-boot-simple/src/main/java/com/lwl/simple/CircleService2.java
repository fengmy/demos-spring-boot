package com.lwl.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author liuweilong
 * date 2019/9/4 11:44
 * desc
 */
@Service
public class CircleService2 {
    @Autowired
    private CircleService3 circleService3;
}
