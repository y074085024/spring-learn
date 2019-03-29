package com.xly.iocapplication.xml;

import com.xly.iocapplication.dao.IndexDAO;

/**
 * @author yxl
 * @since 2019/3/29
 */
public class AutowireDAOImpl implements IndexDAO {

    @Override
    public String save() {
        return "AutowireDAOImpl#save";
    }
}
