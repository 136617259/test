package com.mpaas.tiramisu;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

public interface Api {
    //get请求
    @FormUrlEncoded
    @POST("/pc/item/addPrice")
    Call<ResponseBody> getData(@Field("price") String nameStr, @Field("itemIds") String[] sexStr);
//    type=unsold&pageShow=50&getConf[]=myCategory&getConf[]=shipping&getConf[]=columns&getConf[]=site&getConf[]=isAuctioneer&getStat=1&_=1653979873941
    @GET("/pc/item/unsoldList")
    Call<BookList> getList(@QueryMap Map<String,String> params);
}
//https://seller.kongfz.com/pc/item/unsoldList?type=unsold&pageShow=50&getConf[]=myCategory&getConf[]=shipping&getConf[]=columns&getConf[]=site&getConf[]=isAuctioneer&getStat=1&_=1653979873941