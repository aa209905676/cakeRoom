package com.company.project.controller;
import com.alibaba.fastjson.JSONObject;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.Bean.User;
import com.company.project.Bean.banner;
import com.company.project.Bean.context;
import com.company.project.Bean.recommend;
import com.company.project.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
* Created by CodeGenerator on 2020/12/13.
*/
@RestController
@CrossOrigin
public class HomeController {
    @Resource
    private UserService userService;
    banner banner1=   new banner();
    context context1 =   new context();
    recommend recommend1 =   new recommend();
    recommend recommend2 =   new recommend();
    recommend recommend3 =   new recommend();

    /**
     * 首页导航栏
     * @return JSONObject
     */
    @GetMapping(value = "/home/multidata" , produces = "application/json;charset=UTF-8")
    public JSONObject test(){
        JSONObject jsonObject = new JSONObject();
        HashMap<Object, Object> data = new HashMap<>();
   // banner
        banner1.isEnd="true";
        banner1.nextPage="1";
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("acm", "3.mce.2_10_1jhwa.43542.0.ccy5br4OlfK0Q.pos_0-m_454801-sd_119");
        map1.put("height", 390);
        map1.put("height923", 390);
        map1.put("image", "https://jihu-file.oss-cn-hongkong.aliyuncs.com/cake/0c4a0aaf9f6c0ca6ff3873eebdf2b7f.png");
        map1.put("image923", "https://s10.mogucdn.com/mlcdn/c45406/180926_7d5c521e0aa3h38786lkakebkjlh8_750x390.jpg");
        map1.put("link", "http://www.rabbitbake.com/portfolio/fruit-tart");
        map1.put("title", "焕新女装节");
        map1.put("width", 750);
        map1.put("width923", 750);

//        map.put("0",map1);

        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("acm", "3.mce.2_10_1jhwa.43542.0.ccy5br4OlfK0Q.pos_0-m_454801-sd_119");
        map2.put("height", 390);
        map2.put("height923", 390);
        map2.put("image", "https://jihu-file.oss-cn-hongkong.aliyuncs.com/cake/49206e2218a6a4b85608a7192742757.png");
        map2.put("image923", "https://s10.mogucdn.com/mlcdn/c45406/180926_7d5c521e0aa3h38786lkakebkjlh8_750x390.jpg");
        map2.put("link", "http://www.rabbitbake.com/portfolio/fruit-tart");
        map2.put("title", "焕新女装节");
        map2.put("width", 750);
        map2.put("width923", 7500);

//        map.put("1",map2);

        HashMap<String, Object> map3 = new HashMap<>();
        map3.put("acm", "3.mce.2_10_1jhwa.43542.0.ccy5br4OlfK0Q.pos_0-m_454801-sd_119");
        map3.put("height", 390);
        map3.put("height923", 390);
        map3.put("image", "https://jihu-file.oss-cn-hongkong.aliyuncs.com/cake/60c5ea81f8871b2dffa40a9ebb11489.png");
        map3.put("image923", "https://s10.mogucdn.com/mlcdn/c45406/180926_7d5c521e0aa3h38786lkakebkjlh8_750x390.jpg");
        map3.put("link", "http://www.rabbitbake.com/portfolio/fruit-tart");
        map3.put("title", "焕新女装节");
        map3.put("width", 750);
        map3.put("width923", 7500);

        HashMap<String, Object> map4 = new HashMap<>();
        map4.put("acm", "4.mce.2_10_1jhwa.44542.0.ccy5br4OlfK0Q.pos_0-m_454801-sd_119");
        map4.put("height", 490);
        map4.put("height924", 490);
        map4.put("image", "https://jihu-file.oss-cn-hongkong.aliyuncs.com/cake/a140871a3264aa0553b24194eae67cc.png");
        map4.put("image924", "https://s10.mogucdn.com/mlcdn/c45406/180926_7d5c521e0aa4h48786lkakebkjlh8_750x490.jpg");
        map4.put("link", "http://www.rabbitbake.com/portfolio/fruit-tart");
        map4.put("title", "焕新女装节");
        map4.put("width", 750);
        map4.put("width924", 7500);

//        map.put("2",map3);
        ArrayList<Object> list = new ArrayList<>();
        list.add(0,map1);
        list.add(1,map2);
        list.add(2,map3);
        list.add(3,map4);
        banner1.list=list;


        // recommend1
        recommend1.isEnd = "true";
        recommend1.nextPage = "1";

        HashMap<String, Object> recommendMap = new HashMap<>();
        recommendMap.put("acm","3.mce.2_10_1dggc.13730.0.ccy5br4OlfK0U.pos_0-m_313898-sd_119");
        recommendMap.put("image","http://static.tuweia.cn/images/template16/ori/14071404488465_s.jpg?imageMogr2/thumbnail/!320x320r/crop/320x320/quality/90");
        recommendMap.put("link","http://www.rabbitbake.com/portfolio/fruit-tart");
        recommendMap.put("sort","1");
        recommendMap.put("title","黑夜玫橘");


        HashMap<String, Object> recommendMap1 = new HashMap<>();
        recommendMap1.put("acm","3.mce.2_10_1dggc.13730.0.ccy5br4OlfK0U.pos_0-m_313898-sd_119");
        recommendMap1.put("image","http://static.tuweia.cn/images/template16/ori/14071398037594_s.jpg?imageMogr2/thumbnail/!320x320r/crop/320x320/quality/90");
        recommendMap1.put("link","http://www.rabbitbake.com/portfolio/fruit-tart");
        recommendMap1.put("sort","2");
        recommendMap1.put("title","卡布奇诺");

        HashMap<String, Object> recommendMap2 = new HashMap<>();
        recommendMap2.put("acm","3.mce.2_10_1dggc.13730.0.ccy5br4OlfK0U.pos_0-m_313898-sd_119");
        recommendMap2.put("image","http://static.tuweia.cn/images/template16/ori/14071404773983_s.jpg");
        recommendMap2.put("link","http://www.rabbitbake.com/portfolio/fruit-tart");
        recommendMap2.put("sort","3");
        recommendMap2.put("title","芒果慕斯");
        HashMap<String, Object> recommendMap3 = new HashMap<>();
        recommendMap3.put("acm","3.mce.2_10_1dggc.13730.0.ccy5br4OlfK0U.pos_0-m_313898-sd_119");
        recommendMap3.put("image","http://static.tuweia.cn/images/template16/ori/14071405271715_s.jpg?imageMogr2/thumbnail/!320x320r/crop/320x320/quality/90");
        recommendMap3.put("link","http://www.rabbitbake.com/portfolio/fruit-tart");
        recommendMap3.put("sort","4");
        recommendMap3.put("title","芋泥蛋糕");
        HashMap<String, Object> recommendMap4 = new HashMap<>();


        ArrayList<Object> Recommendlist = new ArrayList<>();
        Recommendlist.add(0,recommendMap);
        Recommendlist.add(1,recommendMap1);
        Recommendlist.add(2,recommendMap2);
        Recommendlist.add(3,recommendMap3);
        recommend1.list=Recommendlist;

        // recommend2
        // ------------------------------
        recommend2.isEnd = "true";
        recommend2.nextPage = "1";

        HashMap<String, Object> recommend2Map = new HashMap<>();
        recommend2Map.put("acm","3.mce.2_10_1dggc.13730.0.ccy5br4OlfK0U.pos_0-m_313898-sd_119");
        recommend2Map.put("image","http://static.tuweia.cn/images/template16/ori/14071405468370_s.jpg?imageMogr2/thumbnail/!320x320r/crop/320x320/quality/90");
        recommend2Map.put("link","http://www.rabbitbake.com/portfolio/fruit-tart");
        recommend2Map.put("sort","1");
        recommend2Map.put("title","夏夜星空");


        HashMap<String, Object> recommend2Map1 = new HashMap<>();
        recommend2Map1.put("acm","3.mce.2_10_1dggc.13730.0.ccy5br4OlfK0U.pos_0-m_313898-sd_119");
        recommend2Map1.put("image","https://mall.christine.com.cn/public/images/b8/09/47/1ba872c6706c72da3de890cdb50b15ae2cc6694e.jpg?1548237096#h");
        recommend2Map1.put("link","http://www.rabbitbake.com/portfolio/fruit-tart");
        recommend2Map1.put("sort","2");
        recommend2Map1.put("title","仲夏之梦");

        HashMap<String, Object> recommend2Map2 = new HashMap<>();
        recommend2Map2.put("acm","3.mce.2_10_1dggc.13730.0.ccy5br4OlfK0U.pos_0-m_313898-sd_119");
        recommend2Map2.put("image","https://mall.christine.com.cn/public/images/0d/7c/89/9866772a65f291e2c99094fc4bd5bfc6baf4e4a4.jpg?1548921156#h");
        recommend2Map2.put("link","http://www.rabbitbake.com/portfolio/fruit-tart");
        recommend2Map2.put("sort","3");
        recommend2Map2.put("title","朗姆慕斯");
        HashMap<String, Object> recommend2Map3 = new HashMap<>();
        recommend2Map3.put("acm","3.mce.2_10_1dggc.13730.0.ccy5br4OlfK0U.pos_0-m_313898-sd_119");
        recommend2Map3.put("image","https://mall.christine.com.cn/public/images/74/15/3c/ee7b46ebf0ac4c9e337a4a73c4bd6513ff13b12f.jpg?1548237891#h");
        recommend2Map3.put("link","http://www.rabbitbake.com/portfolio/fruit-tart");
        recommend2Map3.put("sort","4");
        recommend2Map3.put("title","萌萌小熊");


        ArrayList<Object> Recommend2list = new ArrayList<>();
        Recommend2list.add(0,recommend2Map);
        Recommend2list.add(1,recommend2Map1);
        Recommend2list.add(2,recommend2Map2);
        Recommend2list.add(3,recommend2Map3);
        recommend2.list=Recommend2list;

        // recommend3
  // -------------------------------------------
        recommend3.isEnd = "true";
        recommend3.nextPage = "1";

        HashMap<String, Object> recommend3Map = new HashMap<>();
        recommend3Map.put("acm","3.mce.2_10_1dggc.13730.0.ccy5br4OlfK0U.pos_0-m_313898-sd_119");
        recommend3Map.put("image","https://mall.christine.com.cn/public/images/1a/41/db/aac387c56b4aa58aa63602864b3b7c3cfa487531.jpg?1548050356#h");
        recommend3Map.put("link","http://www.rabbitbake.com/portfolio/fruit-tart");
        recommend3Map.put("sort","1");
        recommend3Map.put("title","今日优惠");


        HashMap<String, Object> recommend3Map1 = new HashMap<>();
        recommend3Map1.put("acm","3.mce.2_10_1dggc.13730.0.ccy5br4OlfK0U.pos_0-m_313898-sd_119");
        recommend3Map1.put("image","https://mall.christine.com.cn/public/images/00/fe/98/d32fc662d9dc02002b3eb8764662416c3ef79170.jpg?1548050067#h");
        recommend3Map1.put("link","http://www.rabbitbake.com/portfolio/fruit-tart");
        recommend3Map1.put("sort","2");
        recommend3Map1.put("title","满减折扣");

        HashMap<String, Object> recommend3Map2 = new HashMap<>();
        recommend3Map2.put("acm","3.mce.2_10_1dggc.13730.0.ccy5br4OlfK0U.pos_0-m_313898-sd_119");
        recommend3Map2.put("image","https://mall.christine.com.cn/public/images/09/27/d8/f59b6f2849fda2fd5a4a85d79eedfda0973ad4fc.jpg?1548050575#h");
        recommend3Map2.put("link","http://www.rabbitbake.com/portfolio/fruit-tart");
        recommend3Map2.put("sort","3");
        recommend3Map2.put("title","会员专享");
        HashMap<String, Object> recommend3Map3 = new HashMap<>();
        recommend3Map3.put("acm","3.mce.2_10_1dggc.13730.0.ccy5br4OlfK0U.pos_0-m_313898-sd_119");
        recommend3Map3.put("image","https://mall.christine.com.cn/public/images/0d/7c/89/9866772a65f291e2c99094fc4bd5bfc6baf4e4a4.jpg?1548921156#h");
        recommend3Map3.put("link","http://www.rabbitbake.com/portfolio/fruit-tart");
        recommend3Map3.put("sort","4");
        recommend3Map3.put("title","最新上新");


        ArrayList<Object> Recommend3list = new ArrayList<>();
        Recommend3list.add(0,recommend3Map);
        Recommend3list.add(1,recommend3Map1);
        Recommend3list.add(2,recommend3Map2);
        Recommend3list.add(3,recommend3Map3);
        recommend3.list=Recommend3list;
        // -------------

        data.put("banner",banner1);
        data.put("recommend",recommend1);
        data.put("recommend1",recommend2);
        data.put("recommend2",recommend3);
        jsonObject.put("data",data);
        return jsonObject;

    }

    @PostMapping("/add")
    public Result add(User user) {
        userService.save(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(User user) {
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        User user = userService.findById(id);
        return ResultGenerator.genSuccessResult(user);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
