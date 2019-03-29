package com.xly.iocapplication.xml;

import com.xly.iocapplication.dao.IndexDAO;

/**
 * @author yxl
 * @since 2019/3/29
 */
public class AutowireService {
    private IndexDAO indexDAO;
    public void query(){
        StringBuilder sb = new StringBuilder();
        sb.append("AutowireService#query");
        sb.append("|--");
        sb.append(indexDAO.save());
        System.out.println(sb.toString());
    }

    public void setIndexDAO(IndexDAO indexDAO) {
        this.indexDAO = indexDAO;
    }
}
