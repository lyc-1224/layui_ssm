package layui.ssm.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {

    USERNAME_ALREADY_EXIST(400,"用户名已存在"),
    ;
    private int code;
    private String msg;
}
