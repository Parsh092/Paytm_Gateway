package com.parsh.paytm_link;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ServiceInterface {

    // method,, return type ,, secondary url
    @Multipart
//    @POST("paytmallinone/init_Transaction.php")
    @POST("Paytm_link\\paytm-all-in-one-completecode\\paytmallinone_init_transaction\\paytmallinone/init_Transaction.php")
    Call<Token_Res> generateTokenCall(
            @Part("code") RequestBody language,
            @Part("MID") RequestBody mid,
            @Part("ORDER_ID") RequestBody order_id,
            @Part("AMOUNT") RequestBody amount
    );
}
