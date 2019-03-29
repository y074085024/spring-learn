package com.xly.iocapplication.scanfilter;

import com.xly.iocapplication.scanfilter.service.FilterService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author yxl
 * @since 2019/3/29
 */
@Configuration
@ComponentScan(value = "com.xly.iocapplication.scanfilter",
        excludeFilters = @ComponentScan.Filter(classes = Service.class))
public class ScanFilterConfig {
}
