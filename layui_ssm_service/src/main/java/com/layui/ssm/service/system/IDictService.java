package com.layui.ssm.service.system;

import com.layui.ssm.domain.system.Dict;

import java.util.List;

/**
 * 字典类的业务层接口
 */
public interface IDictService {

    /**
     * 查询字典表所有数据的方法
     * @return
     */
    List<Dict> findAll(Integer page,Integer limit);

    /**
     * 字典表新增数据的方法
     * @param dict
     * @return
     */
    void save(Dict dict);

    /**
     * 字典表根据id删除数据的方法
     * @param id
     * @return
     */
    Dict deleteDict(Integer id);

    /**
     * 字典表更新数据的方法
     * @param dict
     * @return
     */
    Dict updateDict(Dict dict);

    /**
     * 字典表根据id查询数据的方法
     * @param id
     * @return
     */
    Dict findDictById(Integer id);
}
