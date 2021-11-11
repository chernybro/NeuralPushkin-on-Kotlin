package com.uralsiberianworks.neuralpushkinonkotlin.di

import android.content.Context
import androidx.room.Room
import com.uralsiberianworks.neuralpushkinonkotlin.App
import com.uralsiberianworks.neuralpushkinonkotlin.model.local.roomdb.AppDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    fun provideRoomInstance(@ApplicationContext app: App): AppDataBase =
        Room.databaseBuilder(app.applicationContext,
            AppDataBase::class.java,
            "DATABASE_NAME"
        ).fallbackToDestructiveMigration().build()

    @Provides
    fun provideChatDao(db: AppDataBase) = db.getChatDao()

    @Provides
    fun provideContactDao(db: AppDataBase) = db.getContactDao()

    @Provides
    fun provideMessageDao(db: AppDataBase) = db.getMessageDao()
}