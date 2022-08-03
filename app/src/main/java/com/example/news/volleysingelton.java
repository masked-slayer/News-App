package com.example.news;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class volleysingelton {
    private RequestQueue requestQueue;
    private static volleysingelton mInstance;
private  volleysingelton(Context context){
    requestQueue =Volley.newRequestQueue(context.getApplicationContext());
}
public static synchronized  volleysingelton getmInstance(Context context){
    if(mInstance == null){
        mInstance = new volleysingelton(context);
    }
    return  mInstance;
}
public RequestQueue getRequestQueue(){return  requestQueue;}
}
