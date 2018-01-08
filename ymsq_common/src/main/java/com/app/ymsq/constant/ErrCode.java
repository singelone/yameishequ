package com.app.ymsq.constant;

public class ErrCode {
    public final static int SUCCESS = 0;
    public final static int FAILED = 0x001;
    public final static int TIMEOUT = 0x002;
    public final static int INITIALIZE_ERROR = 0x003;
    public final static int REQUEST_FORMAT_ERROR = 0x004;
    //连接数据库失败
    public final static int ACCESS_DB_FAILED = 0x005;
    //验证失败
    public final static int VALIDATE_FAILED=0x006;
}
