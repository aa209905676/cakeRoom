package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.Bean.Iteminfo;

public interface IteminfoMapper extends Mapper<Iteminfo> {
    Iteminfo selectByid(String id);
}