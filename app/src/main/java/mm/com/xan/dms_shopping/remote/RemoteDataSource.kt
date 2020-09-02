package mm.com.xan.dms_shopping.remote

import mm.com.xan.dms_shopping.remote.models.BaseResponseModel
import mm.com.xan.dms_shopping.repository.Resource

internal interface RemoteDataSource {
    suspend fun requestNews(): Resource<BaseResponseModel>
}
