package com.company.project.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@CrossOrigin
public class Recommend {
    /**
     * 详情页 更多推荐
     * @return JSONObject
     */
    @GetMapping(value = "/recommend",produces = "application/json;charset=UTF-8")
    public JSONObject getRecommend(){
        JSONObject jsonObject = new JSONObject();
        HashMap<Object, Object> data = new HashMap<>();
        ArrayList<Object> list = new ArrayList<>();

       // list
        // Listmap
        HashMap<Object, Object> listMap = new HashMap<>();
        listMap.put("image","https://img.dangao.com/proimgs/C-777205minfo1.jpg");
        listMap.put("title","玫瑰色恋人 编号：777205");
        listMap.put("cfav","163");
        listMap.put("price","169.00");
        list.add(0,listMap);

        // Listmap1
        HashMap<Object, Object> listMap1 = new HashMap<>();
        listMap1.put("image","https://img.dangao.com/proimgs/777202175228.jpg");
        listMap1.put("title","美好祝愿  编号：777202");
        listMap1.put("cfav","126");
        listMap1.put("price","119.00");
        list.add(1,listMap1);

        // Listmap2
        HashMap<Object, Object> listMap2 = new HashMap<>();
        listMap2.put("image","https://img.dangao.com/proimgs/701736175228.jpg");
        listMap2.put("title","蘑菇精灵 编号：777231");
        listMap.put("cfav","163");
        listMap.put("price","169.00");
        list.add(2,listMap2);

        // Listmap3
        HashMap<Object, Object> listMap3 = new HashMap<>();
        listMap3.put("image","https://img.dangao.com/proimgs/701018175228.png");
        listMap3.put("title","粉红宝贝  编号：701018");
        list.add(3,listMap3);

        // Listmap3
        HashMap<Object, Object> listMap4 = new HashMap<>();
        listMap4.put("image","https://img.dangao.com/proimgs/702002175228.jpg");
        listMap4.put("title","魔法森林  编号：702002");
        list.add(4,listMap4);


        // Listmap5
        HashMap<Object, Object> listMap5 = new HashMap<>();
        listMap5.put("image","https://img.dangao.com/proimgs/702001175228.jpg");
        listMap5.put("title","Mr.Right  编号：702001");
        list.add(5,listMap5);
        
        // Listmap6
        HashMap<Object, Object> listMap6 = new HashMap<>();
        listMap6.put("image","https://img.dangao.com/proimgs/701650175228.png");
        listMap6.put("title","花漾  编号：701650");
        list.add(6,listMap6);
        
        // Listmap7
        HashMap<Object, Object> listMap7 = new HashMap<>();
        listMap7.put("image","https://img.dangao.com/proimgs/777319175228.jpg");
        listMap7.put("title","小王子  编号：777319");
        list.add(7,listMap7);
        
        // Listmap8
        HashMap<Object, Object> listMap8 = new HashMap<>();
        listMap8.put("image","https://img.dangao.com/proimgs/701101175228.png");
        listMap8.put("title","幸福不灭  编号：701101");
        list.add(8,listMap8);
        
        // Listmap9
        HashMap<Object, Object> listMap9 = new HashMap<>();
        listMap9.put("image","https://img.dangao.com/proimgs/777310175228.jpg");
        listMap9.put("title","奥利奥芝士  编号：777310");
        list.add(9,listMap9);


        data.put("list",list);
        jsonObject.put("data",data);
        return jsonObject;

    }
}
