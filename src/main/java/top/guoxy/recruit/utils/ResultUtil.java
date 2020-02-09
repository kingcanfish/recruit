package top.guoxy.recruit.utils;

public class ResultUtil {
    public static Result<Object> success(Object object) {
        return new Result<>(200, "请求成功",object);
    }
    public static Result<String> fail(int code, String msg) {
        return new Result<>(code, msg, "");
    }
    public static Result<String> error(int code,String msg) {
        return new Result<>(code,msg,"");
    }

}
