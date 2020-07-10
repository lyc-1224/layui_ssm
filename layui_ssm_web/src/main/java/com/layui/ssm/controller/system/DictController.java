package com.layui.ssm.controller.system;

import com.github.pagehelper.PageInfo;
import com.layui.ssm.domain.system.Dict;
import com.layui.ssm.service.system.IDictService;
import com.sun.org.glassfish.external.probe.provider.annotations.ProbeParam;
import layui.ssm.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: layui_ssm
 * @author: ASUS
 * @create: 2020-07-10 03:07
 * @description: 前端控制器字典表类
 **/
@Controller
@RequestMapping("/system")
public class DictController {

    /**
     * 自动注入字典业务层
     */
    @Autowired
    private IDictService dictService;

    /**
     * 查询字典表所有数据的方法
     * @return Dict列表
     */
    @RequestMapping("/findAll.do")
    @ResponseBody
    public ResponseUtil<Dict> findAll(@RequestParam(name = "page", defaultValue = "1") Integer page,@RequestParam(name = "limit", defaultValue = "10") Integer limit) {
        List<Dict> list = dictService.findAll(page,limit);
        System.out.println(list);
        //PageInfo就是一个分页Bean
        PageInfo<Dict> pageInfo=new PageInfo<>(list);
        return new ResponseUtil<>(0,null,pageInfo.getTotal(),list);
    }

    /**
     * 字典表新增数据的方法
     * @param dict
     * @return
     */
    @RequestMapping("/save.do")
    public Dict save(Dict dict){
        return dictService.save(dict);
    }



}
