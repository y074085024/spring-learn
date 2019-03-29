package com.xly.iocapplication.lookup;

import com.xly.iocapplication.dao.IndexDAO;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yxl
 * @since 2019/3/29
 */
@Service
public abstract class LookupService {
    @Lookup
    protected abstract IndexDAO getIndexDAO();
    public void query(){
        StringBuilder sb = new StringBuilder();
        sb.append("LookupService#query-this.hashcode="+this.hashCode());
        sb.append("|--");
        sb.append(getIndexDAO().save());
        System.out.println(sb.toString());
    }
}
