package layui.ssm.exception;

import layui.ssm.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserException extends RuntimeException {
    private ExceptionEnum exceptionEnum;
}
