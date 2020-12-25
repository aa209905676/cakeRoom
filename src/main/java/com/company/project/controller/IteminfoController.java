package com.company.project.controller;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.Bean.Iteminfo;
import com.company.project.service.IteminfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/12/16.
*/
@CrossOrigin
@RestController
@RequestMapping("/iteminfo")
public class IteminfoController {
    @Resource
    private IteminfoService iteminfoService;

    @PostMapping("/add")
    public Result add(Iteminfo iteminfo) {
        iteminfoService.save(iteminfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        iteminfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Iteminfo iteminfo) {
        iteminfoService.update(iteminfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Iteminfo iteminfo = iteminfoService.findById(id);
        return ResultGenerator.genSuccessResult(iteminfo);
    }

    /**
     * 详情页蛋糕数据
     * @param page
     * @param size
     * @return JSONObject
     */
    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Iteminfo> list = iteminfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
