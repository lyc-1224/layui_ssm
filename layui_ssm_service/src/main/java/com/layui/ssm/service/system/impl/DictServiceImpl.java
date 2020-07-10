package com.layui.ssm.service.system.impl;

import com.github.pagehelper.PageHelper;
import com.layui.ssm.dao.system.IDictDao;
import com.layui.ssm.domain.system.Dict;
import com.layui.ssm.service.system.IDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: layui_ssm
 * @author: ASUS
 * @create: 2020-07-10 03:21
 * @description: 字典表业务层接口实现类
 **/
@Service
@Transactional
public class DictServiceImpl implements IDictService {

    /**
     * 自动注入字典类持久层
     */
    @Autowired
    private IDictDao dictDao;

    /**
     * 查询字典表所有数据的方法
     * @return
     */
    public List<Dict> findAll(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        return dictDao.findAll();
    }

    /**
     * 字典表新增数据的方法
     * @param dict
     * @return
     */
    public Dict save(Dict dict) {
        return dictDao.save(dict);
    }
}
