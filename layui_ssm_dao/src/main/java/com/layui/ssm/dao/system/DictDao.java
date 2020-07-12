package com.layui.ssm.dao.system;

import com.layui.ssm.domain.system.Dict;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 字典类持久层接口
 */
public interface DictDao {


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
    @Insert("insert into sys_dict(label,text,sort,parent_id,is_parent) values(#{label},#{text},#{sort},#{parent_id},#{is_parent})")
    int save(Dict dict);

    /**
     * 字典表根据id删除数据的方法
     * @param id
     * @return
     */
    @Delete("delete from sys_dict where id=#{id} ")
    Dict deleteDict(Integer id);

    /**
     * 字典表更新数据的反方
     * @param dict
     * @return
     */
    @Update("update sys_dict set label=#{label},text=#{text},sort=#{sort},parent_id=#{parent_id},is_parent=#{is_parent} where id=#{id}")
    Dict updateDict(Dict dict);

    /**
     * 字典表根据id查询数据的方法
     * @param id
     * @return
     */
    @Select("select * from sys_dict where id = #{id}")
    Dict findDictById(Integer id);
}
