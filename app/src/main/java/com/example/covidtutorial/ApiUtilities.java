package com.example.covidtutorial;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {

    public static Retrofit retrofit=null;

    public static Apiinterface getAPIInterface()
    {

        if(retrofit==null)
        {
            retrofit=new Retrofit.Builder().baseUrl(Apiinterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return  retrofit.create(Apiinterface.class);

    }



}
