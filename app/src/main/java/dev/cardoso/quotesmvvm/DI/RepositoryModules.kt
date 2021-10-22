package dev.cardoso.quotesmvvm.data.model
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.cardoso.quotesmvvm.data.QuoteLocalDataSourceImpl
import dev.cardoso.quotesmvvm.data.QuoteRemoteDataSourceImpl
import dev.cardoso.quotesmvvm.data.QuoteRepositoryImpl
import dev.cardoso.quotesmvvm.data.local.QuoteLocalDataSource
import dev.cardoso.quotesmvvm.data.remote.QuoteRemoteDataSource
import dev.cardoso.quotesmvvm.domain.QuoteRepository

@Module
@InstallIn(SingletonComponent::class)
abstract class QuoteRepositoryModule{
    @Binds
    abstract fun bindQuoteRepository(quoteRepositoryImpl: QuoteRepositoryImpl) : QuoteRepository

}

@Module
@InstallIn(SingletonComponent::class)
abstract class QuoteRemoteDataSourceModule{
    @Binds
    abstract fun bindQuoteRemoteDaraSource(quoteRemoteDataSourceImpl : QuoteRemoteDataSourceImpl): QuoteRemoteDataSource

}
@Module
@InstallIn(SingletonComponent::class)
abstract class QuoteLocalDataSourceModule{
  @Binds
    abstract fun bindQuoteLocalDataSource(quoteLocalDataSourceImpl: QuoteLocalDataSourceImpl):
            QuoteLocalDataSource
}




