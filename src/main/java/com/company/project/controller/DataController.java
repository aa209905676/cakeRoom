package com.company.project.controller;

import com.alibaba.fastjson.JSONObject;
import com.company.project.model.HomeData;
import com.company.project.model.HomeShow;
import com.company.project.service.HomeDataService;

import com.company.project.service.HomeShowService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin
@Api("详情页")
public class DataController {

   @Resource
    private HomeDataService homeDataService;

    @Resource
    private HomeShowService homeShowService;

    /**
     *首页数据
     * @description 首页数据
     * @param type
     * @param page
     * @return JSONObject
     */
    @ApiImplicitParam(type = "type",required = true )
    @ApiOperation(value = "详情页展示")
    @GetMapping(value = "/home/data",produces = "application/json;charset=UTF-8")
    public JSONObject getData(@ApiParam("类型") @RequestParam("type") String type,
                              @ApiParam("页数") @RequestParam("page") Integer page){
        JSONObject jsonObject = new JSONObject();
        HashMap<Object, Object> data = new HashMap<>();
        ArrayList<Object> list = new ArrayList<>();

//                多条件查询
               Condition showexample = new Condition(HomeShow.class);
               Example.Criteria showexampleCriteria = showexample.createCriteria();
               showexampleCriteria.andEqualTo("type",type);
               showexampleCriteria.andEqualTo("page",page);
               List<HomeData> homeDataServiceByCondition = homeDataService.findByCondition(showexample);

               Condition homeExample = new Condition(HomeData.class);
               Example.Criteria homeExampleCriteria = homeExample.createCriteria();
               homeExampleCriteria.andEqualTo("type",type);
               homeExampleCriteria.andEqualTo("page",page);
               List<HomeShow> homeShowServiceByCondition = homeShowService.findByCondition(homeExample);



               for (int i = 0; i < homeDataServiceByCondition.size(); i++) {
                   // show
                   HashMap<String, Object> map = new HashMap<>();
                   HashMap<String, Object> show = new HashMap<>();
                   show.put("img",homeShowServiceByCondition.get(i).getImg());
                   show.put("page",homeShowServiceByCondition.get(i).getPage());
                   show.put("type",homeShowServiceByCondition.get(i).getType());
                   map.put("show",show);

                   map.put("title",homeDataServiceByCondition.get(i).getTitle());
                   map.put("iid",homeDataServiceByCondition.get(i).getIid());
                   map.put("price",homeDataServiceByCondition.get(i).getPrice()+".00");
                   map.put("cfav",homeDataServiceByCondition.get(i).getCfav());
                   list.add(i,map);
               }
               data.put("list",list);
               jsonObject.put("data",data);

        data.put("list",list);
        jsonObject.put("data",data);
        return jsonObject;
    }

}
