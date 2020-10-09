package mm.com.phyoeMaung.frameStructure.remote

import mm.com.phyoeMaung.frameStructure.remote.models.BaseResponseModel
import mm.com.phyoeMaung.frameStructure.repository.Resource
import mm.com.phyoeMaung.frameStructure.repository.Services
import javax.inject.Inject


class RemoteData @Inject
constructor(private val serviceGenerator: ServiceGenerator)  {

    private val service = serviceGenerator.createService(Services::class.java)

    suspend fun requestNews(): Resource<BaseResponseModel> {
        return serviceGenerator.handleResponse(serviceGenerator.processCall(service::Login))
    }

}
