package com.uralsiberianworks.neuralpushkinonkotlin.di


import com.uralsiberianworks.neuralpushkinonkotlin.model.remote.NeuralApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ServiceComponent
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module(includes = [OkHttpClientModule::class])
@InstallIn(SingletonComponent::class)
class ApiModule {

    @Singleton
    @Provides
    fun provideWebService(retrofit: Retrofit): NeuralApi = retrofit.create(NeuralApi::class.java)

    @Singleton
    @Provides
    fun provideRetrofitInstance(httpClient: OkHttpClient) = Retrofit.Builder()
        .baseUrl("")
        .client(httpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}