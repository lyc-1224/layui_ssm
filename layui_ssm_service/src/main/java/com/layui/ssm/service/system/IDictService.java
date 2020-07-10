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
     * 询字典表新增数据的方法
     * @param dict
     * @return
     */
    Dict save(Dict dict);
}
