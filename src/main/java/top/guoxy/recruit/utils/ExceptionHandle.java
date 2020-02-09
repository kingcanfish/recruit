package top.guoxy.recruit.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle (Exception e) {
        if (e != null) {
            return ResultUtil.error(((Exception) e).getCode(), ((Exception) e).getMessage());
        }else {
            assert false;
            return ResultUtil.error(-1, ((Exception) null).getMessage());
        }
    }
}
