package com.dolatkia.repository.di

import com.dolatkia.database.DBInterface
import com.dolatkia.database.DatabaseA
import com.dolatkia.database.DatabaseB
import com.dolatkia.network.NetWorkA
import com.dolatkia.network.NetWorkB
import com.dolatkia.network.NetWorkInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class NetWorkAImplementation

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class NetWorkBImplementation

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DatabaseAImplementation

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DatabaseBImplementation

@Module
@InstallIn(SingletonComponent::class)
internal object  RepositoryModuleDI {

    @Provides
    fun provideRepository(
        @NetWorkAImplementation network: NetWorkInterface,
        @DatabaseBImplementation database: DBInterface
    ): com.dolatkia.repository.Repository {
        return com.dolatkia.repository.Repository(network, database)
    }

    @NetWorkAImplementation
    @Provides
    fun provideNetworkA(): com.dolatkia.network.NetWorkInterface {
        return NetWorkA()
    }

    @NetWorkBImplementation
    @Provides
    fun provideNetworkB(): com.dolatkia.network.NetWorkInterface {
        return NetWorkB()
    }

    @DatabaseAImplementation
    @Provides
    fun provideDatabaseA(): com.dolatkia.database.DBInterface {
        return DatabaseA()
    }

    @DatabaseBImplementation
    @Provides
    fun provideDatabaseB(): com.dolatkia.database.DBInterface {
        return DatabaseB()
    }
}