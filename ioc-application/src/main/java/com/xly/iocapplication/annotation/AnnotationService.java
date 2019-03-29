package com.xly.iocapplication.annotation;

import com.xly.iocapplication.dao.IndexDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yxl
 * @since 2019/3/28
 */
@Service
public class AnnotationService {
    // @Resource
    private IndexDAO indexDAO;
    public void query(){
        StringBuilder sb = new StringBuilder();
        sb.append("AnnotationService#query");
        sb.append("|--");
        sb.append(indexDAO.save());
        System.out.println(sb.toString());
    }
    @Resource
    public void setIndexDAO(IndexDAO indexDAO) {
        System.out.println("setIndexDAO");
        this.indexDAO = indexDAO;
    }
}
