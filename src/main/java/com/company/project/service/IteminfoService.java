package com.company.project.service;
import com.company.project.Bean.Iteminfo;
import com.company.project.core.Service;


/**
 * Created by CodeGenerator on 2020/12/16.
 */
public interface IteminfoService extends Service<Iteminfo> {
    Iteminfo selectByid(String id);
}
