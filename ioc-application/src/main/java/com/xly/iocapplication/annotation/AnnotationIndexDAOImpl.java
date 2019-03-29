package com.xly.iocapplication.annotation;

import com.xly.iocapplication.dao.IndexDAO;
import org.springframework.stereotype.Repository;

/**
 * @author yxl
 * @since 2019/3/28
 */
@Repository
public class AnnotationIndexDAOImpl implements IndexDAO {
    @Override
    public String save() {
        return "AnnotationIndexDAOImpl#save";
    }
}
