package mm.com.xan.dms_shopping.repository

import mm.com.xan.dms_shopping.remote.models.TestResponseModel
import retrofit2.Response
import retrofit2.http.GET

interface Services {
    @GET("loginRequest.json")
    suspend fun Login(): Response<TestResponseModel>
}