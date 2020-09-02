package mm.com.xan.dms_delivery.repository

import mm.com.xan.dms_delivery.remote.RemoteData
import mm.com.xan.dms_delivery.remote.RemoteDataSource
import javax.inject.Inject

class DataRepository @Inject constructor(private val remoteRepository: RemoteData) : RemoteDataSource {
    override suspend fun requestNews() = remoteRepository.requestNews()
}