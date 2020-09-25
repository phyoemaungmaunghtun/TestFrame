package mm.com.phyoeMaung.frameStructure.repository

import mm.com.phyoeMaung.frameStructure.remote.RemoteData
import mm.com.phyoeMaung.frameStructure.remote.RemoteDataSource
import javax.inject.Inject

class DataRepository @Inject constructor(private val remoteRepository: RemoteData) : RemoteDataSource {
    override suspend fun requestNews() = remoteRepository.requestNews()
}