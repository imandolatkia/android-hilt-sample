package com.dolatkia.androidhiltsample.di

import com.dolatkia.androidhiltsample.data.Repository
import com.dolatkia.androidhiltsample.db.DBInterface
import com.dolatkia.androidhiltsample.db.DatabaseA
import com.dolatkia.androidhiltsample.db.DatabaseB
import com.dolatkia.androidhiltsample.network.NetWorkA
import com.dolatkia.androidhiltsample.network.NetWorkB
import com.dolatkia.androidhiltsample.network.NetWorkInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

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
    ): Repository {
        return Repository(network, database)
    }

    @NetWorkAImplementation
    @Provides
    fun provideNetworkA(): NetWorkInterface {
        return NetWorkA()
    }

    @NetWorkBImplementation
    @Provides
    fun provideNetworkB(): NetWorkInterface {
        return NetWorkB()
    }

    @DatabaseAImplementation
    @Provides
    fun provideDatabaseA(): DBInterface {
        return DatabaseA()
    }

    @DatabaseBImplementation
    @Provides
    fun provideDatabaseB(): DBInterface {
        return DatabaseB()
    }
}