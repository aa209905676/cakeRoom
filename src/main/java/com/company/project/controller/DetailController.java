package com.company.project.controller;

import com.alibaba.fastjson.JSONObject;
import com.company.project.Bean.Iteminfo;
import com.company.project.model.Imagelist;
import com.company.project.model.TopImages;
import com.company.project.service.ImagelistService;
import com.company.project.service.IteminfoService;
import com.company.project.service.TopImagesService;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin
public class DetailController {
    @Resource
    private IteminfoService iteminfoService;

    @Resource
    private TopImagesService topImagesService;

    @Resource
    private ImagelistService imagelistService;
    /**
     * 详情页
     * @param iid
     * @return JSONObject
     */
    @ApiOperation(value = "详情控制页")
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
            Integer id = Integer.parseInt(iid);

//            dataInfo

//            imageList.add(0,"https://img.dangao.com/proimgs/C-777105desB2.jpg");
//            imageList.add(1,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_baozhang.jpg");
//            imageList.add(2,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_hezi.jpg");
            Imagelist imagelist1 = imagelistService.findById(id);
            if (imagelist1.getImagelist() != null){
                imageList.add(imagelist1.getImagelist());
            }
            if (imagelist1.getImagelist1() != null){
                imageList.add(imagelist1.getImagelist1());
            }
            if (imagelist1.getImagelist2() != null){
                imageList.add(imagelist1.getImagelist2());
            }
            if (imagelist1.getImagelist3() != null){
                imageList.add(imagelist1.getImagelist3());
            }
            if (imagelist1.getImagelist4() != null){
                imageList.add(imagelist1.getImagelist4());
            }
            if (imagelist1.getImagelist5() != null){
                imageList.add(imagelist1.getImagelist5());
            }
            if (imagelist1.getImagelist6() != null){
                imageList.add(imagelist1.getImagelist6());
            }


            map.put("list",imageList);
            detailImage.add(0,map);
            detailInfo.put("detailImage",detailImage);



//           itemInfo
            TopImages topImages1 = topImagesService.findById(id);
            if (topImages1.getTopimages()!=null){
               topImages.add(topImages1.getTopimages());
            }
            if (topImages1.getTopimages1()!=null){
                topImages.add(topImages1.getTopimages1());
            }
            if (topImages1.getTopimages2()!=null){
                topImages.add(topImages1.getTopimages2());
            }
            if (topImages1.getTopimages3()!=null){
                topImages.add(topImages1.getTopimages3());
            }  if (topImages1.getTopimages4()!=null){
                topImages.add(topImages1.getTopimages4());
            }  if (topImages1.getTopimages5()!=null){
                topImages.add(topImages1.getTopimages5());
            }
           itemInfo.put("topImages",topImages);

           Iteminfo  iteminfos =  iteminfoService.selectByid(iid);
           itemInfo.put("title", iteminfos.getTitle());
           itemInfo.put("subtitle",iteminfos.getSubtitle());
           itemInfo.put("desc",iteminfos.getDescr());
           itemInfo.put("price","￥159~299.00");
           itemInfo.put("oldPrice",iteminfos.getOldprice());
           itemInfo.put("discountDesc",iteminfos.getDiscountdesc());
            itemInfo.put("realprice","289.00");
            itemInfo.put("realprice","289.00");


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
            rateMap.put("uname","SeaSvan");
            rateMap.put("created",1602185460);
            rateMap.put("content","非常好吃的蛋糕，不过这里非常贵，需要请联系我 qq：1608503887");
            rateList.add(0,rateMap);
            rate.put("list",rateList);

            // rateMap1
            HashMap<Object, Object> rateMap1 = new HashMap<>();
            rateMap1.put("avatar","//s5.mogucdn.com/p2/161214/103488673_8da6lhkf9a5h32ei6bd297523c35d_140x140.png");
            rateMap1.put("uname","强哥");
            rateMap1.put("created",1608645916);
            rateMap1.put("content","楼上卖的都是过期蛋糕，大家别信");
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
            itemInfo.put("realprice","189.00");
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
             // rateMap
            HashMap<Object, Object> rateMap = new HashMap<>();
            rateMap.put("avatar","//s3.mogucdn.com/p2/161214/103488673_8ff131b8g07810e345268cgcda6ef_140x141.png");
            rateMap.put("uname","SeaSvan");
            rateMap.put("created",1602185460);
            rateMap.put("content","非常好吃的蛋糕，不过这里非常贵，需要请联系我 qq：1608503887");
            rateList.add(0,rateMap);
            rate.put("list",rateList);

