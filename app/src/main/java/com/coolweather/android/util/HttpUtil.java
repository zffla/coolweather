package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    /**
     * 和服务器进行交互
     * @param address
     * @param callback
     */
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
