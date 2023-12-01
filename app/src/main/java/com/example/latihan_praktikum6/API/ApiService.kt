package com.example.latihan_praktikum6.API

import android.telecom.CallScreeningService.CallResponse
import com.example.latihan_praktikum6.RespoponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET ("character")
    fun getMorty () : Call<RespoponseMorty>

}