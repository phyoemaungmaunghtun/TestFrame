package mm.com.phyoeMaung.frameStructure.repository

import mm.com.phyoeMaung.frameStructure.remote.models.TestResponseModel
import retrofit2.Response
import retrofit2.http.GET

interface Services {
    @GET("loginRequest.json")
    suspend fun Login(): Response<TestResponseModel>
}