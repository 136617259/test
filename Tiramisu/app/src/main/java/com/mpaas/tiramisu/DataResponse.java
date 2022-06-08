package com.mpaas.tiramisu;

/**
 * @author ctt
 * @description:
 * @date :2022/5/30 2:06 下午
 */
public class DataResponse {
    public String status;
    public Data data;
    public String message;
    public String errType;
    public static class Data{
        public String[] successIds;
        public String[] failIds;
        public String message;
    }
}
