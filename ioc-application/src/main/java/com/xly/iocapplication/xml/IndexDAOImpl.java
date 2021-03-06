package com.xly.iocapplication.xml;

import com.xly.iocapplication.dao.IndexDAO;

import java.util.Properties;

/**
 * @author yxl
 * @since 2019/3/28
 */
public class IndexDAOImpl implements IndexDAO {
    private String str;
    private String pStr;

    public void setpStr(String pStr) {
        this.pStr = pStr;
    }

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
