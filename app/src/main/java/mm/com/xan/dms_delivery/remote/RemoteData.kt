package mm.com.xan.dms_delivery.remote

import mm.com.xan.dms_delivery.remote.models.BaseResponseModel
import mm.com.xan.dms_delivery.repository.Resource
import mm.com.xan.dms_delivery.repository.Services
import javax.inject.Inject


class RemoteData @Inject
constructor(private val serviceGenerator: ServiceGenerator) : RemoteDataSource {

    private val service = serviceGenerator.createService(Services::class.java)

    override suspend fun requestNews(): Resource<BaseResponseModel> {
        return serviceGenerator.handleResponse(serviceGenerator.processCall(service::Login))
    }

}
