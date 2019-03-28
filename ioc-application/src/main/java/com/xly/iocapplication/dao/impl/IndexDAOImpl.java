package com.xly.iocapplication.dao.impl;

import com.xly.iocapplication.dao.IndexDAO;

import java.util.Properties;

/**
 * @author yxl
 * @since 2019/3/28
 */
public class IndexDAOImpl implements IndexDAO {
    private String str;
    private Properties prop;
    @Override
    public String save() {
        return "IndexDAOImpl#save"+"("+str+prop.get("key1")+")";
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }
}
