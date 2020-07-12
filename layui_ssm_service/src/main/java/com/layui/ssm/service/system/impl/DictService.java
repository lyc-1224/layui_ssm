package com.layui.ssm.service.system.impl;

import com.github.pagehelper.PageHelper;
import com.layui.ssm.dao.system.DictDao;
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
public class DictService implements IDictService {

    /**
     * 自动注入字典类持久层
     */
    @Autowired
    private DictDao dictDao;

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
    public void save(Dict dict) {
        dictDao.save(dict);
    }

    /**
     * 字典表根据id删除数据的方法
     * @param id
     * @return
     */
    public Dict deleteDict(Integer id) {
        return dictDao.deleteDict(id);
    }

    /**
     * 字典表更新数据的方法
     * @param dict
     * @return
     */
    public Dict updateDict(Dict dict) {
        return dictDao.updateDict(dict);
    }

    /**
     * 字典表根据id查询数据的方法
     * @param id
     * @return
     */
    public Dict findDictById(Integer id) {
        return dictDao.findDictById(id);
    }
}
