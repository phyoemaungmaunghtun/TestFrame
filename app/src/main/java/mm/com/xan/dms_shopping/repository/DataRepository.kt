package mm.com.xan.dms_shopping.repository

import mm.com.xan.dms_shopping.remote.RemoteData
import mm.com.xan.dms_shopping.remote.RemoteDataSource
import javax.inject.Inject

class DataRepository @Inject constructor(private val remoteRepository: RemoteData) : RemoteDataSource {
    override suspend fun requestNews() = remoteRepository.requestNews()
}