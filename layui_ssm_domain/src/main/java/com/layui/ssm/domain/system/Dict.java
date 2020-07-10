package com.layui.ssm.domain.system;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @program: layui_ssm
 * @author: ASUS
 * @create: 2020-07-10 02:48
 * @description: 字典表实体类
 **/
@Data
@ToString
public class Dict {

    private Integer id; // 主键
    private String label; // 标签
    private String text; // 文本
    private Integer sort; // 排序（数值越小樾靠前）
    private Integer parent_id; // 父ID
    private Integer is_parent; // 是否为父节点（0 为否 1 为是）

}
