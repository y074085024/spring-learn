package com.xly.iocapplication.javaconfig;

import com.xly.iocapplication.dao.IndexDAO;
import org.springframework.stereotype.Repository;

/**
 * @author yxl
 * @since 2019/3/28
 */
@Repository
public class JavaconfigIndexDAOImpl implements IndexDAO {
    @Override
    public String save() {
        return "JavaconfigIndexDAOImpl#save";
    }
}
