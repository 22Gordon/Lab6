package com.example.retrofit

import retrofit2.Call
import retrofit2.http.*

interface EndPoints {
    @GET("/users/")
    fun getUsers(): Call<List<User>>
    @GET("/users/{id}")
    fun getUserById(@Path("id") id: Int): Call<User>


}