package com.deuk.daggertemplate03.di

import com.deuk.daggertemplate03.User
import com.deuk.daggertemplate03.di.qualifiers.RichardParker
import com.deuk.daggertemplate03.di.qualifiers.TonyStark
import dagger.Module
import dagger.Provides

@Module
class UserModule {
    @RichardParker
    @Provides
    fun provideRichardParker(): User {
        return User("Richard Parker", 8)
    }

    @TonyStark
    @Provides
    fun provideTonyStark(): User {
        return User("Tony Stark", 34)
    }
}