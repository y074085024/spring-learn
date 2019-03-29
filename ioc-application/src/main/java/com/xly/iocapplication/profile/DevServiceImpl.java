package com.xly.iocapplication.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author yxl
 * @since 2019/3/29
 */
@Service
@Profile("dev")
public class DevServiceImpl implements IService{
}
