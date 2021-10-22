package dev.cardoso.quotesmvvm.domain.usecase

import dev.cardoso.quotesmvvm.data.model.QuoteModel
import dev.cardoso.quotesmvvm.domain.QuoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor (private  val quoteRepository: QuoteRepository) {

    suspend fun getQuotes(): Flow<List<QuoteModel>> = quoteRepository.getQuotes()

}