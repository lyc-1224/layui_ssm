package com.layui.ssm.dao.system;

import com.layui.ssm.domain.system.Dict;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 字典类持久层接口
 */
public interface IDictDao {


    /**
     * 查询字典表所有数据的方法
     * @return
     */
    @Select("select * from sys_dict")
    List<Dict> findAll();

    /**
     * 字典表新增保存数据的方法
     * @param dict
     * @return
     */
    @Select("insert into sys_dit(id,label,text,sort,parent_id,is_parent) values(#{id},#{label},#{text},#{sort},#{parent_id},#{is_parent})")
    Dict save(Dict dict);
}
