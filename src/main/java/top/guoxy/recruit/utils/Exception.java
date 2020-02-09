package top.guoxy.recruit.utils;

public class Exception extends RuntimeException {
    private int code;
    public Exception(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
