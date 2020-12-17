package com.company.project.service.impl;

import com.company.project.dao.IteminfoMapper;
import com.company.project.Bean.Iteminfo;
import com.company.project.service.IteminfoService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/12/16.
 */
@Service
@Transactional
public class IteminfoServiceImpl extends AbstractService<Iteminfo> implements IteminfoService {
    @Resource
    private IteminfoMapper iteminfoMapper;

    @Override
    public Iteminfo selectByid(String id) {
        Iteminfo iteminfo = iteminfoMapper.selectByid(id);
        return iteminfo;
    }

}
