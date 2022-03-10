package com.example.baseapplication.repository

import com.example.baseapplication.service.RetrofitApi
import java.io.IOException
import javax.inject.Inject

class RetrofitRepository @Inject constructor(
    private val retrofitApi: RetrofitApi
) {

    suspend fun getSomething(){

        var response: Unit

        try {
            response = retrofitApi.getSomethingFunction()
        }
        catch (e : IOException){
            print(e.message)
        }

       //TODO: add return and change try/catch

    }
}