            // rateMap1
            HashMap<Object, Object> rateMap1 = new HashMap<>();
            rateMap1.put("avatar","//s5.mogucdn.com/p2/161214/103488673_8da6lhkf9a5h32ei6bd297523c35d_140x140.png");
            rateMap1.put("uname","强哥");
            rateMap1.put("created",1608645916);
            rateMap1.put("content","楼上卖的都是过期蛋糕，大家别信");
            rateList.add(1,rateMap1);
            rate.put("list",rateList);

            // result
        }
        else if (iid.equals("003")) {

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
            itemInfo.put("realprice","299.00");
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
            // rate
            // rateMap
            HashMap<Object, Object> rateMap = new HashMap<>();
            rateMap.put("avatar","//s3.mogucdn.com/p2/161214/103488673_8ff131b8g07810e345268cgcda6ef_140x141.png");
            rateMap.put("uname","SeaSvan");
            rateMap.put("created",1602185460);
            rateMap.put("content","非常好吃的蛋糕，不过这里非常贵，需要请联系我 qq：1608503887");
            rateList.add(0,rateMap);
            rate.put("list",rateList);

            // rateMap1
            HashMap<Object, Object> rateMap1 = new HashMap<>();
            rateMap1.put("avatar","//s5.mogucdn.com/p2/161214/103488673_8da6lhkf9a5h32ei6bd297523c35d_140x140.png");
            rateMap1.put("uname","强哥");
            rateMap1.put("created",1608645916);
            rateMap1.put("content","楼上卖的都是过期蛋糕，大家别信");
            rateList.add(1,rateMap1);
            rate.put("list",rateList);



        }
        else if (iid.equals("004")){

//            dataInfo

            imageList.add(0,"https://img.dangao.com/proimgs/C-702002desA1.jpg");
            imageList.add(1,"https://img.dangao.com/proimgs/C-702002desB1.jpg");
            imageList.add(2,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_hezi.jpg");
            imageList.add(3,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_baozhang.jpg");

            map.put("list",imageList);
            detailImage.add(0,map);
            detailInfo.put("detailImage",detailImage);


//           itemInfo
            topImages.add("https://img.dangao.com/proimgs/C-7020024201.jpg");
            topImages.add("https://img.dangao.com/proimgs/C-7020024202.jpg");
            topImages.add("https://img.dangao.com/proimgs/C-7020024203.jpg");

            itemInfo.put("topImages",topImages);
            itemInfo.put("title","魔法森林  编号：702002");
            itemInfo.put("subtitle","来一份华丽的魔法丛林之旅吧");
            itemInfo.put("desc","对你的爱，远不止这些");
            itemInfo.put("price","¥189.00 ~ ¥499.00 ");
            itemInfo.put("oldPrice","¥299.00 ");
            itemInfo.put("realprice","299.00");
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


            // rate
            // rateMap
            HashMap<Object, Object> rateMap = new HashMap<>();
            rateMap.put("avatar","//s3.mogucdn.com/p2/161214/103488673_8ff131b8g07810e345268cgcda6ef_140x141.png");
            rateMap.put("uname","SeaSvan");
            rateMap.put("created",1602185460);
            rateMap.put("content","非常好吃的蛋糕，不过这里非常贵，需要请联系我 qq：1608503887");
            rateList.add(0,rateMap);
            rate.put("list",rateList);

            // rateMap1
            HashMap<Object, Object> rateMap1 = new HashMap<>();
            rateMap1.put("avatar","//s5.mogucdn.com/p2/161214/103488673_8da6lhkf9a5h32ei6bd297523c35d_140x140.png");
            rateMap1.put("uname","强哥");
            rateMap1.put("created",1608645916);
            rateMap1.put("content","楼上卖的都是过期蛋糕，大家别信");
            rateList.add(1,rateMap1);
            rate.put("list",rateList);

        }
        else if (iid.equals("005")){

//            dataInfo

            imageList.add(0,"https://img.dangao.com/proimgs/C-777211desA1.jpg");
            imageList.add(1,"https://img.dangao.com/proimgs/C-777211desB1.jpg");
            imageList.add(2,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_hezi.jpg");
            imageList.add(3,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_baozhang.jpg");

            map.put("list",imageList);
            detailImage.add(0,map);
            detailInfo.put("detailImage",detailImage);


//           itemInfo
            topImages.add(0,"https://img.dangao.com/proimgs/C-7772114201.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-7772114202.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-7772114203.jpg");


            itemInfo.put("topImages",topImages);
            itemInfo.put("title","玫瑰之约 编号：777348");
            itemInfo.put("subtitle","终于让我遇见你，才懂得相知相逢的珍贵");
            itemInfo.put("desc","终于让我遇见你，才懂得相知相逢的珍贵");
            itemInfo.put("price","¥159.00 ~ ¥699.00 ");
            itemInfo.put("oldPrice","¥189.00 ");
            itemInfo.put("realprice","199.00");
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


            // rate
            // rateMap
            HashMap<Object, Object> rateMap = new HashMap<>();
            rateMap.put("avatar","//s3.mogucdn.com/p2/161214/103488673_8ff131b8g07810e345268cgcda6ef_140x141.png");
            rateMap.put("uname","SeaSvan");
            rateMap.put("created",1602185460);
            rateMap.put("content","非常好吃的蛋糕，不过这里非常贵，需要请联系我 qq：1608503887");
            rateList.add(0,rateMap);
            rate.put("list",rateList);

            // rateMap1
            HashMap<Object, Object> rateMap1 = new HashMap<>();
            rateMap1.put("avatar","//s5.mogucdn.com/p2/161214/103488673_8da6lhkf9a5h32ei6bd297523c35d_140x140.png");
            rateMap1.put("uname","强哥");
            rateMap1.put("created",1608645916);
            rateMap1.put("content","楼上卖的都是过期蛋糕，大家别信");
            rateList.add(1,rateMap1);
            rate.put("list",rateList);

        }
        else if (iid.equals("006")){

//            dataInfo

            imageList.add(0,"https://img.dangao.com/proimgs/C-721025desA1.jpg");
            imageList.add(1,"https://img.dangao.com/proimgs/C-721025desB1.jpg");
            imageList.add(2,"https://img.dangao.com/proimgs/C-721025desC1.jpg");
            imageList.add(3,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_hezi.jpg");
            imageList.add(4,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_baozhang.jpg");

            map.put("list",imageList);
            detailImage.add(0,map);
            detailInfo.put("detailImage",detailImage);


//           itemInfo
            topImages.add(0,"https://img.dangao.com/proimgs/C-7210254201.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-7210254202.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-7210254203.jpg");


            itemInfo.put("topImages",topImages);
            itemInfo.put("title","幸福味道  编号：721025");
            itemInfo.put("subtitle","幸福时刻，想要和你分享这份甜蜜");
            itemInfo.put("desc","幸福时刻，想要和你分享这份甜蜜");
            itemInfo.put("price","¥199.00 ~ ¥599.00 ");
            itemInfo.put("oldPrice","¥189.00 ");
            itemInfo.put("realprice","269.00");
            itemInfo.put("discountDesc","上新");


            // columns
            columns.add(0,"已售236件");
            columns.add(1,"全国配送顺丰速递");
            columns.add(2,"配保温袋保温箱");



            // itemParam
            // tables
            ArrayList<Object> tables1 = new ArrayList<>();



            ArrayList<Object> tables1List = new ArrayList<>();
            tables1List.add(0,"材料:");
            tables1List.add(1,"四格慕斯搭配新鲜芒果");

            ArrayList<Object> tables1List1 = new ArrayList<>();
            tables1List1.add(0,"祝愿:");
            tables1List1.add(1,"幸福时刻，想要和你分享这份甜蜜");

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


            // rate
            // rateMap
            HashMap<Object, Object> rateMap = new HashMap<>();
            rateMap.put("avatar","//s3.mogucdn.com/p2/161214/103488673_8ff131b8g07810e345268cgcda6ef_140x141.png");
            rateMap.put("uname","SeaSvan");
            rateMap.put("created",1602185460);
            rateMap.put("content","非常好吃的蛋糕，不过这里非常贵，需要请联系我 qq：1608503887");
            rateList.add(0,rateMap);
            rate.put("list",rateList);

            // rateMap1
            HashMap<Object, Object> rateMap1 = new HashMap<>();
            rateMap1.put("avatar","//s5.mogucdn.com/p2/161214/103488673_8da6lhkf9a5h32ei6bd297523c35d_140x140.png");
            rateMap1.put("uname","强哥");
            rateMap1.put("created",1608645916);
            rateMap1.put("content","楼上卖的都是过期蛋糕，大家别信");
            rateList.add(1,rateMap1);
            rate.put("list",rateList);

        }
        else if (iid.equals("019")){

//            dataInfo

            imageList.add(0,"https://img.dangao.com/proimgs/C-721025desA1.jpg");
            imageList.add(1,"https://img.dangao.com/proimgs/C-721025desC1.jpg");
            imageList.add(2,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_hezi.jpg");
            imageList.add(3,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_baozhang.jpg");

            map.put("list",imageList);
            detailImage.add(0,map);
            detailInfo.put("detailImage",detailImage);


//           itemInfo
            topImages.add(0,"https://img.dangao.com/proimgs/F-7210274201.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/F-7210274202.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/F-7210274203.jpg");


            itemInfo.put("topImages",topImages);
            itemInfo.put("title","“榴芒”双拼  编号：721027");
            itemInfo.put("subtitle","细节决定味道，味道养育心灵");
            itemInfo.put("desc","细节决定味道，味道养育心灵");
            itemInfo.put("price","¥179.00 ~ ¥269.00 ");
            itemInfo.put("oldPrice","¥189.00 ");
            itemInfo.put("realprice","259.00");
            itemInfo.put("discountDesc","上新");


            // columns
            columns.add(0,"已售126件");
            columns.add(1,"全国配送顺丰速递");
            columns.add(2,"配保温袋保温箱");



            // itemParam
            // tables
            ArrayList<Object> tables1 = new ArrayList<>();



            ArrayList<Object> tables1List = new ArrayList<>();
            tables1List.add(0,"材料:");
            tables1List.add(1,"四格慕斯搭配新鲜芒果");

            ArrayList<Object> tables1List1 = new ArrayList<>();
            tables1List1.add(0,"祝愿:");
            tables1List1.add(1,"细节决定味道，味道养育心灵");

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


            // rate
            // rateMap
            HashMap<Object, Object> rateMap = new HashMap<>();
            rateMap.put("avatar","//s3.mogucdn.com/p2/161214/103488673_8ff131b8g07810e345268cgcda6ef_140x141.png");
            rateMap.put("uname","SeaSvan");
            rateMap.put("created",1602185460);
            rateMap.put("content","非常好吃的蛋糕，不过这里非常贵，需要请联系我 qq：1608503887");
            rateList.add(0,rateMap);
            rate.put("list",rateList);

            // rateMap1
            HashMap<Object, Object> rateMap1 = new HashMap<>();
            rateMap1.put("avatar","//s5.mogucdn.com/p2/161214/103488673_8da6lhkf9a5h32ei6bd297523c35d_140x140.png");
            rateMap1.put("uname","强哥");
            rateMap1.put("created",1608645916);
            rateMap1.put("content","楼上卖的都是过期蛋糕，大家别信");
            rateList.add(1,rateMap1);
            rate.put("list",rateList);

        }
        else if (iid.equals("020")){

//            dataInfo


            imageList.add(0,"https://img.dangao.com/proimgs/C-731005desB1.jpg");
            imageList.add(1,"https://img.dangao.com/proimgs/C-731005desC1.jpg");
            imageList.add(2,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_hezi.jpg");
            imageList.add(3,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_baozhang.jpg");

            map.put("list",imageList);
            detailImage.add(0,map);
            detailInfo.put("detailImage",detailImage);


//           itemInfo
            topImages.add(0,"https://img.dangao.com/proimgs/C-7310054201.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-7310054202.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-7310054203.jpg");


            itemInfo.put("topImages",topImages);
            itemInfo.put("title","日式和风慕斯 编号：701653");
            itemInfo.put("subtitle","闭紧双眸,捕捉到它");
            itemInfo.put("desc","闭紧双眸,捕捉到它");
            itemInfo.put("price","¥199.00 ~ ¥299.00 ");
            itemInfo.put("oldPrice","¥259.00 ");
            itemInfo.put("realprice","259.00");
            itemInfo.put("discountDesc","上新");


            // columns
            columns.add(0,"已售256件");
            columns.add(1,"全国配送顺丰速递");
            columns.add(2,"配保温袋保温箱");



            // itemParam
            // tables
            ArrayList<Object> tables1 = new ArrayList<>();



            ArrayList<Object> tables1List = new ArrayList<>();
            tables1List.add(0,"材料:");
            tables1List.add(1,"抹茶粉与慕斯的美妙结合");

            ArrayList<Object> tables1List1 = new ArrayList<>();
            tables1List1.add(0,"祝愿:");
            tables1List1.add(1,"闭紧双眸,捕捉到它");

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


            // rate
            // rateMap
            HashMap<Object, Object> rateMap = new HashMap<>();
            rateMap.put("avatar","//s3.mogucdn.com/p2/161214/103488673_8ff131b8g07810e345268cgcda6ef_140x141.png");
            rateMap.put("uname","SeaSvan");
            rateMap.put("created",1602185460);
            rateMap.put("content","非常好吃的蛋糕，不过这里非常贵，需要请联系我 qq：1608503887");
            rateList.add(0,rateMap);
            rate.put("list",rateList);

            // rateMap1
            HashMap<Object, Object> rateMap1 = new HashMap<>();
            rateMap1.put("avatar","//s5.mogucdn.com/p2/161214/103488673_8da6lhkf9a5h32ei6bd297523c35d_140x140.png");
            rateMap1.put("uname","强哥");
            rateMap1.put("created",1608645916);
            rateMap1.put("content","楼上卖的都是过期蛋糕，大家别信");
            rateList.add(1,rateMap1);
            rate.put("list",rateList);

        }
        else if (iid.equals("021")){

//            dataInfo

            imageList.add(0,"https://img.dangao.com/proimgs/C-701650desA1.jpg");
            imageList.add(1,"https://img.dangao.com/proimgs/C-701650desB1.jpg");
            imageList.add(2,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_hezi.jpg");
            imageList.add(3,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_baozhang.jpg");

            map.put("list",imageList);
            detailImage.add(0,map);
            detailInfo.put("detailImage",detailImage);


//           itemInfo
            topImages.add(0,"https://img.dangao.com/proimgs/F-7772114201.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/F-7772114202.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/F-7772114203.jpg");


            itemInfo.put("topImages",topImages);
            itemInfo.put("title","花漾  编号：701650");
            itemInfo.put("subtitle","长长的人生之旅，有你相伴是我一生的幸福");
            itemInfo.put("desc","长长的人生之旅，有你相伴是我一生的幸福");
            itemInfo.put("price","¥199.00 ~ ¥299.00 ");
            itemInfo.put("oldPrice","¥259.00 ");
            itemInfo.put("realprice","259.00");
            itemInfo.put("discountDesc","上新");


            // columns
            columns.add(0,"已售256件");
            columns.add(1,"全国配送顺丰速递");
            columns.add(2,"配保温袋保温箱");



            // itemParam
            // tables
            ArrayList<Object> tables1 = new ArrayList<>();



            ArrayList<Object> tables1List = new ArrayList<>();
            tables1List.add(0,"材料:");
            tables1List.add(1,"鲜奶鸡蛋胚+玫瑰花瓣围边");

            ArrayList<Object> tables1List1 = new ArrayList<>();
            tables1List1.add(0,"祝愿:");
            tables1List1.add(1,"长长的人生之旅，有你相伴是我一生的幸福");

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


            // rate
            // rateMap
            HashMap<Object, Object> rateMap = new HashMap<>();
            rateMap.put("avatar","//s3.mogucdn.com/p2/161214/103488673_8ff131b8g07810e345268cgcda6ef_140x141.png");
            rateMap.put("uname","SeaSvan");
            rateMap.put("created",1602185460);
            rateMap.put("content","非常好吃的蛋糕，不过这里非常贵，需要请联系我 qq：1608503887");
            rateList.add(0,rateMap);
            rate.put("list",rateList);

            // rateMap1
            HashMap<Object, Object> rateMap1 = new HashMap<>();
            rateMap1.put("avatar","//s5.mogucdn.com/p2/161214/103488673_8da6lhkf9a5h32ei6bd297523c35d_140x140.png");
            rateMap1.put("uname","强哥");
            rateMap1.put("created",1608645916);
            rateMap1.put("content","楼上卖的都是过期蛋糕，大家别信");
            rateList.add(1,rateMap1);
            rate.put("list",rateList);

        }
        else if (iid.equals("022")){

//            dataInfo

            imageList.add(0,"https://img.dangao.com/proimgs/C-701018desA1.jpg");
            imageList.add(1,"https://img.dangao.com/proimgs/C-701018desB1.jpg");
            imageList.add(2,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_hezi.jpg");
            imageList.add(3,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_baozhang.jpg");

            map.put("list",imageList);
            detailImage.add(0,map);
            detailInfo.put("detailImage",detailImage);


//           itemInfo
            topImages.add(0,"https://img.dangao.com/proimgs/C-7010184201.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-7010184202.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-7010184203.jpg");


            itemInfo.put("topImages",topImages);
            itemInfo.put("title","粉红宝贝  编号：701018");
            itemInfo.put("subtitle","愿宝贝有一个快乐美好的童年");
            itemInfo.put("desc","愿宝贝有一个快乐美好的童年");
            itemInfo.put("price","¥269.00 ~ ¥399.00 ");
            itemInfo.put("oldPrice","¥259.00 ");
            itemInfo.put("realprice","259.00");
            itemInfo.put("discountDesc","上新");


            // columns
            columns.add(0,"已售256件");
            columns.add(1,"全国配送顺丰速递");
            columns.add(2,"配保温袋保温箱");



            // itemParam
            // tables
            ArrayList<Object> tables1 = new ArrayList<>();



            ArrayList<Object> tables1List = new ArrayList<>();
            tables1List.add(0,"材料:");
            tables1List.add(1,"优质奶油，王冠点缀");

            ArrayList<Object> tables1List1 = new ArrayList<>();
            tables1List1.add(0,"祝愿:");
            tables1List1.add(1,"愿宝贝有一个快乐美好的童年");

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


            // rate
            // rateMap
            HashMap<Object, Object> rateMap = new HashMap<>();
            rateMap.put("avatar","//s3.mogucdn.com/p2/161214/103488673_8ff131b8g07810e345268cgcda6ef_140x141.png");
            rateMap.put("uname","SeaSvan");
            rateMap.put("created",1602185460);
            rateMap.put("content","非常好吃的蛋糕，不过这里非常贵，需要请联系我 qq：1608503887");
            rateList.add(0,rateMap);
            rate.put("list",rateList);

            // rateMap1
            HashMap<Object, Object> rateMap1 = new HashMap<>();
            rateMap1.put("avatar","//s5.mogucdn.com/p2/161214/103488673_8da6lhkf9a5h32ei6bd297523c35d_140x140.png");
            rateMap1.put("uname","强哥");
            rateMap1.put("created",1608645916);
            rateMap1.put("content","楼上卖的都是过期蛋糕，大家别信");
            rateList.add(1,rateMap1);
            rate.put("list",rateList);

        }
        else if (iid.equals("023")){

//            dataInfo

            imageList.add(0,"https://img.dangao.com/proimgs/C-777319desA1.jpg");
            imageList.add(1,"https://img.dangao.com/proimgs/C-777319desB1.jpg");
            imageList.add(2,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_hezi.jpg");
            imageList.add(3,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_baozhang.jpg");

            map.put("list",imageList);
            detailImage.add(0,map);
            detailInfo.put("detailImage",detailImage);


//           itemInfo
            topImages.add(0,"https://img.dangao.com/proimgs/C-777319601.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-777319602.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-777319603.jpg");


            itemInfo.put("topImages",topImages);
            itemInfo.put("title","小王子  编号：777319");
            itemInfo.put("subtitle","长大后你会成为你梦想中的超级英雄");
            itemInfo.put("desc","长大后你会成为你梦想中的超级英雄");
            itemInfo.put("price","¥169.00 ~ ¥299.00 ");
            itemInfo.put("oldPrice","¥199.00 ");
            itemInfo.put("realprice","199.00");
            itemInfo.put("discountDesc","上新");


            // columns
            columns.add(0,"已售125件");
            columns.add(1,"全国配送顺丰速递");
            columns.add(2,"配保温袋保温箱");



            // itemParam
            // tables
            ArrayList<Object> tables1 = new ArrayList<>();



            ArrayList<Object> tables1List = new ArrayList<>();
            tables1List.add(0,"材料:");
            tables1List.add(1,"进口优质淡奶油，巧克力，棉花糖等");

            ArrayList<Object> tables1List1 = new ArrayList<>();
            tables1List1.add(0,"祝愿:");
            tables1List1.add(1,"长大后你会成为你梦想中的超级英雄");

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


            // rate
            // rateMap
            HashMap<Object, Object> rateMap = new HashMap<>();
            rateMap.put("avatar","//s3.mogucdn.com/p2/161214/103488673_8ff131b8g07810e345268cgcda6ef_140x141.png");
            rateMap.put("uname","SeaSvan");
            rateMap.put("created",1602185460);
            rateMap.put("content","非常好吃的蛋糕，不过这里非常贵，需要请联系我 qq：1608503887");
            rateList.add(0,rateMap);
            rate.put("list",rateList);

            // rateMap1
            HashMap<Object, Object> rateMap1 = new HashMap<>();
            rateMap1.put("avatar","//s5.mogucdn.com/p2/161214/103488673_8da6lhkf9a5h32ei6bd297523c35d_140x140.png");
            rateMap1.put("uname","强哥");
            rateMap1.put("created",1608645916);
            rateMap1.put("content","楼上卖的都是过期蛋糕，大家别信");
            rateList.add(1,rateMap1);
            rate.put("list",rateList);

        }
        else if (iid.equals("024")){

//            dataInfo

            imageList.add(0,"https://img.dangao.com/proimgs/C-777222desA1.jpg");
            imageList.add(1,"https://img.dangao.com/proimgs/C-777222desB1.jpg");
            imageList.add(2,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_hezi.jpg");
            imageList.add(3,"https://www.dangao.com/Tpl/2016skin/Public/images/5mnew_baozhang.jpg");

            map.put("list",imageList);
            detailImage.add(0,map);
            detailInfo.put("detailImage",detailImage);


//           itemInfo
            topImages.add(0,"https://img.dangao.com/proimgs/C-7772224201.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-7772224202.jpg");
            topImages.add(0,"https://img.dangao.com/proimgs/C-7772224203.jpg");


            itemInfo.put("topImages",topImages);
            itemInfo.put("title","女神花环  编号：777222");
            itemInfo.put("subtitle","带上这个花环，变成完美女神吧");
            itemInfo.put("desc","带上这个花环，变成完美女神吧");
            itemInfo.put("price","¥299.00 ~ ¥599.00 ");
            itemInfo.put("oldPrice","¥199.00 ");
            itemInfo.put("realprice","199.00");
            itemInfo.put("discountDesc","上新");


            // columns
            columns.add(0,"已售655件");
            columns.add(1,"全国配送顺丰速递");
            columns.add(2,"配保温袋保温箱");



            // itemParam
            // tables
            ArrayList<Object> tables1 = new ArrayList<>();



            ArrayList<Object> tables1List = new ArrayList<>();
            tables1List.add(0,"材料:");
            tables1List.add(1,"进口优质淡奶油，新鲜时令水果");

            ArrayList<Object> tables1List1 = new ArrayList<>();
            tables1List1.add(0,"祝愿:");
            tables1List1.add(1,"带上这个花环，变成完美女神吧");

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


            // rate
            // rateMap
            HashMap<Object, Object> rateMap = new HashMap<>();
            rateMap.put("avatar","//s3.mogucdn.com/p2/161214/103488673_8ff131b8g07810e345268cgcda6ef_140x141.png");
            rateMap.put("uname","SeaSvan");
            rateMap.put("created",1602185460);
            rateMap.put("content","非常好吃的蛋糕，不过这里非常贵，需要请联系我 qq：1608503887");
            rateList.add(0,rateMap);
            rate.put("list",rateList);

            // rateMap1
            HashMap<Object, Object> rateMap1 = new HashMap<>();
            rateMap1.put("avatar","//s5.mogucdn.com/p2/161214/103488673_8da6lhkf9a5h32ei6bd297523c35d_140x140.png");
            rateMap1.put("uname","强哥");
            rateMap1.put("created",1608645916);
            rateMap1.put("content","楼上卖的都是过期蛋糕，大家别信");
            rateList.add(1,rateMap1);
            rate.put("list",rateList);

        }


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
