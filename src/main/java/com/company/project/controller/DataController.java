package com.company.project.controller;

import com.alibaba.fastjson.JSONObject;
import io.github.yedaxia.apidocs.ApiDoc;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
@RestController
@CrossOrigin
@Api(tags = "详情页")
public class DataController {


    /**
     *首页数据
     * @description 首页数据
     * @param type
     * @param page
     * @return JSONObject
     */
    @ApiOperation(value = "home/data 首页数据库展示",notes = "我是傻逼")
    @GetMapping(value = "/home/data",produces = "application/json;charset=UTF-8")
    public JSONObject getData(@ApiParam("类型") @RequestParam("type") String type,
                              @ApiParam("页数") @RequestParam("page") Integer page){
        JSONObject jsonObject = new JSONObject();
        HashMap<Object, Object> data = new HashMap<>();
        ArrayList<Object> list = new ArrayList<>();
        if (type.equals("pop")){


            // show
            HashMap<String, Object> map = new HashMap<>();
            HashMap<String, Object> show = new HashMap<>();
            show.put("img","https://img.dangao.com/proimgs/C-777205minfo1.jpg");
            show.put("page",page);
            show.put("type",type);
            map.put("show",show);
            map.put("title","玫瑰色恋人 编号：777205");
            map.put("iid","001");
            map.put("price","119.00");
            map.put("cfav","126");
            list.add(0,map);



            // show1
            HashMap<String, Object> map1 = new HashMap<>();
            HashMap<String, Object> show1 = new HashMap<>();
            show1.put("img","https://img.dangao.com/proimgs/721006175228.jpg");
            show1.put("page",page);
            show1.put("type",type);
            map1.put("show",show1);
            map1.put("title","女神小七  编号：721006");
            map1.put("price","119.00");
            map1.put("cfav","126");
            map1.put("iid","002");
            list.add(1,map1);

            // show2

            HashMap<String, Object> map2 = new HashMap<>();
            HashMap<String, Object> show2 = new HashMap<>();
            show2.put("img","https://img.dangao.com/proimgs/777307175228.jpg");
            show2.put("page",page);
            show2.put("type",type);
            map2.put("show",show2);
            map2.put("title","塞纳河畔  编号：777307");
            map2.put("price","119.00");
            map2.put("cfav","126");
            map2.put("iid","003");
            list.add(2,map2);



            // show3
            HashMap<String, Object> map3 = new HashMap<>();
            HashMap<String, Object> show3 = new HashMap<>();
            show3.put("img","https://img.dangao.com/proimgs/702002175228.jpg");
            show3.put("page",page);
            show3.put("type",type);
            map3.put("show",show3);
            map3.put("title","魔法森林  编号：702002");
            map3.put("price","119.00");
            map3.put("cfav","126");
            map3.put("iid","004");
            list.add(3,map3);

            // show4
            HashMap<String, Object> map4 = new HashMap<>();
            HashMap<String, Object> show4 = new HashMap<>();
            show4.put("img","https://img.dangao.com/proimgs/777211175228.png");
            show4.put("page",page);
            show4.put("type",type);
            map4.put("show",show4);
            map4.put("iid","005");
            map4.put("title","玫瑰之约 编号：777348");
            map4.put("price","119.00");
            map4.put("cfav","126");
            list.add(4,map4);

            // show5
            HashMap<String, Object> map5 = new HashMap<>();
            HashMap<String, Object> show5 = new HashMap<>();
            show5.put("img","https://img.dangao.com/proimgs/703010175228.png");
            show5.put("page",page);
            show5.put("type",type);
            map5.put("iid","006");
            map5.put("show",show5);
            map5.put("title","蓝色爱恋  编号：703010");
            map5.put("price","199.00");
            map5.put("cfav","126");
            list.add(5,map5);

            // show6
            HashMap<String, Object> map6 = new HashMap<>();
            HashMap<String, Object> show6 = new HashMap<>();
            show6.put("img","https://img.dangao.com/proimgs/777205175228.jpg");
            show6.put("page",page);
            show6.put("type",type);
            map6.put("iid","007");
            map6.put("show",show6);
            map6.put("title","微微一笑  编号：777106");
            map6.put("price","119.00");
            map6.put("cfav","126");
            list.add(6,map6);

            // show7
            HashMap<String, Object> map7 = new HashMap<>();
            HashMap<String, Object> show7 = new HashMap<>();
            show7.put("img","https://img.dangao.com/proimgs/777201175228.jpg");
            show7.put("page",page);
            show7.put("type",type);
            map7.put("show",show7);
            map7.put("iid","008");
            map7.put("title","愿得一人心  编号：777201");
            map7.put("price","119.00");
            map7.put("cfav","126");
            list.add(7,map7);




            data.put("list",list);
            jsonObject.put("data",data);
        }
        else if (type.equals("new")){

            // show
            HashMap<String, Object> map  = new HashMap<>();
            HashMap<String, Object> show  = new HashMap<>();
            show.put("img","https://img.dangao.com/proimgs/721006175228.jpg");
            show .put("page",page);
            show .put("type",type);
            map .put("show",show );
            map .put("title","女神小七  编号：72 006");
            map .put("price","  9.00");
            map .put("cfav"," 26");
            map .put("iid","002");
            list.add(map );


            // show1
            HashMap<String, Object> map1 = new HashMap<>();
            HashMap<String, Object> show1 = new HashMap<>();
            show1.put("img","https://img.dangao.com/proimgs/777211175228.png");
            show1.put("page",page);
            show1.put("type",type);
            map1.put("show",show1);
            map1.put("iid","005");
            map1.put("title","玫瑰之约 编号：777318");
            map1.put("price","119.00");
            map1.put("cfav","126");
            list.add(1,map1);

            // show2
            HashMap<String, Object> map2 = new HashMap<>();
            HashMap<String, Object> show2 = new HashMap<>();
            show2.put("img","https://img.dangao.com/proimgs/777106175228.jpg");
            show2.put("page",page);
            show2.put("type",type);
            map2.put("iid","002");
            map2.put("show",show2);
            map2.put("title","微微一笑  编号：777102");
            map2.put("price","119.00");
            map2.put("cfav","122");
            list.add(2,map2);

            // show3
            HashMap<String, Object> map3 = new HashMap<>();
            HashMap<String, Object> show3 = new HashMap<>();
            show3.put("img","https://img.dangao.com/proimgs/C-731003601.jpg");
            show3.put("page",page);
            show3.put("type",type);
            map3.put("iid","003");
            map3.put("show",show3);
            map3.put("title","爱之誓言编号：77738");
            map3.put("price","119.00");
            map3.put("cfav","133");
            list.add(3,map3);
        }
        else if (type.equals("sell")){
            // show
            HashMap<String, Object> map = new HashMap<>();
            HashMap<String, Object> show = new HashMap<>();
            show.put("img","https://img.dangao.com/proimgs/777211175228.png");
            show.put("page",page);
            show.put("type",type);
            map.put("show",show);
            map.put("iid","001");
            map.put("title","玫瑰之约 编号：77738");
            map.put("price","9.00");
            map.put("cfav","26");
            list.add(0,map);

            // show1
            HashMap<String, Object> map1  = new HashMap<>();
            HashMap<String, Object> show1 = new HashMap<>();
            show1.put("img","https://img.dangao.com/proimgs/C-731003601.jpg");
            show1.put("page",page);
            show1.put("type",type);
            map1.put("show",show1);
            map1.put("title","爱之誓言编号：77738  ");
            map1.put("price","￥189~259");
            map1.put("cfav","  26");
            list.add( 1,map1);
        }

        data.put("list",list);
        jsonObject.put("data",data);
        return jsonObject;
    }

}
