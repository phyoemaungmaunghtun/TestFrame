package mm.com.phyoeMaung.frameStructure.remote

import mm.com.phyoeMaung.frameStructure.remote.models.BaseResponseModel
import mm.com.phyoeMaung.frameStructure.repository.Resource

internal interface RemoteDataSource {
    suspend fun requestNews(): Resource<BaseResponseModel>
}
