package com.mpaas.tiramisu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity2 extends BaseActicity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                request();
            }
        });
    }

    private void request() {
//        https://seller.kongfz.com
        Retrofit retrofit = new Retrofit.Builder()
                //设置网络请求BaseUrl地址
                .baseUrl("https://seller.kongfz.com")
                //设置数据解析器
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        //创建网络请求接口对象实例
        Api api = retrofit.create(Api.class);
//对发送请求进行封装
//        Call<DataResponse> dataCall = api.getData("1.00", new String[]{"4922809041","4922796116"});
//        dataCall.enqueue(new Callback<DataResponse>() {
//            @Override
//            public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
//                Log.e("ceshi","11");
//            }
//
//            @Override
//            public void onFailure(Call<DataResponse> call, Throwable t) {
//                Log.e("ceshi","22");
//            }
//        });
//        Call<ResponseBody> dataCall = api.getData("1.00", new String[]{"4922809041","4922796116"});
//        dataCall.enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                Log.e("ceshi","11");
//            }
//
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable t) {
//                Log.e("ceshi","22");
//            }
//        });
//        type=unsold&pageShow=50&getConf[]=myCategory&getConf[]=shipping&getConf[]=columns&getConf[]=site&getConf[]=isAuctioneer&getStat=1&_=1653979873941
        String str = "type=unsold&pageShow=50&getConf[]=myCategory&getConf[]=shipping&getConf[]=columns&getConf[]=site&getConf[]=isAuctioneer&getStat=1&_=1653979873941";
        String[] params = str.split("&");
        Map<String, String> paramsMap = new HashMap<>();
        for (int i = 0; i < params.length; i++) {
            String[] keyValue = params[i].split("=");
            paramsMap.put(keyValue[0], keyValue[1]);
        }
        Call<BookList> dataCall = api.getList(paramsMap);
        dataCall.enqueue(new Callback<BookList>() {
            @Override
            public void onResponse(Call<BookList> call, Response<BookList> response) {
                Log.e("ceshi", "11");
            }

            @Override
            public void onFailure(Call<BookList> call, Throwable t) {
                Log.e("ceshi", "22");
            }
        });
    }
}