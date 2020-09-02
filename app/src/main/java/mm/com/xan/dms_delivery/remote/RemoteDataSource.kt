package mm.com.xan.dms_delivery.remote

import mm.com.xan.dms_delivery.remote.models.BaseResponseModel
import mm.com.xan.dms_delivery.repository.Resource

internal interface RemoteDataSource {
    suspend fun requestNews(): Resource<BaseResponseModel>
}
