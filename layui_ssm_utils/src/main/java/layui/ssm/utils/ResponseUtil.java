package layui.ssm.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @program: layui_ssm
 * @author: ASUS
 * @create: 2020-07-10 04:42
 * @description: 响应工具类
 **/
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResponseUtil<T> {

    private Integer code; // 状态码
    private String msg; // 消息
    private Long count; // 总数
    private List<T> data; // 数据
}
