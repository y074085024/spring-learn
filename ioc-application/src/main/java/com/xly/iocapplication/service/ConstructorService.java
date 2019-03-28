package com.xly.iocapplication.service;

import com.xly.iocapplication.dao.IndexDAO;

/**
 * @author yxl
 * @since 2019/3/28
 */
public class ConstructorService {
    private IndexDAO indexDAO;
    public ConstructorService(IndexDAO indexDAO){
        this.indexDAO = indexDAO;
    }
    public void query(){
        StringBuilder sb = new StringBuilder();
        sb.append("ConstructorService#query");
        sb.append("|--");
        sb.append(indexDAO.save());
        System.out.println(sb.toString());
    }
}
