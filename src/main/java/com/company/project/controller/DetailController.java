package com.company.project.controller;

import com.alibaba.fastjson.JSONObject;
import com.company.project.Bean.Iteminfo;
import com.company.project.service.IteminfoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;

@RestController
@CrossOrigin
public class DetailController {
    @Resource
    private IteminfoService iteminfoService;

    /**
     * 详情页
     * @param iid
     * @return JSONObject
     */
    @GetMapping(value = "/detail",produces = "application/json;charset=UTF-8")
    public JSONObject getData(@RequestParam("iid") String  iid){
        JSONObject jsonObject = new JSONObject();
        HashMap<Object, Object> data = new HashMap<>();
        HashMap<Object, Object> map = new HashMap<>();
        HashMap<Object, Object> result = new HashMap<>();
        HashMap<Object, Object> detailInfo = new HashMap<>();
        HashMap<Object, Object> itemInfo = new HashMap<>();
        HashMap<Object, Object> itemParams = new HashMap<>();
        HashMap<Object, Object> rule = new HashMap<>();
        HashMap<Object, Object> rate = new HashMap<>();

        ArrayList<Object> detailImage = new ArrayList<>();
        ArrayList<Object> list = new ArrayList<>();
        ArrayList<Object> imageList = new ArrayList<>();
        ArrayList<Object> topImages = new ArrayList<>();
        ArrayList<Object> columns = new ArrayList<>();
        ArrayList<Object> tables = new ArrayList<>();
        ArrayList<Object> rateList = new ArrayList<>();

        if (iid.equals("001")){

//            dataInfo

            imageList.add(0,"https://img.dangao.com/proimgs/C-777105desB2.jpg");
            imageList.add(1,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_baozhang.jpg");
            imageList.add(2,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_hezi.jpg");

            map.put("list",imageList);
            detailImage.add(0,map);
            detailInfo.put("detailImage",detailImage);



//           itemInfo
           topImages.add(0,"https://img.dangao.com/proimgs/C-777205minfo1.jpg");
           topImages.add(0,"https://img.dangao.com/proimgs/C-777205minfo2.jpg");
           topImages.add(0,"https://img.dangao.com/proimgs/C-777205minfo3.jpg");
           itemInfo.put("topImages",topImages);
           Iteminfo  iteminfos =  iteminfoService.selectByid(iid);
           itemInfo.put("title", iteminfos.getTitle());
           itemInfo.put("subtitle",iteminfos.getSubtitle());
           itemInfo.put("desc",iteminfos.getDescr());
           itemInfo.put("price",iteminfos.getPrice());
           itemInfo.put("oldPrice",iteminfos.getOldprice());
           itemInfo.put("discountDesc",iteminfos.getDiscountdesc());


           // columns
            columns.add(0,"已售426件");
            columns.add(1,"全国配送顺丰速递");
            columns.add(2,"配保温袋保温箱");



            // itemParam
            // tables
            ArrayList<Object> tables1 = new ArrayList<>();



            ArrayList<Object> tables1List = new ArrayList<>();
            tables1List.add(0,"材料:");
            tables1List.add(1,"新鲜优质淡奶油、新鲜玫瑰花瓣围边");

            ArrayList<Object> tables1List1 = new ArrayList<>();
            tables1List1.add(0,"祝愿:");
            tables1List1.add(1,"就这样牵着你的手，十指相扣走过春秋，幸福快乐长长久久。");

            ArrayList<Object> tables1List2 = new ArrayList<>();
            tables1List2.add(0,"保存:");
            tables1List2.add(1,"0-4°C保存1天，4小时内5°C食用口感最佳。");

            tables1.add(0,tables1List);
            tables1.add(1,tables1List1);
            tables1.add(2,tables1List2);

            tables.add(0,tables1);

            rule.put("tables",tables);
            itemParams.put("rule",rule);


            // rate


            // rateMap
            HashMap<Object, Object> rateMap = new HashMap<>();
            rateMap.put("avatar","//s3.mogucdn.com/p2/161214/103488673_8ff131b8g07810e345268cgcda6ef_140x141.png");
            rateMap.put("uname","棒棒糖闯江湖");
            rateMap.put("created",1602185460);
            rateMap.put("content","刚好合适，物美价廉，衣服面料很好，穿着很舒服，版型也好看，非常棒。");
            rateList.add(0,rateMap);
            rate.put("list",rateList);

            // rateMap1
            HashMap<Object, Object> rateMap1 = new HashMap<>();
            rateMap1.put("avatar","//s5.mogucdn.com/p2/161214/103488673_8da6lhkf9a5h32ei6bd297523c35d_140x140.png");
            rateMap1.put("uname","SeaSvan");
            rateMap1.put("created",1602148380);
            rateMap1.put("content","蛋糕很好吃，下次还会继续回购。");
            rateList.add(1,rateMap1);
            rate.put("list",rateList);

         // result

            result.put("itemParams",itemParams);
            result.put("rate",rate);
            result.put("detailInfo",detailInfo);
            result.put("itemInfo",itemInfo);
            result.put("columns",columns);

            jsonObject.put("result",result);
            jsonObject.put("iid","001");
        }

//        if (iid.equals("002")){
//
////            dataInfo
//            imageList.add(0,"https://img.dangao.com/proimgs/C-777105desB2.jpg");
//            imageList.add(1,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_baozhang.jpg");
//            imageList.add(2,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_hezi.jpg");
//            map.put("list",imageList);
//            list.add(0,map);
//            detailImage.add(list);
//            detailInfo.put("detailImage",detailImage);
//
//
//
////           itemInfo
//            topImages.add(0,"https://img.dangao.com/proimgs/C-7210064201.jpg");
//            topImages.add(0,"https://img.dangao.com/proimgs/C-7210064202.jpg");
//            topImages.add(0,"https://img.dangao.com/proimgs/C-7210064203.jpg");
//            itemInfo.put("topImages",topImages);
//            itemInfo.put("title","女神小七  编号：721006");
//            itemInfo.put("subtitle","对你的爱，远不止这些");
//            itemInfo.put("desc","不论你何时到来都热情迎接， 这个城市或许就不再那么陌生。");
//            itemInfo.put("price","¥199.00 ~ ¥389.00 ");
//            itemInfo.put("oldPrice","¥188.00 ");
//            itemInfo.put("discountDesc","新款");
//
//
//            // columns
//            columns.add(0,"已售489件");
//            columns.add(1,"全国配送顺丰速递");
//            columns.add(2,"配保温袋保温箱");
//
//
//            // itemParam
//            // tables
//            ArrayList<Object> tables1 = new ArrayList<>();
//
//
//
//            ArrayList<Object> tables1List = new ArrayList<>();
//            tables1List.add(0,"材料:");
//            tables1List.add(1,"新鲜优质淡奶油、新鲜玫瑰花瓣围边");
//
//            ArrayList<Object> tables1List1 = new ArrayList<>();
//            tables1List1.add(0,"祝愿:");
//            tables1List1.add(1,"就这样牵着你的手，十指相扣走过春秋，幸福快乐长长久久。");
//
//            ArrayList<Object> tables1List2 = new ArrayList<>();
//            tables1List2.add(0,"保存:");
//            tables1List2.add(1,"0-4°C保存1天，4小时内5°C食用口感最佳。");
//
//            tables1.add(0,tables1List);
//            tables1.add(1,tables1List1);
//            tables1.add(2,tables1List2);
//
//            tables.add(0,tables1);
//
//            rule.put("tables",tables);
//            itemParams.put("rule",rule);
//
//
//            // rate
//
//
//            // rateMap
//            HashMap<Object, Object> rateMap = new HashMap<>();
//            rateMap.put("avatar","//s3.mogucdn.com/p2/161214/103488673_8ff131b8g07810e345268cgcda6ef_140x141.png");
//            rateMap.put("uname","强爷");
//            rateMap.put("created",1602185460);
//            rateMap.put("content","在线征婚");
//            rateList.add(0,rateMap);
//            rate.put("list",rateList);
//
//            // rateMap1
//            HashMap<Object, Object> rateMap1 = new HashMap<>();
//            rateMap1.put("avatar","//s5.mogucdn.com/p2/161214/103488673_8da6lhkf9a5h32ei6bd297523c35d_140x140.png");
//            rateMap1.put("uname","SeaSvan");
//            rateMap1.put("created",1602148380);
//            rateMap1.put("content","蛋糕很好吃，下次还会继续回购。");
//            rateList.add(1,rateMap1);
//            rate.put("list",rateList);
//
//
//
//
//            jsonObject.put("iid","002");
//        }
        // result
        else if (iid.equals("002")){

//            dataInfo

            imageList.add(0,"https://img.dangao.com/proimgs/C-721006desB1.jpg");
            imageList.add(1,"https://img.dangao.com/proimgs/C-721006desA1.jpg");
            imageList.add(2,"https://img.dangao.com/proimgs/C-721006desC1.jpg");
            imageList.add(3,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_hezi.jpg");
            imageList.add(4,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_baozhang.jpg");

            map.put("list",imageList);
            detailImage.add(0,map);
            detailInfo.put("detailImage",detailImage);


//           itemInfo
            topImages.add(0,"https://img.dangao.com/proimgs/C-7210064203.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-7210064202.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-7210064201.jpg");
            itemInfo.put("topImages",topImages);
            itemInfo.put("title","女神小七 产品编号：721006");
            itemInfo.put("subtitle","不论你何时到来都热情迎接， 这个城市或许就不再那么陌生");
            itemInfo.put("desc","对你的爱，远不止这些");
            itemInfo.put("price","¥189.00 ~ ¥499.00 ");
            itemInfo.put("oldPrice","299.00 ");
            itemInfo.put("discountDesc","上新");


            // columns
            columns.add(0,"已售429件");
            columns.add(1,"全国配送顺丰速递");
            columns.add(2,"配保温袋保温箱");



            // itemParam
            // tables
            ArrayList<Object> tables1 = new ArrayList<>();



            ArrayList<Object> tables1List = new ArrayList<>();
            tables1List.add(0,"材料:");
            tables1List.add(1,"新鲜优质淡奶油、新鲜玫瑰花瓣围边");

            ArrayList<Object> tables1List1 = new ArrayList<>();
            tables1List1.add(0,"祝愿:");
            tables1List1.add(1,"就这样牵着你的手，十指相扣走过春秋，幸福快乐长长久久。");

            ArrayList<Object> tables1List2 = new ArrayList<>();
            tables1List2.add(0,"保存:");
            tables1List2.add(1,"0-4°C保存1天，4小时内5°C食用口感最佳。");

            tables1.add(0,tables1List);
            tables1.add(1,tables1List1);
            tables1.add(2,tables1List2);

            tables.add(0,tables1);

            rule.put("tables",tables);
            itemParams.put("rule",rule);


            // rate


            // rateMap
            HashMap<Object, Object> rateMap = new HashMap<>();
            rateMap.put("avatar","//s3.mogucdn.com/p2/161214/103488673_8ff131b8g07810e345268cgcda6ef_140x141.png");
            rateMap.put("uname","棒棒糖闯江湖");
            rateMap.put("created",1602185460);
            rateMap.put("content","刚好合适，物美价廉，衣服面料很好，穿着很舒服，版型也好看，非常棒。");
            rateList.add(0,rateMap);
            rate.put("list",rateList);

            // rateMap1
            HashMap<Object, Object> rateMap1 = new HashMap<>();
            rateMap1.put("avatar","//s5.mogucdn.com/p2/161214/103488673_8da6lhkf9a5h32ei6bd297523c35d_140x140.png");
            rateMap1.put("uname","SeaSvan");
            rateMap1.put("created",1602148380);
            rateMap1.put("content","蛋糕很好吃，下次还会继续回购。");
            rateList.add(1,rateMap1);
            rate.put("list",rateList);

            // result
        }
        else if (iid.equals("003")){

//            dataInfo

            imageList.add("https://img.dangao.com/proimgs/C-777307desA1.jpg");
            imageList.add("https://img.dangao.com/proimgs/C-777307desB1.jpg");
            imageList.add("https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_hezi.jpg");
            imageList.add("https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_baozhang.jpg");

            map.put("list",imageList);
            detailImage.add(0,map);
            detailInfo.put("detailImage",detailImage);


//           itemInfo
            topImages.add("https://img.dangao.com/proimgs/C-7773074201.jpg");
            topImages.add("https://img.dangao.com/proimgs/C-777307desB1.jpg");


            itemInfo.put("topImages",topImages);
            itemInfo.put("title","塞纳河畔  编号：777307");
            itemInfo.put("subtitle","柔软在唇齿之间,晴天而鲜美");
            itemInfo.put("desc","终于让我遇见你，才懂得相知相逢的珍贵");
            itemInfo.put("price","¥159.00 ~ ¥699.00 ");
            itemInfo.put("oldPrice","¥189.00 ");
            itemInfo.put("discountDesc","爆款");


            // columns
            columns.add(0,"已售846件");
            columns.add(1,"全国配送顺丰速递");
            columns.add(2,"配保温袋保温箱");



            // itemParam
            // tables
            ArrayList<Object> tables1 = new ArrayList<>();



            ArrayList<Object> tables1List = new ArrayList<>();
            tables1List.add(0,"材料:");
            tables1List.add(1,"动物胶，慕斯粉，马斯卡普尼干酪，奶油，咖啡酒，咖啡，可可粉");

            ArrayList<Object> tables1List1 = new ArrayList<>();
            tables1List1.add(0,"祝愿:");
            tables1List1.add(1,"终于让我遇见你，才懂得相知相逢的珍贵。");

            ArrayList<Object> tables1List2 = new ArrayList<>();
            tables1List2.add(0,"保存:");
            tables1List2.add(1,"0-4°C保存1天，4小时内5°C食用口感最佳。");

            tables1.add(0,tables1List);
            tables1.add(1,tables1List1);
            tables1.add(2,tables1List2);

            tables.add(0,tables1);

            rule.put("tables",tables);
            itemParams.put("rule",rule);


            // rate


            // rateMap
            HashMap<Object, Object> rateMap = new HashMap<>();
            rateMap.put("avatar","//s3.mogucdn.com/p2/161214/103488673_8ff131b8g07810e345268cgcda6ef_140x141.png");
            rateMap.put("uname","棒棒糖闯江湖");
            rateMap.put("created",1602185460);
            rateMap.put("content","刚好合适，物美价廉，衣服面料很好，穿着很舒服，版型也好看，非常棒。");
            rateList.add(0,rateMap);
            rate.put("list",rateList);

        }
        else if (iid.equals("004")){

//            dataInfo

            imageList.add(0,"https://img.dangao.com/proimgs/C-702002desA1.jpg");
            imageList.add(1,"https://img.dangao.com/proimgs/C-702002desB1.jpg");
            imageList.add(2,"https://img.dangao.com/proimgs/C-702002desC1.jpg");
            imageList.add(3,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_hezi.jpg");
            imageList.add(4,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_baozhang.jpg");

            map.put("list",imageList);
            detailImage.add(0,map);
            detailInfo.put("detailImage",detailImage);


//           itemInfo
            topImages.add(0,"https://img.dangao.com/proimgs/C-702002601.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-702002602.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-702002603.jpg");
            itemInfo.put("topImages",topImages);
            itemInfo.put("title","魔法森林  编号：702002");
            itemInfo.put("subtitle","来一份华丽的魔法丛林之旅吧");
            itemInfo.put("desc","对你的爱，远不止这些");
            itemInfo.put("price","¥189.00 ~ ¥499.00 ");
            itemInfo.put("oldPrice","¥299.00 ");
            itemInfo.put("discountDesc","上新");


            // columns
            columns.add(0,"已售429件");
            columns.add(1,"全国配送顺丰速递");
            columns.add(2,"配保温袋保温箱");



            // itemParam
            // tables
            ArrayList<Object> tables1 = new ArrayList<>();



            ArrayList<Object> tables1List = new ArrayList<>();
            tables1List.add(0,"材料:");
            tables1List.add(1,"新鲜奶油+爽口蓝莓+甜蜜奥利奥");

            ArrayList<Object> tables1List1 = new ArrayList<>();
            tables1List1.add(0,"祝愿:");
            tables1List1.add(1,"来一份华丽的魔法丛林之旅吧");

            ArrayList<Object> tables1List2 = new ArrayList<>();
            tables1List2.add(0,"保存:");
            tables1List2.add(1,"0-4°C保存1天，4小时内5°C食用口感最佳。");

            tables1.add(0,tables1List);
            tables1.add(1,tables1List1);
            tables1.add(2,tables1List2);

            tables.add(0,tables1);

            rule.put("tables",tables);
            itemParams.put("rule",rule);


            // rate


            // rateMap
            HashMap<Object, Object> rateMap = new HashMap<>();
            rateMap.put("avatar","//s3.mogucdn.com/p2/161214/103488673_8ff131b8g07810e345268cgcda6ef_140x141.png");
            rateMap.put("uname","棒棒糖闯江湖");
            rateMap.put("created",1602185460);
            rateMap.put("content","刚好合适，物美价廉，衣服面料很好，穿着很舒服，版型也好看，非常棒。");
            rateList.add(0,rateMap);
            rate.put("list",rateList);

        }
        else if (iid.equals("005")){

//            dataInfo

            imageList.add(0,"https://img.dangao.com/proimgs/C-777211desA1.jpg");
            imageList.add(1,"https://img.dangao.com/proimgs/C-777211desB1.jpg");
            imageList.add(2,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_baozhang.jpg");

            map.put("list",imageList);
            detailImage.add(0,map);
            detailInfo.put("detailImage",detailImage);


//           itemInfo
            topImages.add(0,"https://img.dangao.com/proimgs/C-777211601.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-777211602.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-777211603.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-777211604.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-777211605.jpg");

            itemInfo.put("topImages",topImages);
            itemInfo.put("title","玫瑰之约 编号：777348");
            itemInfo.put("subtitle","终于让我遇见你，才懂得相知相逢的珍贵");
            itemInfo.put("desc","终于让我遇见你，才懂得相知相逢的珍贵");
            itemInfo.put("price","¥159.00 ~ ¥699.00 ");
            itemInfo.put("oldPrice","¥189.00 ");
            itemInfo.put("discountDesc","爆款");


            // columns
            columns.add(0,"已售846件");
            columns.add(1,"全国配送顺丰速递");
            columns.add(2,"配保温袋保温箱");



            // itemParam
            // tables
            ArrayList<Object> tables1 = new ArrayList<>();



            ArrayList<Object> tables1List = new ArrayList<>();
            tables1List.add(0,"材料:");
            tables1List.add(1,"新鲜奶油，鸡蛋牛奶胚，玫瑰花瓣围边");

            ArrayList<Object> tables1List1 = new ArrayList<>();
            tables1List1.add(0,"祝愿:");
            tables1List1.add(1,"终于让我遇见你，才懂得相知相逢的珍贵。");

            ArrayList<Object> tables1List2 = new ArrayList<>();
            tables1List2.add(0,"保存:");
            tables1List2.add(1,"0-4°C保存1天，4小时内5°C食用口感最佳。");

            tables1.add(0,tables1List);
            tables1.add(1,tables1List1);
            tables1.add(2,tables1List2);

            tables.add(0,tables1);

            rule.put("tables",tables);
            itemParams.put("rule",rule);


            // rate


            // rateMap
            HashMap<Object, Object> rateMap = new HashMap<>();
            rateMap.put("avatar","//s3.mogucdn.com/p2/161214/103488673_8ff131b8g07810e345268cgcda6ef_140x141.png");
            rateMap.put("uname","棒棒糖闯江湖");
            rateMap.put("created",1602185460);
            rateMap.put("content","刚好合适，物美价廉，衣服面料很好，穿着很舒服，版型也好看，非常棒。");
            rateList.add(0,rateMap);
            rate.put("list",rateList);

        }


        // result

        result.put("itemParams",itemParams);
        result.put("rate",rate);
        result.put("detailInfo",detailInfo);
        result.put("itemInfo",itemInfo);
        result.put("columns",columns);

        jsonObject.put("result",result);
        jsonObject.put("iid",iid);
        return jsonObject;
    }
}
