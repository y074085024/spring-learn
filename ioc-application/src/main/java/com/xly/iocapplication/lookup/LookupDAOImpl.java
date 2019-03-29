package com.xly.iocapplication.lookup;

import com.xly.iocapplication.dao.IndexDAO;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * @author yxl
 * @since 2019/3/29
 */
@Repository
@Scope("prototype")
public class LookupDAOImpl implements IndexDAO {
    @Override
    public String save() {
        return "LookupDAOImpl#this.hashcode="+this.hashCode();
    }
}
