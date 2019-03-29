package com.xly.iocapplication.xml;

import com.xly.iocapplication.dao.IndexDAO;

/**
 * @author yxl
 * @since 2019/3/28
 */
public class SetterService {
    private IndexDAO indexDAO;
    public void query(){
        StringBuilder sb = new StringBuilder();
        sb.append("SetterService#query");
        sb.append("|--");
        sb.append(indexDAO.save());
        System.out.println(sb.toString());
    }

    public void setIndexDAO(IndexDAO indexDAO) {
        this.indexDAO = indexDAO;
    }
}
