package mm.com.xan.dms_delivery.repository

import mm.com.xan.dms_delivery.remote.models.TestResponseModel
import retrofit2.Response
import retrofit2.http.GET

interface Services {
    @GET("loginRequest.json")
    suspend fun Login(): Response<TestResponseModel>
}