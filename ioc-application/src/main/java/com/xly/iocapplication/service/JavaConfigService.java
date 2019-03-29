package com.xly.iocapplication.service;

import com.xly.iocapplication.dao.IndexDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yxl
 * @since 2019/3/29
 */
public class JavaConfigService {
    @Resource
    private IndexDAO indexDAO;
    public void query(){
        StringBuilder sb = new StringBuilder();
        sb.append("JavaConfigService#query");
        sb.append("|--");
        sb.append(indexDAO.save());
        System.out.println(sb.toString());
    }
}
